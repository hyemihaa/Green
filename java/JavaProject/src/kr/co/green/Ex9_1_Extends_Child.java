package kr.co.green;

// ** 모든 클래스의 최고 조상은 Object 클래스
// 상속 표현식 : (public) class 클래스명 extends 상속받을클래스 {}

public class Ex9_1_Extends_Child extends Ex9_1_Extends_Parent {
	public String childVar = "자식변수";

	public void childMethod() {
		System.out.println("자식 클래스");
		String str1 = "a";
		String str2 = "b"; // 모든 클래스에 생략되어있음 -> 상속 -> 상속 
		str1.equals(str2); // object -> parent -> child
	}
	
	@Override // 오버라이딩 어노테이션 : 상위 타입(부모 타입)의 메서드를 재정의했음 (메서드에서만 사용)
	public void parentMethod() {
		System.out.println("오버라이딩된 메서드"); //구현부가 다르다
	}
	
	

	
}
