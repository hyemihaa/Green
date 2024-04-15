package kr.co.quiz;

public class Ex3_for2 {

	public static void main(String[] args) {
		// <중첩for문>
		
		//Q1. 중첩for문을 사용하여 구구단 프로그램 작성 (2단 ~9단)
		for(int i=2; i<=9; i++) {
			System.out.println(i + "단");
			for(int j=1; j<=9; j++) {
				System.out.println(i*j);
			}
		}
		System.out.println();
		
		//Q2.별찍기
        //	*
        //	**
        //	***
        //	****
        //	*****
        
		for(int i=1; i<=5; i++) { // 5번 반복
			for(int j=1; j<=i; j++) { // 별찍기 개수 i=1 -> j<=1 1번 수행 "*"
				System.out.print("*"); // 		  i=2 -> j<=2 2번 수행 "**"
			}
			System.out.println(); //별 찍은 후 줄바꿈
		}
		
		
		
		
		
		
		
	}

}
