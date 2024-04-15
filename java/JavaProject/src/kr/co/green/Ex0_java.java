package kr.co.green;

import java.util.Scanner;

public class Ex0_java {

	public static void main(String[] args) {
		
		System.out.println("Hello, World!");
		
		// <자료형> - 기본자료형(논리형,문자형,정수형,실수형)
		
		int varNum; // 변수 선언 (자료형 변수명;) : 내가 varNum이라는 변수를 사용할꺼다.
		varNum = 100; // 변수 초기화 : 변수에 값을 할당하는 과정, varNum이라는 변수에 숫자 100을 저장하겠다.
		
		// System.out.println : Console에 출력을 해주는 역할
		System.out.println(varNum);
		
		// 명시적 초기화 : 변수 선언과 초기화를 동시에 하는 것
		int expNum = 200; 
		System.out.println("명시적 초기화 : " + expNum);
						  
		long longNum = 123456789456123L; // 숫자 뒤에 영문자l(L) 붙여야 한다. (int와 구분하기 위해)
		
		// boolean(논리형) : true 또는 false
		boolean varBoolean;    // boolean varBoolean = true; (명시적초기화)
		varBoolean = true;
		System.out.println("boolean : " + varBoolean);
		
		// char : 문자(한 글자만 가능) - 'A', 'B', 'C', '가', '나'
		// "AB", "CD", "가나", "다라" : 문자열	
		char varChar;
		varChar = 'A';
		System.out.println("char : " + varChar);
		
		// 정수형 (byte,short,int,long) + 실수형 (float,double)
		byte varByte = 127;	
		 							   // float : 소수점 7자리
		float varFloat = 1.123123123f; // 실수형(float) 표현할 때 숫자뒤에 f를 붙여야 한다. f를 생략할 경우 - double로 나타냄
		System.out.println("float : " + varFloat);
		
		double varDouble = 1.123456789123456789;
		System.out.println("double : " + varDouble);
		
		
		// 참조자료형 = 참조형변수
		String str = "ABCDE";
		System.out.println("String : " + str);
		
//		 상수 : 단 한번만 저장되고 이후 변하지 않는 값 
//		 (대문자로 이루어진 스네이크 표기법을 사용 - ex)FINAL_NUMBER)
		final int FINAL_NUMBER = 10;
		System.out.println(FINAL_NUMBER);
		
		
		// <형변환> 
		//자동형변환 (범위가 작은 자료형 -> 범위가 큰 자료형)
		// byte의 메모리 크기는 1byte, int = 4byte
		byte bNum = 127;
		int iNum = bNum;
		System.out.println(iNum);

		int iNum2 =1234;  // int타입의 1234값을 double타입의 1234.0으로 변경
		double dNum2 = iNum2;
		System.out.println(iNum2);
		System.out.println(dNum2);
		
		// 강제형변환 (범위가 큰 자료형 -> 범위가 작은 자료형)
		// int : 4byte, double : 8byte
		double dNum3 = 1234.5678;
		int iNum3 = (int)dNum3;  // 강제형변환
		System.out.println(iNum3);
		
		// 작은 자료형(char : 2byte) -> 큰 자료형(int : 4byte)으로 가기 때문에 자동형변환
		char ch = 'a';  // 01100001 = 97 (아스키코드에서 소문자 a = 97)
		int num = ch;  
		
		System.out.println(num);

		
		//<Scanner Class> : 사용자로부터 입력을 받는 클래스
		// ctrl + shift + O 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
		
		System.out.println("내 나이는 : " + age);
		sc.nextLine();
		
		System.out.print("이름을 입력하세요: ");
		String name = sc.nextLine(); 

		System.out.print("내 이름은 : " + name);
		
	    System.out.print("내 이름은 : \n" + name + "\n");  // 개행문자(= 줄바꿈 \n)
	      
	    System.out.println("\"Hello, World\""); // \" 또는 \' -> 특수문자를 문자로 인식해야 할 때 사용 (특수문자 앞에 역슬래시)
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
