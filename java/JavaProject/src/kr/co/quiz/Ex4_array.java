package kr.co.quiz;

public class Ex4_array {

	public static void main(String[] args) {
//		1. 5��ŭ�� ���̸� ���� �迭�� ���� �� �Ҵ��ϼ���.
//		2. ������ ���� �� �Ҵ��� �迭�� �Ʒ��� ������ �ʱ�ȭ �ϼ���.
//		   -> "A", "B", "CD", "E", "FG"
		String[] str = new String[5];
		str[0] = "A";
		str[1] = "B";
		str[2] = "CD";
		str[3] = "E";
		str[4] = "FG";
		System.out.println(str[3]);
		
		String[] strArr = {"A", "B", "CD", "E", "FG"};
		for(int i=0; i<strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		System.out.println();

//		3. ����, ����, ����, ���� ������ �迭�� ���� ��������.
//		  -> ���� ���� : 85
//		  -> ���� ���� : 80
//		  -> ���� ���� : 90
//		  -> ���� ���� : 88
//		String[] score = {"���� ���� : 85", "���� ���� : 80", "���� ���� : 90", "���� ���� : 88"};
//			for(int i=0; i < score.length; i++) {
//				System.out.println(score[i]);
//			}

//		
//		4. �迭�� �ִ� ���� ��� ��ģ �� ��� ������ ����ϼ���.
//		int[] num = {85, 80, 90, 88};
//		int avg = 0;
//		int sum = 0;
//			for(int i=0; i < num.length; i++) {
//				sum = sum + num[i];
//			}
//		avg = sum / 4;
//			
//		System.out.println(avg);

//		System.out.println((85+80+90+88)/4);

//		3. ����, ����, ����, ���� ������ �迭�� ���� ��������.
//		  -> ���� ���� : 85
//		  -> ���� ���� : 80
//		  -> ���� ���� : 90
//		  -> ���� ���� : 88
		int[] num = { 85, 80, 90, 88 };
		for (int i = 0; i < num.length; i++) {
			if (i == 0) {
				System.out.println("���� ���� : " + num[i]);
			} 
			else if (i == 1) {
				System.out.println("���� ���� : " + num[i]);
			} 
			else if (i == 2) {
				System.out.println("���� ���� : " + num[i]);
			} 
			else if (i == 3) {
				System.out.println("���� ���� : " + num[i]);
			}

		}
		System.out.println();

//		4. �迭�� �ִ� ���� ��� ��ģ �� ��� ������ ����ϼ���.
		int avg = 0;
		avg = (num[0] + num[1] + num[2] + num[3]) / 4;// ���� ���� ��Ұ� ��� ����(int)�� -> ��� �� int(�Ҽ������� ���X)
		System.out.println("��� ���� : " + avg);
		
//		double avg = 0;  // �հ������� ���� int    ��������� �Ǽ� double
//		avg = (num[0] + num[1] + num[2] + num[3]) / 4.0;  --> ������ ����� ������ �Ǽ��� ������ �Ҽ������� ��� ����
//		System.out.println("��� ���� : " + avg);   ->�Ǵ� ������ ���� (double)4; -> ���������� �հ�� int��(����) �̹Ƿ� ������ ����  

		
	}

}
