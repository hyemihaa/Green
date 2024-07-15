package kr.co.green.board.model.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.green.board.model.dto.BoardDto;
import kr.co.green.board.model.dto.NewsDto;
import kr.co.green.common.pageing.PageInfo;

@Repository
public class NewsDao {

	private final SqlSessionTemplate sqlSession;
	
	@Autowired
	public NewsDao(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public List<NewsDto> newsList(NewsDto newsDto, PageInfo pi) {
		RowBounds rb = new RowBounds(pi.getOffset(), pi.getBoardLimit());
		return sqlSession.selectList("newsMapper.newsList", newsDto, rb);
	}
	
	public int getListCount(NewsDto newsDto) {
		return sqlSession.selectOne("newsMapper.getListCount", newsDto); 
	}

	public int addViews(NewsDto newsDto) {
		return sqlSession.update("newsMapper.addViews", newsDto);
	}

	public NewsDto getDetail(NewsDto newsDto) {
		return sqlSession.selectOne("newsMapper.getDetail", newsDto);
	}

	public int enroll(NewsDto newsDto) {
		return sqlSession.insert("newsMapper.enroll", newsDto);
	}

	public int setUpload(NewsDto newsDto) {
		return sqlSession.insert("newsMapper.setUpload", newsDto);
	}

	public int edit(NewsDto newsDto) {
		return sqlSession.update("newsMapper.edit", newsDto);
	}

	public NewsDto getFileName(int boardNo) {
		return sqlSession.selectOne("newsMapper.getFileName", boardNo);
	}

	public int setUploadUpdate(NewsDto newsDto) {
		return sqlSession.update("newsMapper.setUploadUpdate", newsDto);
	}
	
	public int newsDelete(int boardNo) {
		return sqlSession.update("newsMapper.newsDelete", boardNo);
	}
}
