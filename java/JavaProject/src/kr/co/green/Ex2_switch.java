package kr.co.green;

import java.util.Scanner;

public class Ex2_switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴를 선택하세요.");
		System.out.println("1번 : 아이스 아메리카노");
		System.out.println("2번 : 카페라떼");
		System.out.println("3번 : 딸기요거트 스무디");
		int result = sc.nextInt();
		
		switch(result) {
		case 1 :
			System.out.println("아이스 아메리카노를 선택하셨습니다.");
			break;
		case 2 :
			System.out.println("카페라떼를 선택하셨습니다.");
			break;
		case 3 :
			System.out.println("딸기요거트 스무디를 선택하셨습니다.");
			break;
		default : // if문의 else와 같다고 생각하면 된다.
			System.out.println("해당하는 메뉴가 없습니다.");
		}
			

	}

}
