package kr.co.bookstore.kpi.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.bookstore.kpi.model.dto.KpiDto;

@Repository
public class KpiDao {
	private final SqlSessionTemplate sqlSession;
	
	@Autowired
	public KpiDao(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

	public List<KpiDto> kpiList() {
		return sqlSession.selectList("poolMapper.kpiList");
	}

	public KpiDto searchKpi(int mainKpi) {
		return sqlSession.selectOne("poolMapper.searchKpi", mainKpi);
	}

}
