package kr.co.bookstore.kpi.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.bookstore.kpi.model.dao.KpiDao;
import kr.co.bookstore.kpi.model.dto.KpiDto;

@Service
public class KpiServiceImpl implements KpiService {
	private final KpiDao kpiDao;
	
	@Autowired
	public KpiServiceImpl(KpiDao kpiDao) {
		this.kpiDao = kpiDao;
	}
	
	@Override
	public List<KpiDto> kpiList() {
		return kpiDao.kpiList();
	}

	@Override
	public KpiDto searchKpi(int mainKpi) {
		return kpiDao.searchKpi(mainKpi);
	}

}
