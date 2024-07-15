package kr.co.bookstore.model.service;

import java.util.List;

import org.springframework.stereotype.Service;

import kr.co.bookstore.model.dto.BookDto;

@Service
public interface BookService {
	// 전체 조회
	public List<BookDto> bookInfo();
	
	// 특정 도서 조회
	public BookDto searchBook(String bookTitle);
	
	// 도서 대여
	public int bookBorrow(String title);
	
	// 도서 반납
	public int returnBook(String returnTitle);
}

