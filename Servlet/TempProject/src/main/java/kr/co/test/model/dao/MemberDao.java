package kr.co.test.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import kr.co.test.common.DatabaseConnection;
import kr.co.test.model.dto.MemberDto;

public class MemberDao {
	private Connection con; 
	private DatabaseConnection dc;
	private PreparedStatement pstmt;
	
	public MemberDao() {
		dc = new DatabaseConnection(); // 데이터베이스 객체 생성
		con = dc.connDB(); // 데이터베이스 연결정보를 con변수에 담음
	}
	
	public int register(MemberDto memberDto) {    // 회원 번호, 이름 ,이메일(아이디), 비밀번호, 생일, 주소)
		String query = "INSERT INTO Users VALUES(users_seq.nextval,?,?,?,?,?)";
		
		// 기본생성자 (DAO객체가 생성이 될때 연결)
		try {
			pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, memberDto.getName());
			pstmt.setString(2, memberDto.getEmail());
			pstmt.setString(3, memberDto.getPassword());
			pstmt.setString(4, memberDto.getBirthdate());
			pstmt.setString(5, memberDto.getAddress());
			
			int result = pstmt.executeUpdate();
			return result;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
