package kr.co.green.common;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	   //   DB 연결
	   private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	   private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";  // 데이터베이스 주소 : 포트번호 (1521 : 오라클의 포트번호)    
	   private static final String USER = "webadmin";
	   private static final String PWD = "qwer1234!";
	   private Connection con;
	   
	   // DB 연결해주는 메서드
	   public Connection connDB() {
	      try {
	         Class.forName(DRIVER); // ODJBC
	         con = DriverManager.getConnection(URL, USER, PWD); // 데이터베이스 연결에 필요한 객체 생성
	         return con;
	      } catch (Exception e) {
	         e.printStackTrace();
	         return null;
	      }
	   }
	}
