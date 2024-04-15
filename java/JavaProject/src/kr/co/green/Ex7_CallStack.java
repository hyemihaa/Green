package kr.co.green;

import java.util.Arrays;

public class Ex7_CallStack {

   public static void main(String[] args) {                                                            
      Ex7_CallStack cs = new Ex7_CallStack();
      
      // �⺻�� ���� -> ���� ����
      int num = 10;
      System.out.println("�޼ҵ� ȣ�� �� : " + num);   // -> 10
      cs.changeInt(num);
      System.out.println("�޼ҵ� ȣ�� �� : " + num);   // -> 10
      
      System.out.println("------------------------");
      
      // ������ ����  -> �ּҰ� ���� 
      int[] numArr = {10, 20, 30};       // toSring() : ��ü�� ���ڿ��� �����ϴ� �޼ҵ�
      System.out.println("�޼ҵ� ȣ�� �� : " + Arrays.toString(numArr)); // -> [10, 20, 30]
      cs.changeArr(numArr);
      System.out.println("�޼ҵ� ȣ�� �� : " + Arrays.toString(numArr)); // -> [10, 1000, 30]
   }
   
   public void changeInt(int num) {
	   num = 1000;
	   System.out.println("changeInt �޼ҵ� ȣ�� : " + num); // -> 1000
   }
   
   public void changeArr(int[] numArr) {
      numArr[1] = 1000;
      System.out.println("changeArr �޼ҵ� ȣ�� : " + Arrays.toString(numArr)); // -> [10, 1000, 30]
   }
   

}
