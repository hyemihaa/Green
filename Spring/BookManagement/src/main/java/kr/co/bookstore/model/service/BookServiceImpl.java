package kr.co.bookstore.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.bookstore.model.dao.BookDao;
import kr.co.bookstore.model.dto.BookDto;

@Service
public class BookServiceImpl implements BookService{
	
	private final BookDao bookDao; 

	@Autowired
	public BookServiceImpl(BookDao bookDao) {
		this.bookDao = bookDao;
	}
	
	@Override
	public List<BookDto> bookInfo() {
		return bookDao.bookInfo();
	}

	@Override
	public BookDto searchBook(String bookTitle) {
		return bookDao.searchBook(bookTitle);
	}

	@Override
	public int bookBorrow(String title) {
		// 1. 해당 도서가 대여 상태인지 아닌지 확인(select)
		int borrwoCheck = bookDao.borrowCheck(title);
		int borrowUpdate = bookDao.borrowUpdate(title);
		
		if(borrwoCheck == 1 && borrowUpdate == 1) {
			// 1-1. 1.의 상태가 대여가 아니라면 status를 update
			// 2. status를 update했다면 borrow_records테이블에 insert
			return bookDao.bookBorrow(bookDao.borrowSelectId(title));
		}
		// 1-2. 대여 상태라면 0반환
		else {
			return 0;
		}
	}

	@Override
	public int returnBook(String returnTitle) {
		// 1. 현재 대여상태인지, 반납상태인지 확인
		//	- books테이블의 status가 borrowed상테 인지 확인
		//	- borrow_recoreds 테이블의 returned_at이 null인지 확인
		BookDto checkStatus = bookDao.checkStatus(returnTitle);
		String status = checkStatus.getStatus();
		int id = checkStatus.getId();
		
		// borrow_records 테이블의 returned_at이 null인지 확인
		int checkReturnedAt = bookDao.checkReturnedAt(checkStatus.getId());
		
		if(status.equals("borrowed") && checkReturnedAt == 1) {
			// 2-1. 대여상태라면 -> 반납상태로 업데이트
			//		(borrow_recoreds 테이블의 returned_at 컬럼을 현재 시간으로 변경)
			int updateReturnedAt = bookDao.updateReturnedAt(id);
			
			// 2-2. 반납 상태 -> 대여가능 상태로 업데이트
			//		(books테이블의 status컬럼을 available상태로 변경
			int updateStatus = bookDao.updateStatus(id);
			
			if(updateReturnedAt == 1 && updateStatus == 1) { // 성공
				return 1;
			}
			else if (updateReturnedAt != 1 && updateStatus == 1) {
				// 반납 상태 업데이트 실패(return code : 100);
				return 100;
			}
			else if (updateReturnedAt == 1 && updateStatus == 0) {
				// 대여 가능 상태로 변경 실패(return code : 101);
				return 101;
			}
			else {
				// 그 외(둘 다 실패)(return code : 102)
				return 102;
			}
		
		}
		else if(status.equals("available") && checkReturnedAt == 0) {
			// 3. 반납이 된 상태라면 반납 실패(return code : 200)
			return 200;
		} 
		else { // (return code : 300)
			return 300;
		}

	}


}
