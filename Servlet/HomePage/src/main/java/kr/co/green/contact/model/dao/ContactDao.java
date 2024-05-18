package kr.co.green.contact.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import kr.co.green.common.DatabaseConnection;
import kr.co.green.common.PageInfo;
import kr.co.green.contact.model.dto.ContactDto;

public class ContactDao {
	private Connection con; 
	private DatabaseConnection dc;
	private PreparedStatement pstmt;
	
	// 기본생성자 (DAO객체가 생성이 될때 연결)
	public ContactDao() {
		dc = new DatabaseConnection(); // 데이터베이스 객체 생성
		con = dc.connDB(); // 데이터베이스 연결정보를 con변수에 담음
	}

	public int enroll(ContactDto contactDto) {                  // name, message, email, m_no
		String query = "INSERT INTO contact VALUES(contact_seq.nextval, ?, ?, ?, DEFAULT, DEFAULT, ?)";
		
		int result = 0;
		
		try {
			pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, contactDto.getName());
			pstmt.setString(2, contactDto.getMessage());
			pstmt.setString(3, contactDto.getEmail());
			pstmt.setInt(4, contactDto.getMemberNo());
			
			result = pstmt.executeUpdate();
			
			pstmt.close();
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public ArrayList<ContactDto> getList(PageInfo pi) {
		ArrayList<ContactDto> result = new ArrayList<>();
		String query = "select * from contact c "
					 + "order by c_indate DESC "
					 + "offset ? row fetch first ? rows only";
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, pi.getOffset());
			pstmt.setInt(2, pi.getBoardLimit());
			
			// 쿼리실행
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int no = rs.getInt("c_no");
				String name = rs.getString("c_name");
				String message = rs.getString("c_message");
				String email = rs.getString("c_email");
				String indate = rs.getString("c_indate");
				int memberNo = rs.getInt("m_no");
				String answerStatus = rs.getString("c_answer_status");
				
				ContactDto contactDto = new ContactDto();
				contactDto.setNo(no);
				contactDto.setName(name);
				contactDto.setMessage(message);
				contactDto.setEmail(email);
				contactDto.setIndate(indate);
				contactDto.setMemberNo(memberNo);
				contactDto.setAnswerStatus(answerStatus);
				
				result.add(contactDto);
			}
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	//전체 연락내역(문의글) 수
	public int getListCount() {
		String query = "select count(*) as cnt from contact";
		
		try {
			pstmt = con.prepareStatement(query);
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
	
	//연락 내역 상세보기
	public ContactDto getDetail(int no) {
		//쿼리작성
		String query = "select * from contact where c_no = ?";
		
		//쿼리 사용할 준비
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, no);
			
			// 쿼리 실행
			ResultSet rs = pstmt.executeQuery();
			
			// 튜플에 있는 컬럼값 꺼내기 -> 문의 번호, 문의 이름, 문의 내용, 문의 이메일, 문의 작성일, 작성자
			while(rs.next()) {
				int cNo = rs.getInt("c_no");
				String cName = rs.getString("c_name");
				String cMessage = rs.getString("c_message");
				String cEmail = rs.getString("c_email");
				String cIndate = rs.getString("c_indate");
				String cAnswerStatus = rs.getString("c_answer_status");
				
				ContactDto contactDto = new ContactDto();
				contactDto.setNo(cNo);
				contactDto.setName(cName);
				contactDto.setMessage(cMessage);
				contactDto.setEmail(cEmail);
				contactDto.setIndate(cIndate);
				contactDto.setAnswerStatus(cAnswerStatus);
				
				return contactDto;
			}
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	// // 연락내역 답변
	public int setAnswer(ContactDto contactDto) {
		String query = "INSERT INTO contact_answer VALUES(contact_answer_seq.nextval, ?, default, ?, ?)";
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, contactDto.getAnswerContent());
			pstmt.setInt(2, contactDto.getMemberNo());
			pstmt.setInt(3, contactDto.getNo());
			
			int result = pstmt.executeUpdate();
			
			return result;
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int setAnswerUpdate(int no) {
		String query = "UPDATE contact SET c_answer_status = 'Y' WHERE c_no = ?";
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, no);
			
			int result = pstmt.executeUpdate();
			return result;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return 0;
	}
	
	public int cDelete(int no) { // 부모 c_no 테이블
		String query = "delete from contact where c_no = ?";
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, no);
			
			int result = pstmt.executeUpdate();
			return result;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int caDelete(int no) { // 자식 c_no 테이블
		String query = "delete from contact_answer where c_no = ?";
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, no);
			
			int result = pstmt.executeUpdate();
			return result;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
//	int rs = pstmt.executeUpdate(); // 데이터 타입이 int이면 업데이트로 사용 가능

}
