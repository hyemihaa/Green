package kr.co.organize;

public class Ex5_object {

	public static void main(String[] args) {
		// 객체 지향 프로그래밍(OOP)
		// 핵심 4가지 : 캡슐화, 상속, 추상화, 다형성
		
		Person.email = "aaaa@naver.com";
		System.out.println(Person.email); // ---> 객체생성(인스턴스화) 하지 않은 상태
		
		// 클래스 : 설계도(틀)
		// 필드 + 메서드 모아놓은 것 = 클래스
		// public class가 있다면 파일의 이름과 동일해야 함(대소문자 구별)
		
		
		// 메서드 : 정의된 동작 또는 기능을 수행함 (행위)
		// [접근제어자] [예약어] 반환타입 메소드이름(테이터타입 변수명){
		}
		public void printTest(String str) {
			// 실행할 코드(=구현부)
		}
		
		
		// <반환>
		// 메소드 실행 후 어떠한 결과 값을 호출한 곳으로 되돌려줌(반환시킴)
		// return 반환값;
		
		
		// <반환타입>
		// void : 반환 값 없음(return 작성 X) 
		// 그 외 반환값이 있다면 return 필수
		// ex) int, boolean, string, int[], ...
		
		
		// <매개변수>
		// 메소드 호출 시 입력된 인자 값을 전달받는 공간
		// ex) m.method(10) ---> 인자값 = 10 
		// 	   public void method(int num) {} --> int num - 매개변수
		// * 호출할 때 인자 값의 데이터 타입과 매개변수의 데이터 타입이 반드시 일치해야함
		// 인자값이 정수라면 int, 문자열이라면 string, ...
		
		
		// <오버로딩>********
		// 1. 같은 이름의 메소드를 여러개 만듦
		// 2. 매개변수 부분이 다름 -> 매개변수의 개수, 데이터 타입, 데이터 타입의 위치
		
		// 매개변수의 개수가 다른 경우
		public void var(int num1) {}
		public void var(int num1, int num2, int num3) {}
		
		// 데이터 타입이 다른 경우
		public void var(int num1, int num) {}
		public void var(String str) {}
		
		// 데이터 타입의 위치가 다른 경우
		public void var(int num1, String str) {}
		public void var(String str, int num1) {}
		
		
		// <객체 생성 ( = 인스턴스화) >
		// 클래스명 변수명 = new 클래스명();
		// 위 처럼 작성하는걸 객체 생성 또는 인스턴스화라고 부름
		// 인스턴스 : 객체가 메모리에 올라간 상태
		
		
		// <필드>
		// 클래스, 메소드의 변수(속성)
		// 클래스영역(메소드 밖)에 있는 변수는 멤버변수라고 함
		// - 인스턴스 변수, 클래스 변수 두 가지로 나눠짐
		// - static이 붙으면 클래스 변수, static이 없으면 인스턴스 변수
		
		// 참고 : 멤버변수는 같은 클래스에 있는 모든 메소드에 접근이 가능( = 전역변수)
		class A{
			int num; // 인스턴스 변수 (멤버변수=전역변수)
			static String str; //클래스 변수(멤버변수=전역변수)
			
			public void methodA() {
				num = 10; //멤버변수사용(= 전역변수)
			}
			
			public void methodB() {
				num = 20;
			}
			
			public void methodC() {
				int num = 30; // 지역변수
				
				if(true) {
					int num2 = 50; // 지역변수
				}
			}
			
		}
		
		
		// static이 붙은 변수(클래스변수)는 클래스명.변수명 사용을 권장
		
		// 메소드영역(메소드 안)에 있는 변수를 지역변수라고 부름
		// 지역변수는 메소드, if, for와 같이 블럭{}을 기준으로 영역을 가짐
		
		
	
}


	class Person {
		public static String email;
	}
	
	
	
	



