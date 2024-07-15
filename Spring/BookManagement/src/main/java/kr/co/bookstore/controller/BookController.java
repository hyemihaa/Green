package kr.co.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.bookstore.model.dto.BookDto;
import kr.co.bookstore.model.service.BookServiceImpl;


@RestController
@RequestMapping("/books")
public class BookController {
	private final BookServiceImpl bookService;
	
	@Autowired
	public BookController(BookServiceImpl bookService) {
		this.bookService = bookService;
	}
	
	// 전체 목록 조회
	@GetMapping
	public ResponseEntity<List<BookDto>> bookList() {
		// 1. 서비스 호출
		List<BookDto> list = bookService.bookInfo();
		
		// 2. 받아온 리스트 API로 번환
		return new ResponseEntity<>(list ,HttpStatus.OK);
	}
	
	// 특정 도서 조회
	@GetMapping("/search/{bookTitle}")
	public ResponseEntity<BookDto> bookSearch(@PathVariable("bookTitle") String bookTitle) {
		// 1. 서비스 호출 (인자값 : bookTitle)
		BookDto book = bookService.searchBook(bookTitle);
		
		// 2. 받아온 데이터 API로 반환
		return new ResponseEntity<>(book ,HttpStatus.OK);
	}
	
	// 도서 대여
	@PostMapping("/borrow/{title}")
	public ResponseEntity<String> bookBorrow(@PathVariable("title") String title) {
		// 1. 서비스호출 (인자값 : title)
		int bookResult = bookService.bookBorrow(title);
		
		HttpHeaders httpHeader = new HttpHeaders();
		httpHeader.add("Content-Type", "application/json; charset=UTF-8");
		
		// 2. 받아온 데이터를 따라서 "책이름 + 대여가 완료 되었습니다." 반환
		System.out.println("컨트롤러");
		if(bookResult == 1) {
			String msg = title + "대여가 완료 되었습니다.";
			return new ResponseEntity<>(msg ,httpHeader, HttpStatus.OK); // 컨트롤러에서 -> api보낼때 HTTP 헤더에 인코딩을 해줘야 한글이 깨지지 않는다
		}																 // 다른 방법으로는 api에서 한글을 써서 보내면 된다
		else {
			String msg = title + "대여가 실패 되었습니다.";
			return new ResponseEntity<>(msg ,httpHeader, HttpStatus.OK);
		}
		
		
	}
	
//	@PutMapping("/return/{returnTitle}")
//	public ResponseEntity<String> bookReturn(@PathVariable("returnTitle") String returnTitle) {
//		int result = bookService.returnBook(returnTitle);
//		// 실패일 때 로직 처리해야함
//		
//		return new ResponseEntity<>("success", HttpStatus.OK);
//	}
//	
}
