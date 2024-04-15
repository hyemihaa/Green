package kr.co.quiz;

import java.util.*;

import java.util.Scanner;

public class Ex13_2_Calc {
   public static void main(String[] args) {
      CalcProgram cp = new CalcProgram();
      CalcDto cd = new CalcDto();
      Scanner sc = new Scanner(System.in);
      boolean isTrue = true;
      int choice = -1;
      
      // 1. ������ �� ���ܰ� �ߴµ� �ذ�
      // 2. ���� �߻� ���ɼ��� �ִ� �κе��� try-catch�� "���� �߻�" ��� 
      while (isTrue) {
         // 1. ���ܰ� �߻��� ���ɼ��� �ִ� �ڵ尡 �������?
         // 2. � ���ܰ� �߻��Ұ����� �����Ǵ���?
         // 3. ���ܰ� �߻����� �� � ó���� �Ұ�����?
         
         System.out.println("���� ���α׷�");
         System.out.println("1. ���� ");
         System.out.println("2. ���� ");
         System.out.println("3. ���� ");
         System.out.println("4. ������(��) ");
         System.out.println("5. ������(������) ");
         System.out.println("0. ����");
         System.out.print("���ϴ� �۾��� �����ϼ��� : ");
         
         try {
        	 choice = sc.nextInt();
         }
         catch(InputMismatchException e) {
        	 System.out.println("���ڸ� �Է��ϼ���");
        	 sc.nextLine();
         }
         
         switch (choice) {
         case 1:
            cp.inputNum(cd);
            cp.add(cd);
            break;
         case 2:
        	cp.inputNum(cd);           
        	cp.sub(cd);
            break;
         case 3:
        	cp.inputNum(cd);           
        	cp.mul(cd);
            break;
         case 4:
        	cp.inputNum(cd);           
        	cp.divShare(cd);
            break;
         case 5:
        	cp.inputNum(cd);           
         	cp.divRemain(cd);
            break;
         case 0:
            System.out.println("���α׷��� �����մϴ�.");
            isTrue = false;
            break;
         default:
            System.out.println("�ùٸ� ��ȣ�� �����ϼ���.");
         }
         System.out.println("--------------------------");
      }
   }
}

class CalcDto {
   int firstNum;
   int secondNum;
   
   public void setFirstNum(int firstNum) {
	   this.firstNum = firstNum;
   }
   public int getFirstNum() {
	   return firstNum;
   }
   public void setSecondNum(int secondNum) {
	   this.secondNum = secondNum;
   }
   public int getSecondNum() {
	   return secondNum;
   }
   
   // getter,setter �ۼ�
}

interface CalcInterface {
   // �Ʒ��� �߻� �޼��� �ۼ�
   // 1. add (����)
   // 2. sub (����)
   // 3. mul (����)
   // 4. divShare (������, ��)
   // 5. divRemain (������, ������)
	public void add(CalcDto cd);
	public void sub(CalcDto cd);
	public void mul(CalcDto cd);
	public void divShare(CalcDto cd);
	public void divRemain(CalcDto cd);
	
}

class CalcProgram implements CalcInterface {
	
   public void inputNum(CalcDto cd) {
	   // ����ڷκ��� �� ���� ���ڸ� �Է¹޴� �ڵ� �ۼ�
	   Scanner sc = new Scanner(System.in);
	  int firstNum = 0;
	  int secondNum = 0;
	  
	   try {
		   System.out.print("ù��° ���� : ");
		   firstNum = sc.nextInt();
		   System.out.print("�ι�° ���� : ");
		   secondNum = sc.nextInt();
	   }
	   catch(InputMismatchException e) {
		   System.out.println("���ڸ� �Է��ϼ���");
		   sc.nextInt();
	   }
      // �Է¹��� �� ���� ���ڴ� CaclDto�� ����
      // ù��°�� �Է��� ���� : firstNum
      // �ι�°�� �Է��� ���� : secondNum
	   				//�Է¹޴� ���� ���� �־ �ȴ�(sc.nextInt())
	   cd.setFirstNum(firstNum);
	   cd.setSecondNum(secondNum);
   }

   // CalcInterface���� �ۼ��� �߻� �޼��带 ��� ����
   @Override
	public void add(CalcDto cd) {
		int addNum = cd.getFirstNum() + cd.getSecondNum();
		System.out.println("���� : " + addNum);
	}
   @Override
	public void sub(CalcDto cd) {
	   int subNum = cd.getFirstNum() - cd.getSecondNum();
	   System.out.println("���� : " + subNum);
	}
   @Override
	public void mul(CalcDto cd) {
	   int mulNum = cd.getFirstNum() * cd.getSecondNum();
	   System.out.println("���� : " + mulNum);
	}
   @Override
	public void divShare(CalcDto cd) {
	   try {
		   int divShareNum = cd.getFirstNum() / cd.getSecondNum();
		   System.out.println("������(��) : " + divShareNum);
	   }
	   catch(ArithmeticException e) {
		   System.out.println("0���� ���� �� �����ϴ�.");
	   }
	}
   @Override
	public void divRemain(CalcDto cd) {
	   int divRemainNum = cd.getFirstNum() % cd.getSecondNum();
	   System.out.println("������(������) : " + divRemainNum);
	}
   
}