package kr.co.quiz;

import java.util.Scanner;

public class Ex5_filed {

	public static void main(String[] args) {
	// Q2 Ex5_3_Buy
    // 1.BuyŬ���� ���� 
    // 2.�ʱ� �ݾ�(������)�� �����ϱ� ���� ���� ����  ->BuyŬ������ �ν��Ͻ� ����
    // int balance = 100000
    	
	Ex5_3_Buy buy = new Ex5_3_Buy();
	
		
	
    // 3. ���ǵ��� ���� ����
    // ����� 20000(������ monitorPrice)
    // ���콺 18000(������ mousePrice)
    // ����ũž 70000(desktopPrice)
    	
    // 4. ������ ��ǰ�� �����ϱ� ���� �޼��� ����
    // -> buyMonitor, buyMouse, buyDesktop
    // -> �ش��ϴ� �ݾ� ��ŭ �����ݿ��� ����
    // -> "---�� �����ϼ̽��ϴ�. ���� �ݾ��� -----�� �Դϴ�." �޼��� ���
    	
	buy.buyMonitor();
	buy.buyMouse();
	buy.buyDesktop();
	
    // * �������� -�� �� �� ���� 
    
	
Ex5_3_Buy buyNum = new Ex5_3_Buy();
	
	buyNum.buyMonitor();
	buyNum.buyMouse();
	buyNum.buyDesktop();
	
	
	// Q3 Ex5_4_rating
	// ����ڷκ��� ���� 1���� �Է¹���(double)
	Scanner sc = new Scanner(System.in);
	System.out.println("������ �Է��ϼ��� : ");
	
	double input = sc.nextDouble();
	
	// ��ü����
	Ex5_4_rating rating = new Ex5_4_rating();
	//������ ��ü�� getAvgRating �޼��带 ȣ���ϸ鼭, �Է¹޾Ҵ� �� ����
	
	//getAvgRating �޼���κ��� ��ȯ���� ��������� result ������ ������ ���
	double result = rating.getAvgRating(input);
	System.out.println("��� : " + result);
	
	
	// Q4  Ex5_5_student
	// ����ڷκ��� �̸�, ����, ����, ����, ���� ������ �Է¹޾ƾ� ��
	// ��ü����

	Ex5_5_student student = new Ex5_5_student();
	
	 System.out.print("�̸��� �Է��ϼ��� : ");
	 student.name = sc.nextLine();
	 
	 System.out.print("�������� : ");
	 student.kor = sc.nextDouble();
	 
	 System.out.print("�������� : ");
	 student.eng = sc.nextDouble();
	 
	 System.out.print("�������� : ");
	 student.mat = sc.nextDouble();
	 
	 System.out.print("�������� : ");
	 student.sci = sc.nextDouble();
	
	// getSum ȣ��
	 student.getSum();
	// getAvg ȣ��
	 double avg = student.getAvg();
	// getRank ȣ�� -> ���� ��������� ��������� �� 
	 student.getRank(avg);
	}

}
