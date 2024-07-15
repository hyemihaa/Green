package kr.co.green.board.controller;


import java.util.List;
import java.util.Objects;

import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.co.green.board.model.dto.BoardDto;
import kr.co.green.board.model.service.FreeServiceImpl;
import kr.co.green.common.pageing.PageInfo;
import kr.co.green.common.pageing.Pagination;

// lombok : 자주 사용되는 메소드(getter, setter, toString, …)들을 어노테이션으로 선언하여 자동으로 코드를 작성해주는 자바 라이브러리

@Controller // 현재 클래스가 컨트롤러 역할
@RequestMapping("/free") // '/free'로 오는 요청을 받겠다. GET + POST 
public class FreeController {
	//1. 객체 생성 후 변경될 가능성이 있어서 사용을 권장하지 않음
//	@Autowired
//	private FreeServiceImpl freeService;
	
	private static final Logger logger = LogManager.getLogger(FreeController.class); // logger객체 생성
	
	//2. 생성자 주입 방식 (객체 생성할 때 이렇게 사용한다고 생각)
	private final FreeServiceImpl freeService; // final -> 불변성
	
	@Autowired
	public FreeController(FreeServiceImpl freeService) {
		this.freeService = freeService;
	}
	
	@GetMapping("/list.do") // '/list.do'로 오는 요청을 받겠다 (GET)
	public String freeList(Model model, 
						   @RequestParam(value="cpage", defaultValue="1") int cpage,
						   BoardDto free, HttpSession session) {
						// @RequestParam : 쿼리스트링을 받을 떄  value : 쿼리스트링 키
		
		logger.info("/free/List 호출 완료 : cpage={}, memberNo={}", cpage, session.getAttribute("memberNo"));
		
		//logger - 많이쓰이는 메서드 
		//debug : 어떤 변수를 확인하거나, 값이 잘 들어왔는지 확인
		//info : 게시글 조회 요청(boardNo=3)이 왔다, 게시글 등록이 완료 됐다
		//error : 예외발생, 게시글 등록이 실패했다, 사용자 검증 실패, 게시글 제목이 너무 길 때
		
		// 1.전체 게시글 수 구하기(페이징처리)
		int listCount = freeService.getListCount(free);
		int pageLimit = 5;
		int boardLimit = 5;
		int row = listCount - (cpage-1) * boardLimit;
		
		PageInfo pi = Pagination.getPageInfo(listCount, cpage, pageLimit, boardLimit); // 객체를 따로 생성하지 않아도 사용이 가능한 이유 => static,
																					   // 만약 static이 아니라면 위에서 추가해줘야 함 FreeServiceImpl얘 처럼
		List<BoardDto> list = freeService.freeList(pi, free); // free를 넘기는 이유는 사용자가 검색한 데이터만 가져오기 위해
		
		
		model.addAttribute("row", row); // 객체 바인딩
		model.addAttribute("pi", pi); // 객체 바인딩
		model.addAttribute("list", list); // 객체 바인딩
		
//		model.addAttribute("msg", session.getAttribute("msg")); // HttpSession매개변수 추가
//		session.removeAttribute("msg");
		
		// ViewResolver(servlet-context.xml)
		// prefix : /WEB-INF/views
		// suffix : .jsp
		logger.debug("호출된 게시글 : list size={}", list.size());
		return "board/free/freeList";  // 반환 타입이 String일 경우 -> ViewResolves가 실행됨 
	}
	
	@GetMapping("/detail.do")                                        // HttpServletRequest request
	public String freeDetail(BoardDto free, Model model, HttpSession session) {
//		String referer = request.getHeader("referer");
//		System.out.println("referer" + referer);
//		
//		if(referer == null || !referer.endsWith("/list.do")) {
//			return "common/errer";
//		}
		logger.info("상세 조회 요청 : boardNo={}, memberNo={}", free.getBoardNo(), session.getAttribute("memberNo"));
		
		BoardDto result = freeService.getDetail(free, "detail");
		// 1. resources 이후의 문자열 가져오기
		// C:\\~~~\\resources\\uploads\\
		
		if(!Objects.isNull(result)) { // result가 NULL이 아닐 때 {
			if(result.getUploadPath() != null && result.getUploadName() != null) {
				int pathIndex = result.getUploadPath().lastIndexOf("resources");
				String path = "/" + result.getUploadPath().substring(pathIndex).replace("\\", "/");
				result.setUploadPath(path);
			}
			logger.debug("상세 조회 성공 : boardNo={}",free.getBoardNo() );
			model.addAttribute("result", result); // 데이터 바인딩
			model.addAttribute("loginMemberNo", session.getAttribute("memberNo"));
			
			return "board/free/freeDetail";
		}
		else { // NULL일 때 에러페이지로 이동 
			logger.error("상세 조회 실패 : 상세 조회 실패", free.getBoardNo() );
			return "common/error";
		}
	}
	
	
	@GetMapping("/enrollForm.do")
	public String freeEnroll(HttpSession session) {
		
		return "/board/free/freeEnroll";
	}
	
	@RequestMapping("/enroll.do")
	public String enroll(BoardDto free, MultipartFile upload,  HttpSession session, RedirectAttributes redirectAttributes) {
		free.setMemberNo((int)session.getAttribute("memberNo"));
		
		logger.info("[자유게시판] 게시글 등록 요청 : memberNo={}", free.getMemberNo() );
		int result = freeService.enroll(free, upload, session);
		
		if(result == 1) {
			redirectAttributes.addFlashAttribute("icon", "success");
			redirectAttributes.addFlashAttribute("title", "!!!등록성공!!!");
			redirectAttributes.addFlashAttribute("text", "게시글이 등록되었습니다.");
			
			logger.info("[자유게시판] 게시글 등록 성공 : boardNo={}", free.getBoardNo() );
			return "redirect:/free/list.do";
		}
		else {
			logger.error("[자유게시판] 게시글 등록 실패 : boardNo={}", free.getBoardNo() );
			return "common/error";
		}
	}
	
	@GetMapping("/delete.do") // 삭제할 게시물 번호, 게시물을 작성한 유저 (쿼리스트링으로 값을 넘김)
//	public String delete(int boardNo, int memberNo, HttpSession session) { 
	public String delete(int boardNo, int memberNo, @SessionAttribute("memberNo") int loginMemberNo, RedirectAttributes redirectAttributes) { 
		
		logger.info("게시글 삭제 요청 : memberNo{}",  memberNo);
//		if(memberNo == (int)session.getAttribute("memberNo")) {
//			int result = freeService.delete(boardNo, memberNo, session);
//		}
		// update
		// 30일 이내 복구 가능(스케줄러)
		int result = freeService.delete(boardNo, memberNo, loginMemberNo);
		
		if(result == 1) {
			redirectAttributes.addFlashAttribute("icon", "success");
			redirectAttributes.addFlashAttribute("title", "!!!삭제완료!!!");
			redirectAttributes.addFlashAttribute("text", "게시글이 삭제되었습니다");

			logger.info("[자유게시판] 게시글 삭제 성공 : boardNo={}",  boardNo);

			return "redirect:/free/list.do";
		}
		else {
			return "common/error";
		}
	}
	
	@RequestMapping("/editForm.do") //-> 수정페이지로 이동
	public String editForm(BoardDto free, Model model, HttpSession session) {
		BoardDto result = freeService.getDetail(free, "edit");
		
		if(!Objects.isNull(result)) { // result가 NULL이 아닐 때 {
			if(result.getUploadPath() != null && result.getUploadName() != null) {
				int pathIndex = result.getUploadPath().lastIndexOf("resources");
				String path = "/" + result.getUploadPath().substring(pathIndex).replace("\\", "/");
				result.setUploadPath(path);
			}
			model.addAttribute("result", result); // 데이터 바인딩
			model.addAttribute("loginMemberNo", session.getAttribute("memberNo"));
			
			return "board/free/freeEdit";
		}
		else { // NULL일 때 에러페이지로 이동 
			return "common/error";
		}
	}
	
	@RequestMapping("/edit.do") 
	public String edit(BoardDto free, MultipartFile upload, @SessionAttribute("memberNo") int loginMemberNo, RedirectAttributes redirectAttributes) {
		// 1. 사용자 검증
		// 2. 유효성 검사(데이터 길이) -> 제목 : 최대 300byte
		// 3. 제목,내용 update
		// 4. 업로드한 파일이 있을 때 : 기존 파일 삭제 -> 새로운 파일 업로드 (upload 테이블 update)
		// 5. 업로드한 파일이 없을 때 : 할거 없음
		logger.info("게시글 수정 요청: boardNo={}, loginMemberNo={}", free.getBoardNo(), loginMemberNo);
		int result = freeService.edit(free, upload, loginMemberNo);
		
		if(result == 1) {
			redirectAttributes.addFlashAttribute("icon", "success");
			redirectAttributes.addFlashAttribute("title", "성공!!!");
			redirectAttributes.addFlashAttribute("text", "게시글이 수정되었습니다");

			logger.info("[자유게시판] 게시글 수정 성공: boardNo={}", free.getBoardNo());

			return "redirect:/free/detail.do?boardNo="+free.getBoardNo();
		}
		else {
			return "common/error";
			
		}
	}
	
	
}
