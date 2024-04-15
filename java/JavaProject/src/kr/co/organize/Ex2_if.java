package kr.co.organize;

public class Ex2_if {

	public static void main(String[] args) {
		
		// <조건문>
		// if문
		// 조건식이 만족할 때(true) 코드를 실행할 수 있도록 해주는 문법
		if(조건식1) {
			// 실행할 코드
		}
		else if(조건식2) {
			// 실행할 코드
		}
		else {
			// 위의 모든 조건식이 false일 때 실행할 코드
		}
		
		// switch문
		// 특정 숫자 또는 문자에 대한 값을 받을 때 주로 사용
		// 각각의 case에 break를 사용해야 함(필수X)
		// break를 사용하지 않을 경우 fall_through 발생
		switch(변수) {
		case 1 :
			// 변수의 숫자가 1일 때 실행할 코드
			//break
		case 2 :
			// 변수의 숫자가 2일 때 실행할 코드
			//break
		default :
			// 위의 case에 모두 만족하지 않을 때 실행할 코드 (if문의 else와 같음)
		}
		

		

	}

}
