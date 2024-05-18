package kr.co.green.member.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import kr.co.green.common.DatabaseConnection;
import kr.co.green.member.model.dto.Member;

// DAO(데이터 접근 객체 (Data Access Object)) : 데이터베이스 연결 및 쿼리 수행, 결과 반환 등의 작업 수행
// DAO 클래스 : DB와 관련된 CRUD 작업을 처리한다. 
// Service 클래스들은 데이터를 DB에서 읽어오거나 DB에 데이터를 저장할 때 DAO 클래스를 사용한다.


public class MemberDAO { 
	private Connection con; 
	private DatabaseConnection dc;
	private PreparedStatement pstmt;
	
	// 기본생성자 (DAO객체가 생성이 될때 연결)
	public MemberDAO() {
		dc = new DatabaseConnection(); // 데이터베이스 객체 생성
		con = dc.connDB(); // 데이터베이스 연결정보를 con변수에 담음
	}
	
	// 회원가입
	public int register(Member member) { 
		// 삽입 쿼리문 작성							 ? : member 값 (이름 아이디 패스워드)
		String query = "INSERT INTO member VALUES(member_seq.nextval,?,?,?,default, default)";
		int result = 0;
		
		//prepareStatement() 메서드 : 예외처리 필수
		try {
			// prepareStatement() :
			pstmt = con.prepareStatement(query); // 쿼리문 저장 (con -> 데이터베이스가 연결 되어있으므로 디비버에 쿼리문을 작성한것과 같은 상태)
//			pstmt.setString : 문자열(1 : 물음표 위치 , member.getUserName() : 가져올 값);
			pstmt.setString(1, member.getUserName());
			pstmt.setString(2, member.getUserId());
			pstmt.setString(3, member.getUserPwd());
			
			// executeUpdate() : 쿼리실행 (insert, delete, update) -> 성공한 행의 갯수 반환
			// -> 반환타입 int 
			result = pstmt.executeUpdate();
			
			// 객체종료 (사용한 순서의 역순(마지막실행)으로 종료)
			pstmt.close(); // 쿼리문 종료
			con.close(); // 데이터베이스 연결 끊김
		} catch (SQLException e) { 
			e.printStackTrace();
		}
		return result; // 쿼리실행 실패시 0 반환 
	}
	
	//로그인
	public Member login(Member member) { // 반환타입 멤버(객체)
		// 삽입 쿼리문 작성
			String query = "SELECT M_NO, M_NAME, M_TYPE FROM MEMBER"
					 	 + "  WHERE M_ID = ? "
						 + "  AND M_PWD = ?";
			Member result = new Member();
			
			try {
				pstmt = con.prepareStatement(query); // 쿼리문 저장
				pstmt.setString(1, member.getUserId()); 
				pstmt.setString(2, member.getUserPwd());
				
				//executeQuery() : 쿼리문 실행(SELECT 문) 결과를 ResultSet 객체로 반환한다. 
				//반환된 ResultSet(DB결과물 = 데이터) 객체를 통해 결과를 가져올 수 있다.
				ResultSet rs = pstmt.executeQuery();
				
				while(rs.next()) { // rs.next() -> 다음결과(=DB데이터 다음행이 있을경우)가 있으면 true, 없으면 false
					int userNo = rs.getInt("M_NO"); // 결과 컬럼을 가져온다 
					String userName = rs.getString("M_NAME");
					String userType = rs.getString("M_TYPE");
					
					result.setUserNo(userNo);
					result.setUserName(userName);
					result.setUserType(userType);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return result;
	}
	
	//중복검사
	public int duplicateId(String id) { 
		String query = "SELECT count(*) AS cnt FROM member where M_ID = ?";
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();

			
			while(rs.next()) {
				int result = rs.getInt("cnt");
				
				return result;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return 0;
	}
	
	public Member getHashPassword(String id) {
		String query = "SELECT M_PWD, M_NO, M_NAME, M_TYPE from member where m_id = ?";
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, id);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				int no = rs.getInt("m_no");
				String name = rs.getString("m_name");
				String hashPassword = rs.getString("m_pwd");
				String type = rs.getString("m_type");
				
				Member result = new Member();
				result.setUserNo(no);
				result.setUserName(name);
				result.setUserPwd(hashPassword);
				result.setUserType(type);
				
				return result;
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	
}
