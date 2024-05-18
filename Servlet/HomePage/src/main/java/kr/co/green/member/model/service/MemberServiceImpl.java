package kr.co.green.member.model.service;

import kr.co.green.member.model.dao.MemberDAO;
import kr.co.green.member.model.dto.Member;
// Service 클래스 : 사용자의 요청을 처리하는 기능을 제공
// DAO 클래스를 통해서 DB연동을 처리 (가입 신청 처리, 글 목록 제공, ...기능을 수행)

public class MemberServiceImpl implements MemberService{
	private MemberDAO memberDAO; 
	
	public MemberServiceImpl() { 
		memberDAO = new MemberDAO(); // SQL 작업공간		
	}
	
	@Override 
	public int register(Member member) { // MemberService클래스의 추상메서드 구현
		return memberDAO.register(member);
	}
	
	@Override 
	public Member login(Member member) {
		return memberDAO.login(member);
	}
	
	// 중복검사
	@Override 
	public int duplicateId(String id) {
		return memberDAO.duplicateId(id);
	}
	
	// 암호화된 패스워드
	@Override 
	public Member getHashPassword(String id) {
		return memberDAO.getHashPassword(id);
	}
	
}
