package kr.co.green;

import java.util.Scanner;

public class Ex3_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("반복할 횟수를 입력하세요: ");
		int num = sc.nextInt();
		
		// for문 -> for(초기식; 조건식; 증감식) {반복 실행할 코드};
		for(int i=0; i<num; i++) {
			System.out.println("현재 숫자는 " + i + "입니다.");
			
			if(i >= 2) {
				System.out.println("i가 2이상 입니다.");
			}
		}
		
		// i가 10부터 시작
		// 10, 9, 8, 7, 6, 5, 4, 3, 2, 1까지 출력
		
		for(int i=10; i >= 1; i--) {
			System.out.println(i);
		}

		
		sc.nextLine();
		
		System.out.print("문자열을 입력하세요: ");
		String str = sc.nextLine();
		             // length 길이를 구함
		for(int i=0; i<str.length(); i++) { //입력한 문자열의 길이만큼 반복
			System.out.println("현재 반복 횟수는 " + "입니다.");
		}
		
		
		// 중첩for문 (= 이중for문)
		for(int i=0; i<2; i++) { // 1번 for문 실행 i=0 일때, i=1 일때 총 2번 반복 후 종료 하고 출력
			System.out.println("i : " + i);
			for(int j=10; j<15; j++) { //i=0 일때 -> 2번 for문 실행 j=10 ~ j=14 까지 for문 종료
									   //-> 다시 1번 for문 실행 -> 2번 for문 실행 j=10 ~ j=14 까지 for문 종료
				System.out.println("j는 : " + j);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
