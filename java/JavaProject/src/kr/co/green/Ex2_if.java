package kr.co.green;

import java.util.Scanner;

public class Ex2_if {

	public static void main(String[] args) {
		
		int firstNumber = 100;
		int secondNumber = 200;
		
		// <if�� - (����)�� ���� ��� {}���� �ڵ尡 ����>
		// firstNumber�� secondNumber���� �������� "�۽��ϴ�." ���
		if(firstNumber < secondNumber) {
			System.out.println("�۽��ϴ�.");
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���: ");
		int num = sc.nextInt();
		
		if(num > 10) {
		System.out.println("10���� Ů�ϴ�");
		}
		
		// 10�϶� "10�Դϴ�" ���
		// 20�϶� "20�Դϴ�" ���
		// 30�϶� "30�Դϴ�" ���
		// �� �ܿ��� "�߸� �Է��ϼ̽��ϴ�." ���
		if(num == 10) {
			System.out.println("10�Դϴ�.");
		}
		else if(num == 20) {
			System.out.println("20�Դϴ�.");
		
		}
		else if(num == 30) {
			System.out.println("30�Դϴ�.");
		}
		else { // 10, 20, 30 ���� ������ ��� ����� �� ����
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		
		// 10~20�� �� "10~20�Դϴ�." ���
		// "num�� 10���� ũ�ų� �۴�." �׸��� "num�� 20���� �۰ų� ����."
		if(num >= 10 && num <= 20) {
			System.out.println("10~20�Դϴ�.");
		} // 21�Ǵ� 22�϶� " 21�Ǵ� 22�� �����ϴ�." ���
		else if(num == 21 || num == 22) {
			System.out.println("21�Ǵ� 22�� �����ϴ�.");
		}
		else {
			System.out.println("���ǿ� �����ϴ� ���ڰ� �ƴմϴ�.");
		}
		
		// Ȧ��, ¦��, ��� ���ϱ�
		int number = 10;
		
		if(number%2 == 0) {
			System.out.println("¦���Դϴ�.");
		}
		else if(number%2 == 1) {
			System.out.println("Ȧ���Դϴ�.");
		}
			
		if(number%10 == 0) {
			System.out.println("10�� ����Դϴ�.");
		}
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
