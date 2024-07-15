package kr.co.bookstore.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter // getter 메서드 생성
@Setter // setter 메서드 생성
@NoArgsConstructor
public class BookDto {
	
	// books 테이블
	private int id; // 도서아이디
	private String bookTitle;
	private String bookAuthor;
	private String status;
	private String createDate;
	
	// borrow 테이블
	private int borrowId; // 
	private int borrowBookId; // 대여된 도서아이디
	private int userId; // 도서를 대여한 사용자 아이디
	private String borrowedDate; //도서가 대여된 날짜
	private String returnedDate; //도서가 반납된 날짜
}
