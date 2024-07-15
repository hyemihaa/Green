package kr.co.bookstore.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.bookstore.model.dto.BookDto;

@Repository
public class BookDao {
	
	private final SqlSessionTemplate sqlSession;
	
	@Autowired
	public BookDao(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	
	public List<BookDto> bookInfo() {
		return sqlSession.selectList("bookMapper.bookInfo");
	}


	public BookDto searchBook(String bookTitle) {
		return sqlSession.selectOne("bookMapper.searchBook", bookTitle);
	}


	public int borrowCheck(String title) {
		return sqlSession.selectOne("bookMapper.borrowCheck", title);
	}
	
	public int borrowUpdate(String title) {
		return sqlSession.update("bookMapper.borrowUpdate", title);
	}
	
	public int borrowSelectId(String title) {
		return sqlSession.selectOne("bookMapper.borrowSelectId", title);
	}
	
	
	public int bookBorrow(int borrowSelectId) {
		return sqlSession.insert("bookMapper.bookBorrow", borrowSelectId);
	}


	public BookDto checkStatus(String returnTitle) {
		return sqlSession.selectOne("bookMapper.checkStatus", returnTitle);
	}


	public int checkReturnedAt(int id) {
		return sqlSession.selectOne("bookMapper.checkReturnedAt", id);
	}


	public int updateReturnedAt(int id) {
		return sqlSession.update("bookMapper.updateReturnedAt", id);
	}

	public int updateStatus(int id) {
		return sqlSession.update("bookMapper.updateStatus", id);
	}

}
