package kr.co.green.member.model.service;

import kr.co.green.member.model.dto.Member;
// Model-service : controller와 DAO사이에 존재 
// -> 비즈니스 로직 처리 (회원가입에 필요한 작업 -> 로그인, 회원가입, 중복검사, 유효성검사) 
// 굳이 따로 인터페이스를 만드는 이유 -> 또다른 회원가입 페이지를 만들때도 이 작업은 동일하므로 -> 재사용!

public interface MemberService { // 추상메서드
	// 회원가입
	public int register(Member member); // 매개변수 : 참조변수(member객체)
	
	// 로그인
	public Member login(Member member);
	
	// 중복검사
	public int duplicateId(String id);
	
	// 암호화된 패스워드
	public Member getHashPassword(String id);
	
	
}
