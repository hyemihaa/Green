package kr.co.quiz;

import java.util.Iterator;
import java.util.Scanner;

public class Quiz_1 {

	public static void main(String[] args) {
////		Ex0~1
//
////		Q1. �Ʒ��� ���ǿ� �����ϴ� ������ �����ϼ���.
//
////		1. ������ ���� varFalse ������ �����ϼ���.
////		   -> ������ ������ ������ false�� �ʱ�ȭ �ϼ���.
//		boolean varFalse = false;
////		2. �������� ���� varChar ������ �����ϼ���.
////		   -> ������ ������ ������ 'Q'�� �ʱ�ȭ �ϼ���.
//		char vatChar = 'Q';
////		3. ������ ���ڸ� ���� varNum ������ �����ϼ���.
////		   -> ������ ������ ������ 10���� �ʱ�ȭ �ϼ���.
//		int varNum = 10;
////		4. ���ڿ��� ���� varStr ������ ���� �� �ʱ�ȭ�� ���ÿ� �ϼ���.
////		   -> ���� "Java"�� ���ϴ�.
//		String varstr = "Java";
//
////		Q2. �ΰ��� ���� ���� a�� b�� �����ϰ�, ���� 5�� 3�� ���� �Ҵ��ϼ���
//		int a = 5;
//		int b = 3;
////		1. a�� b�� ���� ���ϰ� ����� ���
//		System.out.println(a + b);
////		2. a�� b�� ���̸� ���ϰ� ����� ���
//		System.out.println(a - b);
////		3. a�� b�� ���� ���ϰ� ����� ���
//		System.out.println(a * b);
////		4. a�� b�� ���� ����� ���
//		System.out.println(a / b);
////		5. a�� b�� ���� �������� ���
//		System.out.println(a % b);
//		System.out.println();
//
////		Q3. �ΰ��� ���ڿ��� �̾� ���̼���.
////		1. ���� strFirst �� ���ڿ� "Hello, " �� �Ҵ�
//		String strFirst = "Hello, ";
////		2. ���� strSecond �� ���ڿ� "World!"�� �Ҵ�
//		String strSecond = "World!";
////		3. �ΰ��� ���ڿ��� �̾� �ٿ� ���
//		System.out.println(strFirst + strSecond);
//		System.out.println();
////		Ex2~3
////		Q1. 1���� 100������ ���� �߿��� 3�� ����� ���ڸ� ����ϴ� �ڹ� ���α׷��� �ۼ�
////		1. for ���� ����Ͽ� 1���� 100������ ���ڸ� �ݺ� ����
////		2. if ���� ����Ͽ� �� ���ڰ� 3�� ��������� Ȯ��    
////		3. 3�� ����� ��� �ش� ���ڸ� ���
//
//		for (int i = 0; i <= 100; i++) {
//			if (i % 3 == 0) {
//				System.out.println("3�� ��� : " + i);
//			}
//		}
//		System.out.println();
//
////		Q2. ����ڷκ��� ����, ����, ����, ���� ������ �Է¹ް� ��� ������ �Ʒ� ���ؿ� ���� ����ϴ� ���α׷��� �ۼ�
////		1. 90�� �̻� : ��� ������ A �Դϴ�.
////		2. 80�� �̻� : ��� ������ B �Դϴ�.
////		3. 70�� �̻� : ��� ������ C �Դϴ�.
////		4. 60�� �̻� : ��� ������ D �Դϴ�.
////		5. 50�� �̻� : ��� ������ E �Դϴ�.
////		6. 50�� �̸� : ��� ������ F �Դϴ�.
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("���� ���� : ");
//		int kor = sc.nextInt();
//		System.out.print("���� ���� : ");
//		int eng = sc.nextInt();
//		System.out.print("���� ���� : ");
//		int math = sc.nextInt();
//		System.out.print("���� ���� : ");
//		int sci = sc.nextInt();
//		
//		int avg = (kor + eng + math + sci) / 4;
//		
//		if(avg >= 90) {
//			System.out.println("��� ������ A �Դϴ�.");
//		}
//		else if(avg >=80) {
//			System.out.println("��� ������ B �Դϴ�.");
//		}
//		else if(avg >=70) {
//			System.out.println("��� ������ C �Դϴ�.");
//		}
//		else if(avg >=60) {
//			System.out.println("��� ������ D �Դϴ�.");
//		}
//		else if(avg >=50) {
//			System.out.println("��� ������ E �Դϴ�.");
//		}
//		else if(avg < 50) {
//			System.out.println("��� ������ F �Դϴ�.");
//		}
//		System.out.println();
//		
//		
////		Q3. �� �߿��� ���� ū ���� ���� ���� ���� ã�� ���
////		1. ������ ���ڸ� �Ҵ�(������ ������ 1~100)  --> �迭
////		2. for���� Ȱ���Ͽ� �ִ밪�� �ּҰ��� ���
//		
//		int[] arrNum = {10, 25, 50, 4, 77};
//		
//		int max = 0;
//		int min = 100;
//		
//		for(int i=0; i<arrNum.length; i++) {
//			if(arrNum[i] > max) {
//				max = arrNum[i];
//			}
//			if(arrNum[i] < min) {
//				min = arrNum[i];
//			}
//		}
//		System.out.println("�ִ밪 : " + max + " �ּҰ� : " + min);
//		System.out.println();
//		
////		Ex4
////		Q1. �־��� �迭���� ��� ����� ���� ����Ͽ� ����ϴ� ���α׷��� �ۼ�
////		1. int[] score = {37, 84, 12, 56, 91, 24, 63}
////		int[] score = {37, 84, 12, 56, 91, 24, 63};
////		int sum = score[0] + score [1] + score[2] + score[3] + score[4] + score[5];
////		System.out.println(sum);
//		int[] score = {37, 84, 12, 56, 91, 24, 63};
//		int sum = 0;
//		for(int i=0; i<score.length; i++) {
//			sum += score[i];
//		}
//		System.out.println(sum);
//		System.out.println();
//		
////		Q2. ����ڷκ��� 3���� ������ �Է� �޾�, �迭�� ������ �� �迭�� ��� �߿��� ¦���� ������ Ȧ���� ������ ����ϴ� �ڹ� ���α׷��� �ۼ�
////		1. Scanner Ŭ������ ����Ͽ� ����ڷκ��� ������ �Է� ���� �� �ֽ��ϴ�.
////		2. ũ�Ⱑ 3�� ���� �迭�� �����ϰ� ����� �Է��� �迭�� ����
////		3. for ������ ����Ͽ� 3���� �Է��� �ް� �迭�� ����
////		4. �迭�� �ݺ��Ͽ� ¦���� Ȧ���� ���� ������ ���
//		int eNum = 0;
//		int oNum = 0;
//		int[] arr3 = new int[3];
//		
//		// �Է�
//		for(int i=0; i<arr3.length; i++) {
//			arr3[i] = sc.nextInt();
//		}
//		
//		// ¦��/Ȧ�� ����
//		for(int i = 0; i < arr3.length; i++) {
//			if(arr3[i] % 2 == 0) {
//				eNum++;
//			}
//			else
//			{
//				oNum++;
//			}
//		}
//		System.out.println("¦�� : " + eNum + " Ȧ�� : " + oNum);
//		System.out.println();
//		
////		Q4. ����ڷκ��� ����, ����, ����, ���� ������ �Է¹ް� �迭�� ���� �� �Ʒ� ���ؿ� ���� ����ϴ� ���α׷��� �ۼ�
////		* ��Ʈ : ���� 4���ϱ� 4�� �ݺ��ž� ��
////		1. 90�� �̻� : OO�� ������ A �Դϴ�.
////		2. 80�� �̻� : OO�� ������ B �Դϴ�.
////		3. 70�� �̻� : OO�� ������ C �Դϴ�.
////		4. 60�� �̻� : OO�� ������ D �Դϴ�.
////		5. 50�� �̻� : OO�� ������ E �Դϴ�.
////		6. 50�� �̸� : OO�� ������ F �Դϴ�.
////		ex) ������ ������ A �Դϴ�.  /  ������ ������ E �Դϴ�.
//		
//		int[] score1 = new int[4];
//		for(int i=0; i<score1.length; i++) {
//			score1[i] = sc.nextInt();
//		}
//		String[] subject = {"����", "����", "����", "����"};
//		
//		for(int i=0; i<score1.length; i++) {
//			if(score1[i] >= 90) {
//				System.out.println(subject[i] + "������ A �Դϴ�");
//			}
//			else if(score1[i] >= 80) {
//				System.out.println(subject[i] + "������ B �Դϴ�");
//			}
//			else if(score1[i] >= 70) {
//				System.out.println(subject[i] + "������ C �Դϴ�");
//			}
//			else if(score1[i] >= 60) {
//				System.out.println(subject[i] + "������ D �Դϴ�");
//			}
//			else if(score1[i] >= 50) {
//				System.out.println(subject[i] + "������ E �Դϴ�");
//			}
//			else if(score1[i] < 50) {
//				System.out.println(subject[i] + "������ F �Դϴ�");
//			}
//		}
//		System.out.println();
//		
//		
//		Q3. �迭�� ����� �л����� ���� ã��
//		1. int[] scores = {85, 90, 78, 92, 88} �迭�� Ȱ��
//		2. ��� �л��� ������ ����� ����ϰ� ���
//		3. ���� ���� ������ ���� �л��� ������ ���
//		4. ���� ���� ������ ���� �л��� ������ ���
//		5. 80�� �̻��� ���� �л��� ���� ����ϰ� ���
		
		int[] scores = {85, 90, 78, 92, 88};
		int maxArr = scores[0];
		int minArr = scores[0];
		int scoreCnt =0;
		
		int scoresAvg = (scores[0] + scores[1] + scores[2] + scores[3] + scores[4])/5;
		System.out.println(scoresAvg);
		System.out.println();
		
		for(int i = 0; i < scores.length; i++) {
			if(maxArr < scores[i]) {
				maxArr = scores[i];
			}
			if(minArr >scores[i]) {
				minArr = scores[i];
			}
			if(scores[i] >= 80) {
				scoreCnt++;
			}
		}
		
		
		System.out.println(maxArr);
		System.out.println(minArr);
		System.out.println(scoreCnt);
		
		
		
		
		
		
	}

}
