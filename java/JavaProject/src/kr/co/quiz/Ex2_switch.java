package kr.co.quiz;

import java.util.Scanner;

public class Ex2_switch {

	public static void main(String[] args) {
		// Q1. 사용자로부터 1부터 7사이의 숫자를 입력받아 주말인지, 평일인지 출력하는 프로그램 작성
		//		1~5는 평일입니다, 6~7은 주말입니다
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int day = sc.nextInt();
		
		switch(day) {
		case 1 : case 2 : case 3 : case 4 : case 5 :  // 1~5까지 동일한 결과값 이므로 break생략 가능
			System.out.println("평일입니다");
			break;
		case 6 :
		case 7 :
			System.out.println("주말입니다");
		}

	}

}

