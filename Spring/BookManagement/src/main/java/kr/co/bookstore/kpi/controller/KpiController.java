package kr.co.bookstore.kpi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.bookstore.kpi.model.dto.KpiDto;
import kr.co.bookstore.kpi.model.service.KpiServiceImpl;



@RestController
@RequestMapping("/kpi")
public class KpiController {
	private final KpiServiceImpl kpiService;
	
	@Autowired
	public KpiController(KpiServiceImpl kpiService) {
		this.kpiService = kpiService;
	}
	
	@GetMapping("/list.do")
	public String kpiList(Model modle) {
		List<KpiDto> list = kpiService.kpiList();
		
		modle.addAttribute("list",list);
		
		return "/home2";
	}
	
	@GetMapping("/{mainKpi}")
	public ResponseEntity<KpiDto> kpiList(@PathVariable("mainKpi") int mainKpi) {
		KpiDto kpi = kpiService.searchKpi(mainKpi);
		
		return new ResponseEntity<>(kpi, HttpStatus.OK);
	}
}
