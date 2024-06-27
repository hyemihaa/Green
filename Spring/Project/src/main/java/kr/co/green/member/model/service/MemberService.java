package kr.co.green.member.model.service;

import kr.co.green.member.model.dto.MemberDto;

public interface MemberService {
	// 아이디 중복체크
	public int getCheckId(String memberId);
	
	public int setRegister(MemberDto member);
	
	public MemberDto login(MemberDto member);
}
