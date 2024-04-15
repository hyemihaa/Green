package kr.co.organize;

public class Ex14_Generic {

	public static void main(String[] args) {
		// <제네릭>
		// 데이터 타입을 미리 정해두지 않고, 외부에서 사용할 때 
		// 데이터 타입을 지정해서 유동적으로 변경하는 방법
		// *컴파일 과정에서 데이터 타입을 체크
	}

	// <사용하는 방법>
	A<String> a = new A<>();
	
	class A<T> {
		public T var;
		
		public void method(T var2) {};
	}
	
	// 사용할 때 데이터타입의 자리에는 기본형 변수를 넣을 수 없음
	// 기본형 변수를 사용하고 싶을 때 래퍼클래스(Wrapper Class)를 사용
	// *Wrapper Class : 기본형변수를 참조형변수(객체)로 사용할 수 있도록 해주는 클래스
	
	// <래퍼클래스의 종류>
	// 기본형변수 			래퍼클래스
	// boolean			Boolean
	// char				*Character
	// byte				Byte
	// short			Short
	// int				*Integer
	// long				Long
	// float			Float
	// double			Double
	
	
	
	
	
	
}
