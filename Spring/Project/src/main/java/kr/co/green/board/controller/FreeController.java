package kr.co.green.board.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	//2. 생성자 주입 방식 (객체 생성할 때 이렇게 사용한다고 생각)
	private final FreeServiceImpl freeService; // final -> 불변성
	
	@Autowired
	public FreeController(FreeServiceImpl freeService) {
		this.freeService = freeService;
	}
	
	@GetMapping("/list.do") // '/list.do'로 오는 요청을 받겠다 (GET)
	public String freeList(Model model, 
						   @RequestParam(value="cpage", defaultValue="1") int cpage,
						   BoardDto free) {
						// @RequestParam : 쿼리스트링을 받을 떄  value : 쿼리스트링 키
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
		
		// ViewResolver(servlet-context.xml)
		// prefix : /WEB-INF/views
		// suffix : .jsp
		return "board/free/freeList";  // 반환 타입이 String일 경우 -> ViewResolves가 실행됨 
	}
	
	@GetMapping("/detail.do")
	public String freeDetail(BoardDto free, Model model) {
		BoardDto result = freeService.getDetail(free);
		
		if(!Objects.isNull(result)) { // result가 NULL이 아닐 때 
			model.addAttribute("result", result); // 데이터 바인딩
			
			return "board/free/freeDetail";
		}
		else { // NULL일 때 에러페이지로 이동 
			return "common/error";
		}
	}
}
