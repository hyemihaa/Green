package kr.co.green.board.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
		
		PageInfo pi = Pagination.getPageInfo(listCount, cpage, pageLimit, boardLimit); // 객체를 따로 생성하지 않아도 사용이 가능한 이유 => static,
		
		
		List<NewsDto> list = newsService.newsList(newsDto, pi);
		
		model.addAttribute("row", row); // 객체 바인딩
		model.addAttribute("pi", pi); // 객체 바인딩
		model.addAttribute("list", list);
		
		return "board/news/newsList"; 
	}
	
	@GetMapping("/detail.do")
	public String newsDetail(NewsDto newsDto, Model model) {
		NewsDto result = newsService.getDetail(newsDto);
		
		if(!Objects.isNull(result)) { // result가 NULL이 아닐 때 
			model.addAttribute("result", result); // 데이터 바인딩
			
			return "board/news/newsDetail";
		}
		else { // NULL일 때 에러페이지로 이동 
			return "common/error";
		}
		
	}
	
}
