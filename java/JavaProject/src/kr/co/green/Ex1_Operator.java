package kr.co.green;

public class Ex1_Operator {

	public static void main(String[] args) {
		// <연산자 : 특정 변수나 리터럴(값)에 대해 주어진 식을 계산하여 결과를 얻어내는 연산을 수행하는 기호>
		int result;
		int firstNumber = 50;
		int secondNumber = 20;
		
		// 50 + 20
		result = firstNumber + secondNumber;
		System.out.println("덧셈 결과 : " + result);
		
		result = firstNumber - 30;
		System.out.println("뺄셈 결과 : " + result);
		
		System.out.println(10+30*5); // * > + -> 우선순위가 *가 더 높다
		System.out.println((10+30)*5); // + 먼저 계산 -> 괄호로 묶는다 (괄호가 우선순위가 높다)
		
		// 증감 연산자
		// ++ : 1증가
		// -- : 1감소
		
		// <후위 증감 연산자>
		int x = 10;
		//x = x + 1;
		x++; // 1증가
		System.out.println(x); //11
		
		x--; // 1감소
	    System.out.println(x); // 10
	      
	    // <전위 증감 연산자>
	    int y =10;
	    ++y; // 1증가
	    System.out.println(y); // 11
	      
	    --y; // 1감소
	    System.out.println(y); // 10
		
	    // <후위, 전위 증감 연산자 차이점>
	    int z = 10;
	    
	    // println 실행 -> z변수 1증가
	    // 1. println이 실행되면서 "후위 증감 연산자 : 10" 출력
	    // 2. z변수의 값을 1증가(11)
	    // 3. println이 실행되면서 "이후 값 : 11" 출력
	   
	    System.out.println("후위 증감 연산자 : " + z++); // 10
	    // println이 실행된 후, 변수 x에 +1이 수행됨
	    // z = z + 1; --> 출력 후 다음줄에 식 존재(출력 후 증감)  --> 후위 증감 연산자
	    System.out.println("이후 값 : " + z); // 11

	    // z변수 1증가 -> println 실행
	    // 1. z변수의 값을 1증가(12)
	    // 2. println이 실행되면서 "전위 증감 연산자 : 12" 출력
	    // 3. println이 실행되면서 "이후 값 : 12" 출력
	    
	    // println이 실행되기 전, 변수 x에 +1이 수행됨
	    // z = z + 1; --> 출력 윗줄에 식 존재(먼저 증감 후 출력) --> 전위 증감 연산자 (사용빈도가 낮다)
	    System.out.println("전위 증감 연산자 : " + ++z); // 12
	    System.out.println("이후 값 : " + z); // 12
	    
	    // <비교 연산자> -> 결과값은 참(true) 또는 거짓(false)
//	    firstNumber = 50;
//	    secondNumber = 20;
	    System.out.println(10 < 5); // false
	    System.out.println(firstNumber > secondNumber); //true
	    System.out.println(firstNumber <= 50); //true
	    
	    String firstStr ="hi";
	    String secondStr = new String("hi");
	    System.out.println(firstStr == secondStr); //false --> 변수가 같은 데이터를 가리켜야 한다.
	    System.out.println(firstStr.equals(secondStr)); //true --> equals 메소드 사용 : 문자열 비교할 때
	                
	    
	    // <논리 부정 연산자 ! > true -> false, false -> true
	    boolean isTrue = true;
	    
	    System.out.println(isTrue); // true
	    System.out.println(!isTrue); // false
	    
	    // equals : 두 개의 문자열이 같으면 true, 다르면 false
	    // 개발자가 두 개의 문자열이 다르면 true, 같으면 false를 변환하고 싶다
	    // --> 논리 부정 연산자(!)
	    System.out.println(!firstStr.equals(secondStr)); // false

	    // <논리 연산자 &&, ||>
	    // 조건문을 실행할 때 왼쪽에서 오른쪽으로 실행함
	    
	    // &&(AND) : 두 조건 모두 참(true)일때 -> true
	    System.out.println(10>5 && 20==20); // true
	    System.out.println(10>5 && 20!=20); // false
	    
	    // ||(OR) : 두 조건중 하나라도 참(true) 이면 -> true
	    System.out.println(10>5 || 20!=20); // true
	    System.out.println(10<5 || 20!=20); // false
	    
	    // <삼항 연산자 : 조건식을 간단하게 줄여 사용하기 위한 방식 (조건 ? 참: 거짓) > 복잡한 연산에는 비추천(가독성이 떨어짐)
	    int a =10;
	    int b= 5;
	    
	    // 조건식 ? true일 때 실행할 코드 : false일 때 실행할 코드
	    System.out.println(a>b ? a+10 : a-10); // true일 경우 ?로 이동 -> 20 출력   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
