package kr.co.quiz;

import java.util.Scanner;

public class Ex2_switch {

	public static void main(String[] args) {
		// Q1. ����ڷκ��� 1���� 7������ ���ڸ� �Է¹޾� �ָ�����, �������� ����ϴ� ���α׷� �ۼ�
		//		1~5�� �����Դϴ�, 6~7�� �ָ��Դϴ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int day = sc.nextInt();
		
		switch(day) {
		case 1 : case 2 : case 3 : case 4 : case 5 :  // 1~5���� ������ ����� �̹Ƿ� break���� ����
			System.out.println("�����Դϴ�");
			break;
		case 6 :
		case 7 :
			System.out.println("�ָ��Դϴ�");
		}

	}

}

