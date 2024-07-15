package kr.co.green.board.controller;

import java.util.List;
import java.util.Objects;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.multipart.MultipartFile;

import kr.co.green.board.model.dto.BoardDto;
import kr.co.green.board.model.dto.NewsDto;
import kr.co.green.board.model.service.NewsServiceImpl;
import kr.co.green.common.pageing.PageInfo;
import kr.co.green.common.pageing.Pagination;

@Controller
@RequestMapping("/news")
public class NewsController {
	
	// NewsServiceImpl 객체 생성
	private final NewsServiceImpl newsService;
	
	@Autowired
	public NewsController(NewsServiceImpl newsService) {
		this.newsService = newsService;
	}
	
	@GetMapping("/list.do") // newsList페이지
	public String newsList(NewsDto newsDto, 
						   Model model, 
						   @RequestParam(value="cpage", defaultValue="1") int cpage) {
		// 1.전체 게시글 수 구하기(페이징처리)
		int listCount = newsService.getListCount(newsDto);
		int pageLimit = 5;
		int boardLimit = 6;
		int row = listCount - (cpage-1) * boardLimit;
		PageInfo pi = Pagination.getPageInfo(listCount, cpage, pageLimit, boardLimit); // 객체를 따로 생성하지 않아도 사용이 가능한 이유 => static
		List<NewsDto> list = newsService.newsList(newsDto, pi);
		
		for(NewsDto item : list) {
			if(!Objects.isNull(item)) { // result가 NULL이 아닐 때 {
				if(item.getUploadPath() != null && item.getUploadName() != null) {
					int pathIndex = item.getUploadPath().lastIndexOf("resources");
					String path = "/" + item.getUploadPath().substring(pathIndex).replace("\\", "/");
					item.setUploadPath(path);
				}
				else {
					item.setUploadPath(null);
				}
			}
		}
			
		model.addAttribute("row", row); // 객체 바인딩
		model.addAttribute("pi", pi); // 객체 바인딩
		model.addAttribute("list", list);
		
		return "board/news/newsList"; 
	}
	
	@GetMapping("/detail.do")
	public String newsDetail(NewsDto newsDto, Model model, HttpSession session) {
		NewsDto result = newsService.getDetail(newsDto, "detail");
		
		if(!Objects.isNull(result)) { // result가 NULL이 아닐 때 
			if(result.getUploadPath() != null && result.getUploadName() != null) {
				int pathIndex = result.getUploadPath().lastIndexOf("resources");
				
				String path = "/" + result.getUploadPath().substring(pathIndex).replace("\\", "/");
				result.setUploadPath(path);
			}
			model.addAttribute("result", result); // 데이터 바인딩
			model.addAttribute("loginMemberNo", session.getAttribute("memberNo")); // 데이터 바인딩
			
			
			return "board/news/newsDetail";
		}
		else { // NULL일 때 에러페이지로 이동 
			return "common/error";
		}
		
	}
	
	@GetMapping("/enrollForm.do")
	public String newsEnroll(HttpSession session) {
		return "/board/news/newsEnroll";
	}
	
	@PostMapping("/enroll.do")
	public String enroll(NewsDto newsDto, MultipartFile upload, HttpSession session) {
		//등록할때 이미지,제목,내용
		newsDto.setMemberNo((int)session.getAttribute("memberNo"));
		
		int result = newsService.enroll(newsDto, upload, session);
		
		if(result == 1) {
			return "redirect:/news/list.do";
		}
		else {
			return "common/error";
		}
	}
	
	@PostMapping("/editForm.do") //-> 수정페이지로 이동
	public String editForm(NewsDto newsDto, Model model, HttpSession session) {
		BoardDto result = newsService.getDetail(newsDto, "edit");
	
		
		if(!Objects.isNull(result)) { // result가 NULL이 아닐 때 {
			if(result.getUploadPath() != null && result.getUploadName() != null) {
				int pathIndex = result.getUploadPath().lastIndexOf("resources");
				String path = "/" + result.getUploadPath().substring(pathIndex).replace("\\", "/");
				result.setUploadPath(path);
			}
			model.addAttribute("result", result); // 데이터 바인딩
			model.addAttribute("loginMemberNo", session.getAttribute("memberNo"));
			
			return "board/news/newsEdit";
		}
		else { // NULL일 때 에러페이지로 이동 
			return "common/error";
		}
	}
	
	@PostMapping("/edit.do") 
	public String edit(NewsDto newsDto, MultipartFile upload, @SessionAttribute("memberNo") int loginMemberNo) {
		int result = newsService.edit(newsDto, upload, loginMemberNo);
		
		if(result == 1) {
			return "redirect:/news/detail.do?boardNo="+newsDto.getBoardNo();
		}
		else {
			return "common/error";
		}
	}
	
	
	@GetMapping("/delete.do") // 삭제할 게시물 번호, 게시물을 작성한 유저 (쿼리스트링으로 값을 넘김)
	public String delete(int boardNo, int memberNo, @SessionAttribute("memberNo") int loginMemberNo) { 
		
		// update
		// 30일 이내 복구 가능(스케줄러)
		int result = newsService.delete(boardNo, memberNo, loginMemberNo);
		
		if(result == 1) {
			return "redirect:/news/list.do";
		}
		else {
			return "common/error";
		}
	}
	
	
}
