package kr.co.green;

import java.util.Scanner;

public class Ex2_switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�޴��� �����ϼ���.");
		System.out.println("1�� : ���̽� �Ƹ޸�ī��");
		System.out.println("2�� : ī���");
		System.out.println("3�� : ������Ʈ ������");
		int result = sc.nextInt();
		
		switch(result) {
		case 1 :
			System.out.println("���̽� �Ƹ޸�ī�븦 �����ϼ̽��ϴ�.");
			break;
		case 2 :
			System.out.println("ī��󶼸� �����ϼ̽��ϴ�.");
			break;
		case 3 :
			System.out.println("������Ʈ ������ �����ϼ̽��ϴ�.");
			break;
		default : // if���� else�� ���ٰ� �����ϸ� �ȴ�.
			System.out.println("�ش��ϴ� �޴��� �����ϴ�.");
		}
			

	}

}
