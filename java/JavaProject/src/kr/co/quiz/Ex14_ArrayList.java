package kr.co.quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex14_ArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		boolean isLoop = true;

		while(isLoop) {
			System.out.println("1번 : 학생 추가");
			System.out.println("2번 : 학생 목록 출력");
			System.out.println("3번 : 프로그램 종료");
			
			int inputNum = sc.nextInt();
			sc.nextLine(); // 입력을 위해 필요
			
			if(inputNum == 1) {
				System.out.println("학생을 추가해 주세요");
				String student = sc.nextLine();
				list.add(student);
			}
			else if(inputNum == 2) {
				System.out.println("학생 목록입니다.");
				System.out.println(list);
			}
			else if(inputNum == 3) {
				isLoop = false;
				System.out.println("프로그램 종료");
			}
			else {
				System.out.println("1, 2, 3만 입력 가능 합니다.");
			}
			
			
//			switch (inputNum) {
//			case 1: 
//				System.out.println("학생을 추가해 주세요");
//				
//				
//				String student = sc.nextLine();
//				
//				list.add(student);
//				break;
//			case 2: 
//				System.out.println("학생 목록입니다.");
//				String studentList = list.toString();
//				
//				System.out.println(studentList);
//				break;
//			case 3: 
//				isLoop = false;
//				
//				System.out.println("프로그램 종료");
//				break;
//
//			default:
//				System.out.println("1, 2, 3만 입력 가능 합니다.");
//				break;
//			}
		}
	}

}
