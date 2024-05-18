package kr.co.green.board.medel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import kr.co.green.board.medel.dto.FreeDtoImpl;
import kr.co.green.common.DatabaseConnection;
import kr.co.green.common.PageInfo;

public class FreeDao {
	private Connection con; 
	private DatabaseConnection dc;
	private PreparedStatement pstmt;
	
	// 기본생성자 (DAO객체가 생성이 될때 연결)
	public FreeDao() {
		dc = new DatabaseConnection(); // 데이터베이스 객체 생성
		con = dc.connDB(); // 데이터베이스 연결정보를 con변수에 담음
	}
	public ArrayList<FreeDtoImpl> getList(PageInfo pi, String category, String searchText) {
		ArrayList<FreeDtoImpl> result = new ArrayList<>(); // 반환할 객체 생성
		String query = "SELECT * FROM FREE_BOARD fb "
					 + "JOIN MEMBER m ON m.M_NO = fb.M_NO " // 쿼리문 작성 join : memberName(작성자) 가져오기 위해
					 + "WHERE fb_delete_status = 'N' "
					 + "and " + category + " like '%' || ? || '%' " // -> % ? % : ?가 포함인 searchText
 					 + "ORDER BY fb_indate DESC "
					 + "OFFSET ? ROW FETCH FIRST ? ROWS ONLY"; 
		
		try {
			// 1. 쿼리 사용할 준비
			pstmt = con.prepareStatement(query);
//			pstmt.setString(1, category);
			pstmt.setString(1, searchText);
			pstmt.setInt(2, pi.getOffset());
			pstmt.setInt(3, pi.getBoardLimit());
			
			// 2. 쿼리 실행
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) { // 반복문을 통해서 컬럼의 값을 꺼냄(1행씩)
				int no = rs.getInt("FB_NO");
				String title = rs.getString("FB_TITlE");
				String content = rs.getString("FB_CONTENT");
				int views = rs.getInt("FB_VIEWS");
				String indate = rs.getString("FB_INDATE");
				int memberNo = rs.getInt("M_NO");
				String memberName = rs.getString("M_NAME");
				
				FreeDtoImpl freeDto = new FreeDtoImpl(); // while문이 돌때마다 새로운 객체 생성 -> while문 안에
				freeDto.setBoardNo(no);
				freeDto.setBoardTitle(title);
				freeDto.setBoardContent(content);
				freeDto.setBoardViews(views);
				freeDto.setBoardIndate(indate);
				freeDto.setMemberNo(memberNo);
				freeDto.setMemberName(memberName);
				
				result.add(freeDto); //add : 추가
			}
			
			pstmt.close();
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public int getListCount(String category, String searchText) { // 메서드구현
		String query = "SELECT count(*) AS cnt FROM free_board fb "
					 + "JOIN member m ON fb.m_no = m.m_no "
					 + "WHERE fb_delete_status = 'N' "
					 + "AND " + category + " LIKE '%' || ? || '%'" ; // 쿼리문 작성
		
		try {
			pstmt = con.prepareStatement(query); // 쿼리문 연결
//			pstmt.setString(1, category);
			pstmt.setString(1, searchText);
			
			ResultSet rs = pstmt.executeQuery(); // 쿼리문 실행한 결과가 rs변수에 담김
			
			while(rs.next()) {
				int result = rs.getInt("cnt"); // 별칭(AS cnt)으로 가져옴
				return result; // while문이 false가 되면 호출한 곳으로 돌아감(메서드 종료)
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return 0;
	}
	
	public int enroll(FreeDtoImpl freeDto) { // 게시글 삽입 쿼리문
		String query = "INSERT INTO free_board VALUES(free_board_seq.nextval, ?, ?, default, default, null, null, default, ?)";
		int result = 0;
		try {
			pstmt = con.prepareStatement(query); // 위의 쿼리문 저장 (con.연결)
			
			pstmt.setString(1, freeDto.getBoardTitle());
			pstmt.setString(2, freeDto.getBoardContent());
			pstmt.setInt(3, freeDto.getMemberNo());
			
			result = pstmt.executeUpdate();
			
			pstmt.close();
			con.close();
		
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		return result;
	}
	
	
	
	public FreeDtoImpl getDetail(int boardNo) {
//		1. 쿼리작성 (String변수)
		String query = "SELECT * FROM free_board "
					 + "WHERE FB_NO = ?";
				
//		2. pstmt에 쿼리를 사용할 준비
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, boardNo);
			
//		3. 쿼리 실행(반환값은  ResultSet)
			// * 반환값 int -> insert, delete, update
			// * 반환값 ResultSet -> select
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
//		4. 튜플에 있는 컬럼의 값 꺼내기 -> 게시글 번호, 제목, 작성자, 내용, 작성일, 조회수, 작성자
				int fbNO = rs.getInt("FB_NO");
				String fbTitle = rs.getString("FB_TITLE");
				String fbContent = rs.getString("FB_CONTENT");
				String fbDate = rs.getString("FB_INDATE");
				int fbViews = rs.getInt("FB_VIEWS");
				int mNo = rs.getInt("M_NO");
				
				FreeDtoImpl freeDto = new FreeDtoImpl();
				freeDto.setBoardNo(fbNO);
				freeDto.setBoardTitle(fbTitle);
				freeDto.setBoardContent(fbContent);
				freeDto.setBoardIndate(fbDate);
				freeDto.setBoardViews(fbViews);
				freeDto.setMemberNo(mNo);
				
				return freeDto;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void getWriter(FreeDtoImpl freeDto) {
		String query = "SELECT M_NAME FROM MEMBER "
					 + "WHERE M_NO = ?";
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, freeDto.getMemberNo());
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String mName = rs.getString("M_NAME");
				
				freeDto.setMemberName(mName);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
				
	}
	
	public int setViews(int boardNo) {
		String query = "UPDATE free_board SET fb_views = fb_views + 1 "
					 + "WHERE fb_no = ?";
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, boardNo);
			
			int result = pstmt.executeUpdate();
			return result;
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int setEdit(FreeDtoImpl freeDto) {
//		1.String Query작성
		String query = "UPDATE free_board SET fb_title = ?, fb_content = ?, fb_update = sysdate "
					 + "WHERE fb_no = ?";
		try {
//			2. query 사용할 준비
			pstmt = con.prepareStatement(query);
			
//			2. query문 완성
			pstmt.setString(1, freeDto.getBoardTitle());
			pstmt.setString(2, freeDto.getBoardContent());
			pstmt.setInt(3, freeDto.getBoardNo());
			
//			3. query 실행
			int result = pstmt.executeUpdate();
			
			pstmt.close();
			con.close();
			
			return result;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
		
	}
	
	public int setDelete(FreeDtoImpl freeDto) {
		String query = "update free_board set fb_delete = sysdate, fb_delete_status = 'Y' "
					 + "where fb_no = ?";
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, freeDto.getBoardNo());
			
			int result = pstmt.executeUpdate();
			
			return result;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
}

// 1. 쿼리 작성 (MySQL 방식)
//MySQL offset 페이징
//String query = "SELECT fb_idx,"
//   + "            fb_title,"
//   + "            fb_in_date,"
//   + "            fb_views,"
//   + "            fb_writer"
//   + "      FROM free_board"
//   + "      LIMIT ? OFFSET ?";

//MySQL cursor 페이징 (가져오는 페이지를 직접 조건을 줘서 지정)
//String query = "SELECT fb_idx,"
//   + "            fb_title,"
//   + "            fb_in_date,"
//   + "            fb_views,"
//   + "            fb_writer"
//   + "      FROM free_board"
//   + "      WHERE fb_idx > ? LIMIT ?"; (조건)
