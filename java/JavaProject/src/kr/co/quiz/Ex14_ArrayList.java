package kr.co.quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex14_ArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		boolean isLoop = true;

		while(isLoop) {
			System.out.println("1�� : �л� �߰�");
			System.out.println("2�� : �л� ��� ���");
			System.out.println("3�� : ���α׷� ����");
			
			int inputNum = sc.nextInt();
			sc.nextLine(); // �Է��� ���� �ʿ�
			
			if(inputNum == 1) {
				System.out.println("�л��� �߰��� �ּ���");
				String student = sc.nextLine();
				list.add(student);
			}
			else if(inputNum == 2) {
				System.out.println("�л� ����Դϴ�.");
				System.out.println(list);
			}
			else if(inputNum == 3) {
				isLoop = false;
				System.out.println("���α׷� ����");
			}
			else {
				System.out.println("1, 2, 3�� �Է� ���� �մϴ�.");
			}
			
			
//			switch (inputNum) {
//			case 1: 
//				System.out.println("�л��� �߰��� �ּ���");
//				
//				
//				String student = sc.nextLine();
//				
//				list.add(student);
//				break;
//			case 2: 
//				System.out.println("�л� ����Դϴ�.");
//				String studentList = list.toString();
//				
//				System.out.println(studentList);
//				break;
//			case 3: 
//				isLoop = false;
//				
//				System.out.println("���α׷� ����");
//				break;
//
//			default:
//				System.out.println("1, 2, 3�� �Է� ���� �մϴ�.");
//				break;
//			}
		}
	}

}
