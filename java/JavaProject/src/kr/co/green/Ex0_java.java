package kr.co.green;

import java.util.Scanner;

public class Ex0_java {

	public static void main(String[] args) {
		
		System.out.println("Hello, World!");
		
		// <�ڷ���> - �⺻�ڷ���(����,������,������,�Ǽ���)
		
		int varNum; // ���� ���� (�ڷ��� ������;) : ���� varNum�̶�� ������ ����Ҳ���.
		varNum = 100; // ���� �ʱ�ȭ : ������ ���� �Ҵ��ϴ� ����, varNum�̶�� ������ ���� 100�� �����ϰڴ�.
		
		// System.out.println : Console�� ����� ���ִ� ����
		System.out.println(varNum);
		
		// ����� �ʱ�ȭ : ���� ����� �ʱ�ȭ�� ���ÿ� �ϴ� ��
		int expNum = 200; 
		System.out.println("����� �ʱ�ȭ : " + expNum);
						  
		long longNum = 123456789456123L; // ���� �ڿ� ������l(L) �ٿ��� �Ѵ�. (int�� �����ϱ� ����)
		
		// boolean(����) : true �Ǵ� false
		boolean varBoolean;    // boolean varBoolean = true; (������ʱ�ȭ)
		varBoolean = true;
		System.out.println("boolean : " + varBoolean);
		
		// char : ����(�� ���ڸ� ����) - 'A', 'B', 'C', '��', '��'
		// "AB", "CD", "����", "�ٶ�" : ���ڿ�	
		char varChar;
		varChar = 'A';
		System.out.println("char : " + varChar);
		
		// ������ (byte,short,int,long) + �Ǽ��� (float,double)
		byte varByte = 127;	
		 							   // float : �Ҽ��� 7�ڸ�
		float varFloat = 1.123123123f; // �Ǽ���(float) ǥ���� �� ���ڵڿ� f�� �ٿ��� �Ѵ�. f�� ������ ��� - double�� ��Ÿ��
		System.out.println("float : " + varFloat);
		
		double varDouble = 1.123456789123456789;
		System.out.println("double : " + varDouble);
		
		
		// �����ڷ��� = ����������
		String str = "ABCDE";
		System.out.println("String : " + str);
		
//		 ��� : �� �ѹ��� ����ǰ� ���� ������ �ʴ� �� 
//		 (�빮�ڷ� �̷���� ������ũ ǥ����� ��� - ex)FINAL_NUMBER)
		final int FINAL_NUMBER = 10;
		System.out.println(FINAL_NUMBER);
		
		
		// <����ȯ> 
		//�ڵ�����ȯ (������ ���� �ڷ��� -> ������ ū �ڷ���)
		// byte�� �޸� ũ��� 1byte, int = 4byte
		byte bNum = 127;
		int iNum = bNum;
		System.out.println(iNum);

		int iNum2 =1234;  // intŸ���� 1234���� doubleŸ���� 1234.0���� ����
		double dNum2 = iNum2;
		System.out.println(iNum2);
		System.out.println(dNum2);
		
		// ��������ȯ (������ ū �ڷ��� -> ������ ���� �ڷ���)
		// int : 4byte, double : 8byte
		double dNum3 = 1234.5678;
		int iNum3 = (int)dNum3;  // ��������ȯ
		System.out.println(iNum3);
		
		// ���� �ڷ���(char : 2byte) -> ū �ڷ���(int : 4byte)���� ���� ������ �ڵ�����ȯ
		char ch = 'a';  // 01100001 = 97 (�ƽ�Ű�ڵ忡�� �ҹ��� a = 97)
		int num = ch;  
		
		System.out.println(num);

		
		//<Scanner Class> : ����ڷκ��� �Է��� �޴� Ŭ����
		// ctrl + shift + O 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̸� �Է��ϼ���: ");
		int age = sc.nextInt();
		
		System.out.println("�� ���̴� : " + age);
		sc.nextLine();
		
		System.out.print("�̸��� �Է��ϼ���: ");
		String name = sc.nextLine(); 

		System.out.print("�� �̸��� : " + name);
		
	    System.out.print("�� �̸��� : \n" + name + "\n");  // ���๮��(= �ٹٲ� \n)
	      
	    System.out.println("\"Hello, World\""); // \" �Ǵ� \' -> Ư�����ڸ� ���ڷ� �ν��ؾ� �� �� ��� (Ư������ �տ� ��������)
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
