package kr.co.green.member.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import kr.co.green.common.DatabaseConnection;
import kr.co.green.member.model.dto.Member;

public class MemberDAO {
	private Connection con; 
	private DatabaseConnection dc;
	private PreparedStatement pstmt;
	
	public MemberDAO() {
		dc = new DatabaseConnection();
		con = dc.connDB();
	}
	
	//회원가입
	public int register(Member member) {
		String query = "insert into EXAMPLE_MEMBER VALUES(EXAMPLE_MEMBER_SEQ.nextval,?,?,?,?,default)";
		int result = 0;
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, member.getUserFirstName());
			pstmt.setString(2, member.getUserLastName());
			pstmt.setString(3, member.getUserEmail());
			pstmt.setString(4, member.getUserPwd());
			
			result = pstmt.executeUpdate();
			
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	public Member login(Member member) {
		Member result = new Member();
		
		try {
			pstmt = con.prepareStatement("SELECT M_NO, M_FIRST_NAME, M_LAST_NAME FROM EXAMPLE_MEMBER WHERE M_EMAIL = ? AND M_PWD = ?");
			pstmt.setString(1, member.getUserEmail());
			pstmt.setString(2, member.getUserPwd());
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int userNO = rs.getInt("M-NO");
				String userFirstName = rs.getString("M_FIRST_NAME");
				String userLastName = rs.getString("M_LAST_NAME");
				
				result.setUserNo(userNO);
				result.setUserFirstName(userFirstName);
				result.setUserLastName(userLastName);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	
	
	
	
	
	}
}


















