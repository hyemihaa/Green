package kr.co.test.model.service;

import kr.co.test.model.dto.MemberDto;

public interface MemberService {
	// 회원가입
	public int register(MemberDto memberDto);
}
