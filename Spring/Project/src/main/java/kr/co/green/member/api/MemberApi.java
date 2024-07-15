package kr.co.green.member.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.green.member.model.dto.MemberDto;
import kr.co.green.member.model.service.MemberServiceImpl;

//Controller + ResponseBody
@RestController
@RequestMapping("/api/member")
public class MemberApi {
	private final MemberServiceImpl memberService;
	
	public MemberApi(MemberServiceImpl memberService) {
		this.memberService = memberService;
	}

	
	// 요청 : localhost/api/member/abc --> abc -> {id}변수에 저장  -> @PathVariable("id") id값에 abc 들어옴 -> String id에 저장
	@GetMapping("/{id}")
	public ResponseEntity getInfo(@PathVariable("id") String id, MemberDto member) {
		// id에 대한 회원을 조회하는 로직
		// 서비스 ~ Dao
		
		// 1. MemberService 생성자 주입
		// 2. MemberDto 타입으로 id가 일치하는 회원의 정보를 가져오기
		MemberDto result = memberService.getInfo(id);
		
		// 조회한 데이터를 반환
		return new ResponseEntity(result, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity deleteMember(@PathVariable("id") String id) {
		// 일치하는 id를 가진 회원 삭제
		
		int result = memberService.deleteMember(id);
		
		if(result == 1) {
			return new ResponseEntity("success", HttpStatus.OK);
		}
		else {
			return new ResponseEntity("faild", HttpStatus.OK);
		}
		
		
	}
	
	@PutMapping            
	public ResponseEntity editMember(@RequestBody MemberDto member) { 
		System.out.println("hi");
		System.out.println(member.getMemberId());
		System.out.println(member.getMemberName());
		System.out.println(member.getMemberPassword());
		
		return new ResponseEntity<>(null, HttpStatus.OK);
	}
}
