package kr.co.quiz;

import java.util.Scanner;

public class Ex1_Operator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	      
	    System.out.print("������� �̸��� �Է��ϼ���: ");
	    String name = sc.nextLine();
	    
	    System.out.print("���� ���� : ");
	    int kor = sc.nextInt();
	     
	    System.out.print("���� ���� : ");
	    int eng = sc.nextInt();
	     
	    System.out.print("���� ���� : ");
	    int mat = sc.nextInt();
	     
	    System.out.print("���� ���� : ");
	    int sci = sc.nextInt();

//	    1. ����� �̸��� ���� �̸��� �´��� Ȯ���ϰ� �´ٸ� "�����Դϴ�."
//	    					   Ʋ���ٸ� "������ �ƴմϴ�." ���
//	    				.equals ���ڿ� ��
	    String isMe = name.equals("����") ? "�����Դϴ�." : "������ �ƴմϴ�.";
	    System.out.println(isMe);
	    
	    //System.out.println(name.equals("����") ? "���� �Դϴ�." : "������ �ƴմϴ�.");
	    
//	    2. ����, ����, ����, ������ �հ������� ��������� ����ϼ���
	    
	    int sum = kor + eng + mat + sci;
	    int avg = sum/4;
	    
	    System.out.println("�հ�� : " + sum);
	    System.out.println("����� : " + avg);
	    
	  
	    
	    
	}

}
