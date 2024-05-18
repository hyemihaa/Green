package kr.co.test.model.service;

import kr.co.test.model.dao.MemberDao;
import kr.co.test.model.dto.MemberDto;

public class MemberServiceImpl implements MemberService {
	MemberDao memberDao;
	
	public MemberServiceImpl() { 
		memberDao = new MemberDao(); // SQL 작업공간
		
	}
	
	// 회원가입
	public int register(MemberDto memberDto) {
		return memberDao.register(memberDto);
		
	}
}
