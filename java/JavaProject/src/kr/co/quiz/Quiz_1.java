package kr.co.quiz;

import java.util.Iterator;
import java.util.Scanner;

public class Quiz_1 {

	public static void main(String[] args) {
////		Ex0~1
//
////		Q1. 아래의 조건에 만족하는 변수를 선언하세요.
//
////		1. 논리형을 넣을 varFalse 변수를 선언하세요.
////		   -> 위에서 선언한 변수를 false로 초기화 하세요.
//		boolean varFalse = false;
////		2. 문자형을 넣을 varChar 변수를 선언하세요.
////		   -> 위에서 선언한 변수를 'Q'로 초기화 하세요.
//		char vatChar = 'Q';
////		3. 정수형 숫자를 넣을 varNum 변수를 선언하세요.
////		   -> 위에서 선언한 변수를 10으로 초기화 하세요.
//		int varNum = 10;
////		4. 문자열을 넣을 varStr 변수를 선언 및 초기화를 동시에 하세요.
////		   -> 값은 "Java"가 들어갑니다.
//		String varstr = "Java";
//
////		Q2. 두개의 정수 변수 a와 b를 선언하고, 각각 5와 3의 값을 할당하세요
//		int a = 5;
//		int b = 3;
////		1. a와 b의 합을 구하고 결과를 출력
//		System.out.println(a + b);
////		2. a와 b의 차이를 구하고 결과를 출력
//		System.out.println(a - b);
////		3. a와 b의 곱을 구하고 결과를 출력
//		System.out.println(a * b);
////		4. a를 b로 나눈 결과를 출력
//		System.out.println(a / b);
////		5. a를 b로 나눈 나머지를 출력
//		System.out.println(a % b);
//		System.out.println();
//
////		Q3. 두개의 문자열을 이어 붙이세요.
////		1. 변수 strFirst 에 문자열 "Hello, " 를 할당
//		String strFirst = "Hello, ";
////		2. 변수 strSecond 에 문자열 "World!"를 할당
//		String strSecond = "World!";
////		3. 두개의 문자열을 이어 붙여 출력
//		System.out.println(strFirst + strSecond);
//		System.out.println();
////		Ex2~3
////		Q1. 1부터 100까지의 숫자 중에서 3의 배수인 숫자만 출력하는 자바 프로그램을 작성
////		1. for 문을 사용하여 1부터 100까지의 숫자를 반복 실행
////		2. if 문을 사용하여 각 숫자가 3의 배수인지를 확인    
////		3. 3의 배수인 경우 해당 숫자를 출력
//
//		for (int i = 0; i <= 100; i++) {
//			if (i % 3 == 0) {
//				System.out.println("3의 배수 : " + i);
//			}
//		}
//		System.out.println();
//
////		Q2. 사용자로부터 국어, 영어, 수학, 과학 성적을 입력받고 평균 점수를 아래 기준에 따라 출력하는 프로그램을 작성
////		1. 90점 이상 : 평균 점수는 A 입니다.
////		2. 80점 이상 : 평균 점수는 B 입니다.
////		3. 70점 이상 : 평균 점수는 C 입니다.
////		4. 60점 이상 : 평균 점수는 D 입니다.
////		5. 50점 이상 : 평균 점수는 E 입니다.
////		6. 50점 미만 : 평균 점수는 F 입니다.
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("국어 점수 : ");
//		int kor = sc.nextInt();
//		System.out.print("영어 점수 : ");
//		int eng = sc.nextInt();
//		System.out.print("수학 점수 : ");
//		int math = sc.nextInt();
//		System.out.print("과학 점수 : ");
//		int sci = sc.nextInt();
//		
//		int avg = (kor + eng + math + sci) / 4;
//		
//		if(avg >= 90) {
//			System.out.println("평균 점수는 A 입니다.");
//		}
//		else if(avg >=80) {
//			System.out.println("평균 점수는 B 입니다.");
//		}
//		else if(avg >=70) {
//			System.out.println("평균 점수는 C 입니다.");
//		}
//		else if(avg >=60) {
//			System.out.println("평균 점수는 D 입니다.");
//		}
//		else if(avg >=50) {
//			System.out.println("평균 점수는 E 입니다.");
//		}
//		else if(avg < 50) {
//			System.out.println("평균 점수는 F 입니다.");
//		}
//		System.out.println();
//		
//		
////		Q3. 이 중에서 가장 큰 수와 가장 작은 수를 찾아 출력
////		1. 임의의 숫자를 할당(숫자의 범위는 1~100)  --> 배열
////		2. for문을 활용하여 최대값과 최소값을 출력
//		
//		int[] arrNum = {10, 25, 50, 4, 77};
//		
//		int max = 0;
//		int min = 100;
//		
//		for(int i=0; i<arrNum.length; i++) {
//			if(arrNum[i] > max) {
//				max = arrNum[i];
//			}
//			if(arrNum[i] < min) {
//				min = arrNum[i];
//			}
//		}
//		System.out.println("최대값 : " + max + " 최소값 : " + min);
//		System.out.println();
//		
////		Ex4
////		Q1. 주어진 배열에서 모든 요소의 합을 계산하여 출력하는 프로그램을 작성
////		1. int[] score = {37, 84, 12, 56, 91, 24, 63}
////		int[] score = {37, 84, 12, 56, 91, 24, 63};
////		int sum = score[0] + score [1] + score[2] + score[3] + score[4] + score[5];
////		System.out.println(sum);
//		int[] score = {37, 84, 12, 56, 91, 24, 63};
//		int sum = 0;
//		for(int i=0; i<score.length; i++) {
//			sum += score[i];
//		}
//		System.out.println(sum);
//		System.out.println();
//		
////		Q2. 사용자로부터 3개의 정수를 입력 받아, 배열에 저장한 후 배열의 요소 중에서 짝수의 개수와 홀수의 개수를 출력하는 자바 프로그램을 작성
////		1. Scanner 클래스를 사용하여 사용자로부터 정수를 입력 받을 수 있습니다.
////		2. 크기가 3인 정수 배열을 선언하고 사용자 입력을 배열에 저장
////		3. for 루프를 사용하여 3번의 입력을 받고 배열에 저장
////		4. 배열을 반복하여 짝수와 홀수를 세고 개수를 출력
//		int eNum = 0;
//		int oNum = 0;
//		int[] arr3 = new int[3];
//		
//		// 입력
//		for(int i=0; i<arr3.length; i++) {
//			arr3[i] = sc.nextInt();
//		}
//		
//		// 짝수/홀수 세기
//		for(int i = 0; i < arr3.length; i++) {
//			if(arr3[i] % 2 == 0) {
//				eNum++;
//			}
//			else
//			{
//				oNum++;
//			}
//		}
//		System.out.println("짝수 : " + eNum + " 홀수 : " + oNum);
//		System.out.println();
//		
////		Q4. 사용자로부터 국어, 영어, 수학, 과학 성적을 입력받고 배열에 담은 후 아래 기준에 따라 출력하는 프로그램을 작성
////		* 힌트 : 과목 4개니까 4번 반복돼야 함
////		1. 90점 이상 : OO의 성적은 A 입니다.
////		2. 80점 이상 : OO의 성적은 B 입니다.
////		3. 70점 이상 : OO의 성적은 C 입니다.
////		4. 60점 이상 : OO의 성적은 D 입니다.
////		5. 50점 이상 : OO의 성적은 E 입니다.
////		6. 50점 미만 : OO의 성적은 F 입니다.
////		ex) 영어의 성적은 A 입니다.  /  과학의 성적은 E 입니다.
//		
//		int[] score1 = new int[4];
//		for(int i=0; i<score1.length; i++) {
//			score1[i] = sc.nextInt();
//		}
//		String[] subject = {"국어", "영어", "수학", "과학"};
//		
//		for(int i=0; i<score1.length; i++) {
//			if(score1[i] >= 90) {
//				System.out.println(subject[i] + "성적은 A 입니다");
//			}
//			else if(score1[i] >= 80) {
//				System.out.println(subject[i] + "성적은 B 입니다");
//			}
//			else if(score1[i] >= 70) {
//				System.out.println(subject[i] + "성적은 C 입니다");
//			}
//			else if(score1[i] >= 60) {
//				System.out.println(subject[i] + "성적은 D 입니다");
//			}
//			else if(score1[i] >= 50) {
//				System.out.println(subject[i] + "성적은 E 입니다");
//			}
//			else if(score1[i] < 50) {
//				System.out.println(subject[i] + "성적은 F 입니다");
//			}
//		}
//		System.out.println();
//		
//		
//		Q3. 배열을 사용해 학생들의 성적 찾기
//		1. int[] scores = {85, 90, 78, 92, 88} 배열을 활용
//		2. 모든 학생의 성적의 평균을 계산하고 출력
//		3. 가장 높은 성적을 가진 학생의 성적을 출력
//		4. 가장 낮은 성적을 가진 학생의 성적을 출력
//		5. 80점 이상을 받은 학생의 수를 계산하고 출력
		
		int[] scores = {85, 90, 78, 92, 88};
		int maxArr = scores[0];
		int minArr = scores[0];
		int scoreCnt =0;
		
		int scoresAvg = (scores[0] + scores[1] + scores[2] + scores[3] + scores[4])/5;
		System.out.println(scoresAvg);
		System.out.println();
		
		for(int i = 0; i < scores.length; i++) {
			if(maxArr < scores[i]) {
				maxArr = scores[i];
			}
			if(minArr >scores[i]) {
				minArr = scores[i];
			}
			if(scores[i] >= 80) {
				scoreCnt++;
			}
		}
		
		
		System.out.println(maxArr);
		System.out.println(minArr);
		System.out.println(scoreCnt);
		
		
		
		
		
		
	}

}
