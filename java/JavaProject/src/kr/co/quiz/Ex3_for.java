package kr.co.quiz;

import java.util.Random;
import java.util.Scanner;

public class Ex3_for {

	public static void main(String[] args) {
//		Q1. 숫자 1부터, 사용자가 입력한 값만큼 숫자를 출력하는 프로그램을 작성하시오.
//		1. 스캐너로 사용자로부터 숫자를 입력 받으세요.
//		2. 만약, 사용자가 숫자 10을 입력 한다면, 1부터 10까지의 숫자를 출력하면 됩니다.

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.println(i);
		}
		System.out.println();

//		Q2. 짝수를 출력하는 프로그램을 작성하시오.(범위는 1부터 20까지) Scanner 사용하지 않고

		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println();

//   	Q3. 로또 번호를 생성하는 프로그램을 작성 하시오. (6개의 숫자 출력)
		Random rd = new Random();
		int lottoNumber = 0; // 0~44 --> +1 로 인해 1부터 45까지의 숫자를 랜덤으로 나타냄

		for (int i = 0; i < 6; i++) {
			lottoNumber = rd.nextInt(45) + 1;
			System.out.println(lottoNumber);
		}

//		for(int i=0; i<6; i++) { //
//			int lottoNumber = rd.nextInt(45) +1; 
//			System.out.println(lottoNumber);
//			}

//		    
//		Q4. 1부터 100까지의 숫자 중 3과 5의 공배수를 출력하세요.
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("3과 5의 공배수: " + i);
			}
		}

// 		Q5. 10팩토리얼의 값을 출력하세요.(10! = 1*2*3*4*5*6*7*8*9*10)
		int iNum = 1;
		for (int i = 1; i <= 10; i++) { 
			iNum *= i; // iNum = iNum * i
		}
		System.out.println(iNum); 
		
		
		

//		for(int i=1; i<=10; i++) { // for문 안에서 변수를 설정할 경우 -> for문 {}가 끝나는 순간 변수는 쓸 수 없어진다.
//			int iNum = 1;
//			iNum  = i*iNum ;
//		}
//		System.out.println("팩토리얼은 " + iNum); // for문 밖에서 int = iNum는 사용할수 없다.(실행 시 에러 발생)
		

	}

}
