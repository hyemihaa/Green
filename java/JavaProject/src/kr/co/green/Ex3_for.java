package kr.co.green;

import java.util.Scanner;

public class Ex3_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ݺ��� Ƚ���� �Է��ϼ���: ");
		int num = sc.nextInt();
		
		// for�� -> for(�ʱ��; ���ǽ�; ������) {�ݺ� ������ �ڵ�};
		for(int i=0; i<num; i++) {
			System.out.println("���� ���ڴ� " + i + "�Դϴ�.");
			
			if(i >= 2) {
				System.out.println("i�� 2�̻� �Դϴ�.");
			}
		}
		
		// i�� 10���� ����
		// 10, 9, 8, 7, 6, 5, 4, 3, 2, 1���� ���
		
		for(int i=10; i >= 1; i--) {
			System.out.println(i);
		}

		
		sc.nextLine();
		
		System.out.print("���ڿ��� �Է��ϼ���: ");
		String str = sc.nextLine();
		             // length ���̸� ����
		for(int i=0; i<str.length(); i++) { //�Է��� ���ڿ��� ���̸�ŭ �ݺ�
			System.out.println("���� �ݺ� Ƚ���� " + "�Դϴ�.");
		}
		
		
		// ��øfor�� (= ����for��)
		for(int i=0; i<2; i++) { // 1�� for�� ���� i=0 �϶�, i=1 �϶� �� 2�� �ݺ� �� ���� �ϰ� ���
			System.out.println("i : " + i);
			for(int j=10; j<15; j++) { //i=0 �϶� -> 2�� for�� ���� j=10 ~ j=14 ���� for�� ����
									   //-> �ٽ� 1�� for�� ���� -> 2�� for�� ���� j=10 ~ j=14 ���� for�� ����
				System.out.println("j�� : " + j);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
