package kr.co.quiz;

import java.util.Random;
import java.util.Scanner;

public class Ex3_for {

	public static void main(String[] args) {
//		Q1. ���� 1����, ����ڰ� �Է��� ����ŭ ���ڸ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//		1. ��ĳ�ʷ� ����ڷκ��� ���ڸ� �Է� ��������.
//		2. ����, ����ڰ� ���� 10�� �Է� �Ѵٸ�, 1���� 10������ ���ڸ� ����ϸ� �˴ϴ�.

		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���: ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.println(i);
		}
		System.out.println();

//		Q2. ¦���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.(������ 1���� 20����) Scanner ������� �ʰ�

		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println();

//   	Q3. �ζ� ��ȣ�� �����ϴ� ���α׷��� �ۼ� �Ͻÿ�. (6���� ���� ���)
		Random rd = new Random();
		int lottoNumber = 0; // 0~44 --> +1 �� ���� 1���� 45������ ���ڸ� �������� ��Ÿ��

		for (int i = 0; i < 6; i++) {
			lottoNumber = rd.nextInt(45) + 1;
			System.out.println(lottoNumber);
		}

//		for(int i=0; i<6; i++) { //
//			int lottoNumber = rd.nextInt(45) +1; 
//			System.out.println(lottoNumber);
//			}

//		    
//		Q4. 1���� 100������ ���� �� 3�� 5�� ������� ����ϼ���.
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("3�� 5�� �����: " + i);
			}
		}

// 		Q5. 10���丮���� ���� ����ϼ���.(10! = 1*2*3*4*5*6*7*8*9*10)
		int iNum = 1;
		for (int i = 1; i <= 10; i++) { 
			iNum *= i; // iNum = iNum * i
		}
		System.out.println(iNum); 
		
		
		

//		for(int i=1; i<=10; i++) { // for�� �ȿ��� ������ ������ ��� -> for�� {}�� ������ ���� ������ �� �� ��������.
//			int iNum = 1;
//			iNum  = i*iNum ;
//		}
//		System.out.println("���丮���� " + iNum); // for�� �ۿ��� int = iNum�� ����Ҽ� ����.(���� �� ���� �߻�)
		

	}

}
