package kr.co.quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex13_1_Calc {
	
    public static void divide(int dividend, int divisor) throws ArithmeticException {
        try {
        	int result = dividend / divisor; // 2. ArithmeticException �߻�
        	System.out.println("��: " + result);
        } catch(ArithmeticException e) {
        	System.out.println("���� �߻�");
        	throw e; // 3. �ٽ� ArithmeticException ���� �߻�
        }
    }

    public static void main(String[] args) throws ArithmeticException {
        int dividend = 10;
        int divisor = 0;

        try {
            divide(dividend, divisor); // 1. divide �޼��� ȣ��
            //4. ArithmeticException ���ܸ� �ٽ� ���޹���
        } catch (ArithmeticException e) {
        	System.out.println("���θ޼���"); // 6. ���θ޼��� ���
        }
    }

}














