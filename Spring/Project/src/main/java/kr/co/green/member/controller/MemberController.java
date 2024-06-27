package kr.co.green.member.controller;

import java.util.Objects;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.green.member.model.dto.MemberDto;
import kr.co.green.member.model.service.MemberServiceImpl;

// /member/register.do

@Controller
@RequestMapping("/member")
public class MemberController {
	private final MemberServiceImpl memberService;

	
	@Autowired
	public MemberController(MemberServiceImpl memberService) {
		this.memberService = memberService;

	}
	
	@GetMapping("/registerForm.do")
	public String getRegisterForm() {
		return "member/register";
	}
	
	@PostMapping("/checkId.do")
	@ResponseBody // 응답 데이터에 바로 보내줌 (ajax요청) , ViewResolver 실행 X
	public String getCheckId(String memberId) {
		// 아이디 중복 검사
		int result = memberService.getCheckId(memberId);
//		
//		if(result == 1) { // 사용 불가
//			return "false";
//		}
//		else { // 사용 가능
//			return "true";
//		}
		
		return intReturn(result, "false", "true");
	}
	
	@PostMapping("/register.do")
	public String setRegister(MemberDto member) {
		int result = memberService.setRegister(member);
		
//		if(result == 1) {
//			return "member/login";
//		}
//		else {
//			return "common/error";
//		}
		
		return intReturn(result, "member/login", "common/error");
	}
	
	private String intReturn(int result, String path, String errorPath) { // 중복 코드 제거하기 위한 메서드 
		if(result == 1) {
			return path;
		}
		else {
			return errorPath;
		}
	}
	
	@GetMapping("/loginForm.do")
	public String loginForm() {
		return "member/login";
	}
	
	
	@PostMapping("/login.do")
	public String login(MemberDto member, HttpSession session) {
		//Spring Security + JWT (실무에서 많이 쓰이는 방식) --> 파이널때 써보길!
		
		// select 8 from member where m_id = #{memberId}
		// 아이디가 일치하는 회원의 정보를 Dto에 담아서 가져오기
		MemberDto loginUser = memberService.login(member);
		
		if(!Objects.isNull(loginUser)) { // 로그인 성공
			session.setAttribute("memberNo", loginUser.getMemberNo());
			session.setAttribute("memberType", loginUser.getMemberType());
			session.setAttribute("memberName", loginUser.getMemberName());
			
			return "redirect:/free/list.do";
		}
		else {
			return "common/error";
		}
		
	}
}
