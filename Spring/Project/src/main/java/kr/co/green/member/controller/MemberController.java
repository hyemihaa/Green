package kr.co.green.member.controller;

import java.util.Objects;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.co.green.member.api.MemberApi2;
import kr.co.green.member.model.dto.MemberDto;
import kr.co.green.member.model.service.MemberServiceImpl;

// /member/register.do

@RestController
@RequestMapping("/member")
public class MemberController {
	private static final Logger logger = LogManager.getLogger(MemberController.class);
	private final MemberServiceImpl memberService;

	
	@Autowired
	public MemberController(MemberServiceImpl memberService) {
		this.memberService = memberService;

	}
	
	@GetMapping("/registerForm.do")
	public String getRegisterForm() {
		return "member/register";
	}
	
	
	@GetMapping("/check-duplicate/{id}")
	public ResponseEntity<MemberDto> getCheckId(@PathVariable("id") String id) {
		logger.info("/member/check-duplicate/" + id + " Service 요청받음");
		
		int result = memberService.getCheckId(id);
		
		MemberDto member = new MemberDto();
		member.setMemberNo(result);
		member.setMemberId(id);
		
		if(result == 1) {
			return new ResponseEntity<>(member, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(member, HttpStatus.OK);
		}
	}
	
	
	
//	@PostMapping("/checkId.do")
//	@ResponseBody // 응답 데이터에 바로 보내줌 (ajax요청) , ViewResolver 실행 X
//	public String getCheckId(String memberId) {
//		// 아이디 중복 검사
//		int result = memberService.getCheckId(memberId);
////		
////		if(result == 1) { // 사용 불가
////			return "false";
////		}
////		else { // 사용 가능
////			return "true";
////		}
//		
//		return intReturn(result, "false", "true");
//	}
//	
	@RequestMapping("/register.do")
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
	public String login(MemberDto member, HttpSession session, RedirectAttributes redirectAttributes) {
		//Spring Security + JWT (실무에서 많이 쓰이는 방식) --> 파이널때 써보길!
		
		// select 8 from member where m_id = #{memberId}
		// 아이디가 일치하는 회원의 정보를 Dto에 담아서 가져오기
		MemberDto loginUser = memberService.login(member);
		
		if(!Objects.isNull(loginUser)) { // 로그인 성공
			session.setAttribute("memberNo", loginUser.getMemberNo());
			session.setAttribute("memberType", loginUser.getMemberType());
			session.setAttribute("memberName", loginUser.getMemberName());
			
//			session.setAttribute("msg", "로그인 되었습니다.");
			
			// Controller -> Controller
			
			// RedirectAttributes : Controller에서 Controller로 데이터 전달할 때
			
			// addAttribute VS addFlashAttribute
			// 1. addAttribute : int, String 넘길 때 사용 -> 쿼리 파라미터로 전달
			// 2. addFlashAttribute : 객체를 넘기고 싶거나, 일회성 변수를 사용하고 싶을 때 -> 한번 사용 후 사라짐(휘발성데이터)
			redirectAttributes.addFlashAttribute("icon", "success");
			redirectAttributes.addFlashAttribute("title", "로그인성공!!!");
			redirectAttributes.addFlashAttribute("text", "로그인 되었습니다.");
			return "redirect:/free/list.do";
		}
		else {
			// Conrtroller -> Conrtroller
			redirectAttributes.addFlashAttribute("icon", "error");
			redirectAttributes.addFlashAttribute("title", "로그인실패!!!!");
			redirectAttributes.addFlashAttribute("text", "아이디 또는 비밀번호를 확인해주세요.");
			return "redirect:/member/loginForm.do";
		}
	}
	
	@GetMapping("/logout.do")
	public String logout(HttpServletRequest request) {
		// 현재 세션이 있으면 가져오기
		// 현재 세션이 없으면 null 반환
		HttpSession session = request.getSession(false);
		if(session != null) {
			session.invalidate();
		}
		return "home";
	}
	
	
}
