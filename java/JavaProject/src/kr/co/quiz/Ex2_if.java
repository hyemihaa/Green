package kr.co.quiz;

import java.util.Scanner;

public class Ex2_if {

	public static void main(String[] args) {
		// 1. 입력 받은 값이 0 또는 12 이상일 경우, "값이 너무 크거나 작습니다." 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		if(num == 0 || num >= 12) {
			System.out.println("값이 너무 크거나 작습니다.");
		}
		
		// 2. 입력 받은 월에 따라 계절을 출력
		//     3,4,5 : 봄	6,7,8 : 여름	9,10,11 : 가을	12,1,2 : 겨울
		System.out.print("월을 입력하세요: ");
		int num2 = sc.nextInt();
		
		if(num2 >= 3 && num2 <= 5) {
			System.out.println(num2 + "월 : 봄");
		}
		else if(num2 >= 6 && num2 <= 8) {
			System.out.println(num2 + "월 : 여름");
		}
		else if(num2 >= 9 && num2 <= 11) {
			System.out.println(num2 + "월 : 가을");
		}
		else if(num2 == 1 || num2 == 2 || num2 == 12 ){
			System.out.println(num2 + "월 : 겨울");
		}
		else {
			System.out.println("해당하는 계절이 없습니다.");
		}
		
		
		
		// 나이가 18세 미만이면 "미성년자" 출력
		// 나이가 18세 이상 65세 미만이면 "성인" 출력
		// 그 외에는 "노인"을 출력
		System.out.print("나이를 입력하세요: ");
		int num3 = sc.nextInt();
		
		if(num3 < 18) {
			System.out.println("미성년자");
		}
		else if(num3 >= 18 && num3 < 65) {
			System.out.println("성인");
		}
		else {
			System.out.println("노인");
		}
		
	
		// 아래의 코드를 참고하여 계산기 프로그램을 작성하세요.
		// ex) 사용자가 1번을 입력하면  firstNumber와 secondNumber를 더한 값을 출력합니다.
		// ex) 사용자가 4번을 입력하면 firstNumber와 secondNumber를 나눈 값(몫)을 출력합니다.
		
		int firstNumber = 1000;
		int secondNumber = 20;
		
		  System.out.println("계산기 프로그램");
		  System.out.println("1. 더하기");
		  System.out.println("2. 빼기");
		  System.out.println("3. 곱하기");
		  System.out.println("4. 나누기(몫)");
		  System.out.println("5. 나누기(나머지)");
		  

		System.out.print("번호를 입력하세요: ");
		int userSelect = sc.nextInt();
		
		if(userSelect == 1) {
			  System.out.println(firstNumber + secondNumber);
		}
		else if(userSelect == 2) {
			  System.out.println(firstNumber - secondNumber);
		}
		else if(userSelect == 3) {
			  System.out.println(firstNumber * secondNumber);
		}
		else if(userSelect == 4) {
			  System.out.println(firstNumber / secondNumber);
		}
		else if(userSelect == 5) {
			  System.out.println(firstNumber % secondNumber);
		}
		  

	}

}
