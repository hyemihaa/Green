package kr.co.bookstore.kpi.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;


@RestController
@RequestMapping("/api/kpi")
public class KpiApi {
	private static final String BASE_URL = "http://localhost/kpi/";
	private final RestTemplate restTemplate;
	private final Gson gson;
	
	@Autowired
	public KpiApi(RestTemplate restTemplate, Gson gson) {
		this.restTemplate = restTemplate;
		this.gson = gson;
	}
	
	@GetMapping("/{mainKpi}")
	public ResponseEntity<ResponseEntity<String>> kpiList(@PathVariable("mainKpi") int mainKpi) {
		String url = BASE_URL + mainKpi;
		
		ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
		
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
}
