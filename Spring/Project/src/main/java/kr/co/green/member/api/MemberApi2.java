package kr.co.green.member.api;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;

import kr.co.green.member.model.dto.MemberDto;

@RestController
@RequestMapping("/api/member2")
public class MemberApi2 {
	private static final Logger logger = LogManager.getLogger(MemberApi2.class);
	private static final String BASE_URL = "http://localhost/member2"; // /member 컨트롤러로 전달시켜주는 URL
	private final RestTemplate restTemplate;
	private final Gson gson;
	
	public MemberApi2(RestTemplate restTemplate, Gson gson) { // servlet-context에 bean등록
		this.restTemplate = restTemplate;
		this.gson = gson;
	}
	
	// 요청 : http://localhost/api/member2/아이디
	// 중복 검사
	@GetMapping("/{id}")
	public ResponseEntity<?> getCheckId(@PathVariable("id") String id) {
		logger.info("/api/member2/" + id + " API 요청받음");
		
		String url = BASE_URL + "/check-duplicate/" + id;  // -> http://localhost/member/check-duplicate/아이디
		ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);  //getForEntity => HTTP method GET요청
		
		// Dto로 반환 시 JSON 형태로 들어옴
		String getBody = response.getBody();
		HttpStatus getStatusCode = response.getStatusCode();
		
		
		logger.debug("Response Stattus : " + getStatusCode); // HttpStatus.OK : 번호 (현재 200)
		logger.debug("Response Body : " + getBody); // result 값 1 or 0
		
		// JSON -> JAVA 객체로 변환
		MemberDto resultMember = gson.fromJson(getBody, MemberDto.class);
		logger.debug(resultMember.getMemberNo());
		logger.debug(resultMember.getMemberId());
		
		if(resultMember.getMemberNo() == 1 && getStatusCode == HttpStatus.OK) {
			return new ResponseEntity<>("false", HttpStatus.OK);
		}
		else if(resultMember.getMemberNo() == 0 && getStatusCode == HttpStatus.OK) {
			return new ResponseEntity<>("true", HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>("error", HttpStatus.SERVICE_UNAVAILABLE);
		}
	}
}
