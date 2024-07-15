package kr.co.bookstore.api;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;

import kr.co.bookstore.model.dto.BookDto;


@RestController
@RequestMapping("/kpi")
public class BookApi {
	private static final Logger logger = LogManager.getLogger(BookApi.class);
	private static final String BASE_URL = "http://localhost/books"; // 컨트롤러로 전달시켜주는 URL
	private final RestTemplate restTemplate;
	private final Gson gson;
	
	@Autowired
	public BookApi(RestTemplate restTemplate, Gson gson) {
		this.restTemplate = restTemplate; // 스프링프레임워크안에 내장되어있지만 bean등록을 해줘야 한다
		this.gson = gson;
	}
	
	// 요청 : http://localhost/api/books --> jsp와 맵핑
	// 전체 목록 조회
	@GetMapping("/books") 
	public ResponseEntity<ResponseEntity<String>> bookList() {
		// 1. BookController로 GET요청
		// 2. 리스트 Ajax에게 반환
		ResponseEntity<String> response = restTemplate.getForEntity(BASE_URL, String.class); //String.class --> 반환 타입
//		String getBody = response.getBody();
//		
//		List resultBook = gson.fromJson(getBody, List.class);
		
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	// 특정 도서 조회
	@GetMapping("/books/{bookTitle}")
	public ResponseEntity<ResponseEntity<String>> bookSearch(@PathVariable("bookTitle") String bookTitle) {
		// 1. BookController로 GET요청(인자값 : bookTitle)
		String url = BASE_URL + "/search/" + bookTitle;
		
		ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
		// 2. 받아온 데이터를 Ajax에게 반환
//		HttpStatus getStatusCode = response.getStatusCode();
		
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@PostMapping("/books/{title}/borrow")
	public ResponseEntity<ResponseEntity<String>> bookBorrow(@PathVariable("title") String title) {
		String url = BASE_URL + "/borrow/" + title;
		
		System.out.println("api들어옴");
		ResponseEntity<String> response = restTemplate.postForEntity(url, null, String.class);
		
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@PutMapping("/books/{returnTitle}/return")
	public ResponseEntity<ResponseEntity<String>> bookReturn(@PathVariable("returnTitle") String returnTitle) {
		String url = BASE_URL + "/return/" + returnTitle;
		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.PUT, null, String.class); // put은 void타입이기 때문에 -> exchange를 사용
		
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
}

