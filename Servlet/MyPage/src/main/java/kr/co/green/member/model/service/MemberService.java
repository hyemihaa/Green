package kr.co.green.member.model.service;

import kr.co.green.member.model.dto.Member;

public interface MemberService { // 인터페이스 -> 추상메서드 생성
	//회원가입
	public int register(Member member); 
		
	// 로그인
	public Member login(Member member); // 멤버클래스를 참조변수로 받음
		
	
}
