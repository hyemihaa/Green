package kr.co.green.board.model.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
}
