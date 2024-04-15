package kr.co.green;

// 사람 설계도(틀)
public class Ex5_3_Object_Person {
	
	// 사람의 속성
	public String name ="하혜미"; //인스턴스 변수
	public int age = 19; //인스턴스 변수
	
	// 클래스 변수 -> 객체를 생성하지 않아도 바로 호출 가능
	public static String phone = "01012345678";
	
	
	 // 사람의 행위(기능)
	public void walk() { 
		System.out.println("걷는중");
	}
	
	public void run() {
		System.out.println("뛰는중");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
