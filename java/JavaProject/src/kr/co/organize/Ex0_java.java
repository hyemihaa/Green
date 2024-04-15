package kr.co.organize;

public class Ex0_java {
	
	// 변수 : 어떠한 값을 저장하는 공간
	
	// 변수 선언 : 변수를 사용하기 위해 만드는 과정
	//          변수가 사용할 메모리 공간을 확보하는 과정
	// ex) 자료명 변수명;
	//     int num;
	//     boolean isTure;
	
	// 변수 초기화 : 변수에 값을 할당하는 과정
	// ex) 변수명 = 값(리터럴);
	//     num = 10;
	//     isTrue = true;
	// *변수 선언이 먼저 되어있어야 함
	
	// 명시적 초기화(선언 + 초기화)
	// ex) 자료형 변수명 = 값(리너럴);
	//	   int num1 = 20;
	
	// 상수 : 한번 값을 저장하면 이후에 변경할 수 없는 변수
	// 특징 : 변수명을 모두 대문자, 각각의 단어 사이에는 언더바(_) 사용
	// ex) final 자료명 변수명 = 값(리터럴);
	//     final int MEMBER_NUMBER = 10;
	
	// <기본형 변수>
	// 1. 논리형
	// boolean : 1byte의 크기를 가진 자료형(ture 또는 false)
	// * boolean이 1byte인 이유는 CPU가 메모리에 접근할 수 있는 최소 단위가 1byte이기 때문이다.
	
	// 2. 문자형
	// char : 문자 한글자를 표현, 값을 할당할 때 'A'와 같이 작은 따옴표로 문자를 감싸줘야 함 크기는 2byte
	
	// 3. 정수형
	// byte : 1byte의 크기를 가진 정수
	// short : 2byte의 크기를 가진 정수
	// int : 4byte의 크기를 가진 정수
	// long : 8byte의 크기를 가진 정수 (값 뒤에 L을 붙여줘야 함)
	
	// 4. 실수형
	// float : 4byte의 크기를 가진 실수 (소수점 7자리, 값 뒤에 f를 붙여줘야 함)
	// double : 8byte의 크기를 가진 실수 (소수점15자리)
	// *컴퓨터의 메모리 구조상 소수점을 가진 숫자는 계산을 100% 완벽하게 수행할 수 없다.
	
	// <네이밍 규칙>
	// 1. 대소문자 구별
	// 2. 관례적으로 카멜표기법(낙타표기법)을 사용 --> 보통 자바에서 변수 설정할 때 사용함
	// 	  ex) user + name --> userName
	//    파스칼표기법 대문자로 시작하며 이어지는 단어들의 시작 또한 대문자
	//    ex) user + name --> UserName --> 보통 자바에서 클래스명 설정할 때 사용함
	
	// <형변환>
	// 크기가 작은 자료형 -> 크기가 큰 자료형 : 자동형변환
	// 크기가 큰 자료형 -> 크기가 작은 자료형 : 강제형변환
	
	// 큰 자료형에서 작은 자료형으로 데이터 타입을 변경하면
	// 데이터 손실의 위험이 있기 때문에 자동으로 되지 않음
	// 이런 경우에는 개발자가 강제로 데이터 타입을 변경 해주어야 함
	// --> 강제형변환
	
	// 작은 자료형에서 큰 자료형으로 데이터 타입을 변경하면
	// 데이터 손실의 위험이 없기 때문에 자동으로 데이터 타입이 변경 됌
	// --> 자동형변환
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
