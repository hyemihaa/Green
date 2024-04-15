package kr.co.green;

import java.util.Scanner;

public class Ex3_dowhile {

	public static void main(String[] args) {
		//<do-while문> do {반복 실행할 코드; 증감식 또는 분기문;} while(조건식);
		//            do 안의 내용은 조건식과 상관 없이 최초 1번은 무조건 실행 후 조건식 확인 -> 조건식이 false가 나올때 까지
		int x = 10;
		int y = 13;
		
		do {
			System.out.println("실행" + x);
			x++;
		} while(x < y);
		
//		<참고용>
//		Scanner sc = new Scanner(System.in);
//		System.out.print("0을 입력해주세요: ");
//		int num = sc.nextInt();
//		
//		while(num != 0) {
		
//			System.out.print("다시 입력해주세요: ");
//			num = sc.nextInt();
//		}
		
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		do {
			System.out.print("0을 입력해주세요: "); // 무조건 실행  
			num = sc.nextInt(); // 사용자가 입력한 정수
		}while (num != 0); // 사용자가 입력한 정수가 0이 아닐 경우 종료 (false일 경우 while문 종료)
		System.out.print("0을 입력하셨습니다.");

	}

}
