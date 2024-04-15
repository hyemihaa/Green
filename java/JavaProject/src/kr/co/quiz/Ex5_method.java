package kr.co.quiz;

import java.util.Scanner;

import kr.co.green.Ex5_1_Object_Car;

public class Ex5_method {

	public static void main(String[] args) {
		// Ŭ���� ���� : Ex5_1_Car
		// startEngine() : "�ڵ��� ������ �����մϴ�." ���
		// stopEngine() : "�ڵ����� ������ �����մϴ�." ���
		// accelerate() : "�ڵ����� �����մϴ�." ���
		// brake() : "�ڵ����� �����մϴ�." ���
		
		
		// ��ü ���� �� 4�� �޼ҵ� ȣ��
		
		Ex5_1_Object_Car car = new Ex5_1_Object_Car();
		
		car.brake();
		car.startEngine();
		car.stopEngine();
		car.accelerate();
		
		//����
		
		int[] numbers = {20, 31, 34, 55, 77};
		
		//��ü ����(Ex5_2_minMax)
		Ex5_2_minMax minMax = new Ex5_2_minMax();
		//�ּҰ� ���ϴ� �޼ҵ� ȣ��(numbers�迭)
		
		//��ȯ���� �ּҰ��� ���� minvalue�� ���� �� ���
		
		int minValue = minMax.minResult(numbers);
		System.out.println("�ּҰ��� : " + minValue);
		
		int maxValue = minMax.maxResult(numbers);
		System.out.println("�ִ밪�� : " + maxValue);
		
					// �޴� �������� ���ڰ� �������� �ʾ��� ��� (��������) 
		minMax.getMin(10, 20, 30, 40);
		
		
		
//		1. ����ڷκ��� �������� �Է¹ް� ����(radius)�� �����ϼ���.
		Scanner sc = new Scanner(System.in);
	
		int radius = sc.nextInt();

		Ex5_method radiusResult = new Ex5_method();

		double area = radiusResult.areaNum(radius);
		System.out.println(area);
		
		double round = radiusResult.roundNum(radius);
		System.out.println(round);
		
	}	
//-----------------------------------------------------------------------------------------		
		
		
//		2. ���� ���̸� ���ϴ� �޼ҵ带 �ۼ��ϼ���.
		
//		  - �� �޼ҵ�� �������� �Ű������� �޽��ϴ�
//		  - ���� ���̸� ��ȯ�մϴ�. (��, ���̰� 10 �̻��϶��� ���̸� ��ȯ�ϰ�, 10 �̸��̶�� 0�� ��ȯ�մϴ�) 
//		  - ���� : 3.14 * ������ * ������
		
		// ���� ���� 
		public double areaNum(int radius) {
			double areaNum = 3.14 * radius * radius;
			if(areaNum >= 10) {
				return areaNum; 
			}
			else {
				return 0;
			}
		}
		
//		3. ���� �ѷ��� ���ϴ� �޼ҵ带 �ۼ��ϼ���.
//		  - �� �޼ҵ�� �������� �Ű������� �޽��ϴ�
//		  - ���� �ѷ��� ��ȯ�մϴ�.
//		(��, �ѷ��� 15 �̻��϶��� �ѷ��� ��ȯ�ϰ�, 15 �̸��̶�� 0�� ��ȯ�մϴ�) 
//		  - ���� : 2 * 3.14 * ������
		
		// ���� �ѷ�
		public double roundNum(int radius) {
			double roundNum = 2* 3.14 * radius;
			if(roundNum >= 15) {
				return roundNum; 
			}
			else {
				return 0;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	

}
