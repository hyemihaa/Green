package kr.co.quiz;

import java.util.Scanner;

public class Ex1_Operator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	      
	    System.out.print("사용자의 이름을 입력하세요: ");
	    String name = sc.nextLine();
	    
	    System.out.print("국어 점수 : ");
	    int kor = sc.nextInt();
	     
	    System.out.print("영어 점수 : ");
	    int eng = sc.nextInt();
	     
	    System.out.print("수학 점수 : ");
	    int mat = sc.nextInt();
	     
	    System.out.print("과학 점수 : ");
	    int sci = sc.nextInt();

//	    1. 사용자 이름이 본인 이름이 맞는지 확인하고 맞다면 "본인입니다."
//	    					   틀리다면 "본인이 아닙니다." 출력
//	    				.equals 문자열 비교
	    String isMe = name.equals("뭉구") ? "본인입니다." : "본인이 아닙니다.";
	    System.out.println(isMe);
	    
	    //System.out.println(name.equals("뭉구") ? "본인 입니다." : "본인이 아닙니다.");
	    
//	    2. 국어, 영어, 수학, 과학의 합계점수와 평균점수를 출력하세요
	    
	    int sum = kor + eng + mat + sci;
	    int avg = sum/4;
	    
	    System.out.println("합계는 : " + sum);
	    System.out.println("평균은 : " + avg);
	    
	  
	    
	    
	}

}
