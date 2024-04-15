package kr.co.quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex13_1_Calc {
	
    public static void divide(int dividend, int divisor) throws ArithmeticException {
        try {
        	int result = dividend / divisor; // 2. ArithmeticException 발생
        	System.out.println("몫: " + result);
        } catch(ArithmeticException e) {
        	System.out.println("예외 발생");
        	throw e; // 3. 다시 ArithmeticException 예외 발생
        }
    }

    public static void main(String[] args) throws ArithmeticException {
        int dividend = 10;
        int divisor = 0;

        try {
            divide(dividend, divisor); // 1. divide 메서드 호출
            //4. ArithmeticException 예외를 다시 전달받음
        } catch (ArithmeticException e) {
        	System.out.println("메인메서드"); // 6. 메인메서드 출력
        }
    }

}














