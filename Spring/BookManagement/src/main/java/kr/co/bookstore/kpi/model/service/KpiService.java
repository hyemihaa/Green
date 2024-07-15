package kr.co.bookstore.kpi.model.service;

import java.util.List;

import org.springframework.stereotype.Service;

import kr.co.bookstore.kpi.model.dto.KpiDto;

public interface KpiService {
	public List<KpiDto> kpiList();

	KpiDto searchKpi(int mainKpi);
}
