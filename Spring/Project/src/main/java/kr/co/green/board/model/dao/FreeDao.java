package kr.co.green.board.model.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.green.board.model.dto.BoardDto;
import kr.co.green.common.pageing.PageInfo;

@Repository // dao로 사용한다고 알려주는 어노테이션
public class FreeDao {

	private final SqlSessionTemplate sqlSession;
	
	@Autowired
	public FreeDao(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public List<BoardDto> freeList(PageInfo pi, BoardDto free) {
		// RowBounds : 작은 규모일 때 사용 권장, 성능이 안좋음
		RowBounds rb = new RowBounds(pi.getOffset(), pi.getBoardLimit());
		return sqlSession.selectList("freeMapper.freeList", free, rb); // free-mapper.xml에서 쿼리문 작성
	}

	public int getListCount(BoardDto free) { //getListCount(BoardDto free, String mapperNameSpace) --> 이런식으로 매개변수를 줘서 Dao를 여러개 만들 필요 없다.
		return sqlSession.selectOne("freeMapper.getListCount", free); // select 했을 때 결과값이 1개이므로 selectOne 
	}

	public BoardDto getDetail(BoardDto free) {
		return sqlSession.selectOne("freeMapper.getDetail", free); // 결과값이 1개이므로 selectOne
	}

	public int addViews(BoardDto free) {
		return sqlSession.update("freeMapper.addViews", free);
	}

	public int enroll(BoardDto free) {
		return sqlSession.insert("freeMapper.enroll", free);
	}

}
