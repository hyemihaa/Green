package kr.co.green.member.model.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import kr.co.green.member.model.dao.MemberDao;
import kr.co.green.member.model.dto.MemberDto;

@Service
public class MemberServiceImpl implements MemberService {
	
	private final MemberDao memberDao;
	private final BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	public MemberServiceImpl(MemberDao memberDao, BCryptPasswordEncoder passwordEncoder) {
		this.memberDao = memberDao;
		this.passwordEncoder = passwordEncoder;
	}
	
	@Override
	public int getCheckId(String memberId) {
		return memberDao.getCheckId(memberId);
	}

	@Override
	public int setRegister(MemberDto member) {
		String name = member.getMemberName();
		String nameRegex = "^[가-힣]+$";
		
		if(name.matches(nameRegex)) {
			String password = passwordEncoder.encode(member.getMemberPassword()); // 패스워드 암호화
			member.setMemberPassword(password);
			return memberDao.setRegister(member);
		}
		else {
			return 0;
		}
		
	}
	
	@Override
	public MemberDto login(MemberDto member) {
		MemberDto result = memberDao.getInfo(member);
																	// 사용자가 입력한 패스워드 , 암호화된 패스워드 비교
		if(!Objects.isNull(result) && passwordEncoder.matches(member.getMemberPassword(), result.getMemberPassword())) {
			return result;
		}
		else {
			return null;
		}
	}
		
}
