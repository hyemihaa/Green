package kr.co.quiz;

import java.util.Scanner;

public class Ex2_if {

	public static void main(String[] args) {
		// 1. �Է� ���� ���� 0 �Ǵ� 12 �̻��� ���, "���� �ʹ� ũ�ų� �۽��ϴ�." ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���: ");
		int num = sc.nextInt();
		
		if(num == 0 || num >= 12) {
			System.out.println("���� �ʹ� ũ�ų� �۽��ϴ�.");
		}
		
		// 2. �Է� ���� ���� ���� ������ ���
		//     3,4,5 : ��	6,7,8 : ����	9,10,11 : ����	12,1,2 : �ܿ�
		System.out.print("���� �Է��ϼ���: ");
		int num2 = sc.nextInt();
		
		if(num2 >= 3 && num2 <= 5) {
			System.out.println(num2 + "�� : ��");
		}
		else if(num2 >= 6 && num2 <= 8) {
			System.out.println(num2 + "�� : ����");
		}
		else if(num2 >= 9 && num2 <= 11) {
			System.out.println(num2 + "�� : ����");
		}
		else if(num2 == 1 || num2 == 2 || num2 == 12 ){
			System.out.println(num2 + "�� : �ܿ�");
		}
		else {
			System.out.println("�ش��ϴ� ������ �����ϴ�.");
		}
		
		
		
		// ���̰� 18�� �̸��̸� "�̼�����" ���
		// ���̰� 18�� �̻� 65�� �̸��̸� "����" ���
		// �� �ܿ��� "����"�� ���
		System.out.print("���̸� �Է��ϼ���: ");
		int num3 = sc.nextInt();
		
		if(num3 < 18) {
			System.out.println("�̼�����");
		}
		else if(num3 >= 18 && num3 < 65) {
			System.out.println("����");
		}
		else {
			System.out.println("����");
		}
		
	
		// �Ʒ��� �ڵ带 �����Ͽ� ���� ���α׷��� �ۼ��ϼ���.
		// ex) ����ڰ� 1���� �Է��ϸ�  firstNumber�� secondNumber�� ���� ���� ����մϴ�.
		// ex) ����ڰ� 4���� �Է��ϸ� firstNumber�� secondNumber�� ���� ��(��)�� ����մϴ�.
		
		int firstNumber = 1000;
		int secondNumber = 20;
		
		  System.out.println("���� ���α׷�");
		  System.out.println("1. ���ϱ�");
		  System.out.println("2. ����");
		  System.out.println("3. ���ϱ�");
		  System.out.println("4. ������(��)");
		  System.out.println("5. ������(������)");
		  

		System.out.print("��ȣ�� �Է��ϼ���: ");
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
