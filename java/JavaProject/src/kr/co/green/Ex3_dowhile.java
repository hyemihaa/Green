package kr.co.green;

import java.util.Scanner;

public class Ex3_dowhile {

	public static void main(String[] args) {
		//<do-while��> do {�ݺ� ������ �ڵ�; ������ �Ǵ� �б⹮;} while(���ǽ�);
		//            do ���� ������ ���ǽİ� ��� ���� ���� 1���� ������ ���� �� ���ǽ� Ȯ�� -> ���ǽ��� false�� ���ö� ����
		int x = 10;
		int y = 13;
		
		do {
			System.out.println("����" + x);
			x++;
		} while(x < y);
		
//		<�����>
//		Scanner sc = new Scanner(System.in);
//		System.out.print("0�� �Է����ּ���: ");
//		int num = sc.nextInt();
//		
//		while(num != 0) {
		
//			System.out.print("�ٽ� �Է����ּ���: ");
//			num = sc.nextInt();
//		}
		
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		do {
			System.out.print("0�� �Է����ּ���: "); // ������ ����  
			num = sc.nextInt(); // ����ڰ� �Է��� ����
		}while (num != 0); // ����ڰ� �Է��� ������ 0�� �ƴ� ��� ���� (false�� ��� while�� ����)
		System.out.print("0�� �Է��ϼ̽��ϴ�.");

	}

}
