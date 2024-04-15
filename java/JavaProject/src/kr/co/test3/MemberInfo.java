package kr.co.test3;

import java.util.Scanner;
//7번 문제
public class MemberInfo {
	// 메인 메서드
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디를 입력하세요 : ");
		String inputId = sc.nextLine();
		
		System.out.print("비밀번호를 입력하세요 : ");
		String inputPw = sc.nextLine();
		
		//객체생성
		Login info = new Login();
		
		//메소드 호출
		String result = info.login(inputId, inputPw);
		
		System.out.println(result);
	} //메인 메서드 끝
	
}

//LoginInterface 인터페이스를 생성
interface LoginInterface{
	public String login(String inputId, String inputPw);
}



// Login클래스 생성 -> 멤버변수 memberId = "id" , memberPwd = "qwer1234" 를 갖습니다.
class Login implements LoginInterface {
	String memberId = "id";
	String memberPwd  = "qwer1234";
	
	@Override
	public String login(String inputId, String inputPw) {
		if(memberId.equals(inputId) && memberPwd.equals(inputPw)) {
			return "로그인 되었습니다.";
		}
		else if(memberId.equals(inputId) && memberPwd.equals(inputPw)) {
			return "아이디가 틀렸습니다.";
		}
		else if(memberId.equals(inputId) && memberPwd.equals(inputPw)) {
			return "비밀번호가 틀렸습니다.";
		}
		else {
			return "다시 확인바랍니다.";
		}
	}
	
	
	
	
	
	
}