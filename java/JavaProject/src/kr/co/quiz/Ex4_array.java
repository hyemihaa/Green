package kr.co.quiz;

public class Ex4_array {

	public static void main(String[] args) {
//		1. 5만큼의 길이를 가진 배열을 선언 및 할당하세요.
//		2. 위에서 선언 및 할당한 배열에 아래의 값으로 초기화 하세요.
//		   -> "A", "B", "CD", "E", "FG"
		String[] str = new String[5];
		str[0] = "A";
		str[1] = "B";
		str[2] = "CD";
		str[3] = "E";
		str[4] = "FG";
		System.out.println(str[3]);
		
		String[] strArr = {"A", "B", "CD", "E", "FG"};
		for(int i=0; i<strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		System.out.println();

//		3. 국어, 영어, 수학, 과학 점수를 배열을 만들어서 넣으세요.
//		  -> 국어 점수 : 85
//		  -> 영어 점수 : 80
//		  -> 수학 점수 : 90
//		  -> 과학 점수 : 88
//		String[] score = {"국어 점수 : 85", "영어 점수 : 80", "수학 점수 : 90", "과학 점수 : 88"};
//			for(int i=0; i < score.length; i++) {
//				System.out.println(score[i]);
//			}

//		
//		4. 배열에 있는 값을 모두 합친 후 평균 점수를 출력하세요.
//		int[] num = {85, 80, 90, 88};
//		int avg = 0;
//		int sum = 0;
//			for(int i=0; i < num.length; i++) {
//				sum = sum + num[i];
//			}
//		avg = sum / 4;
//			
//		System.out.println(avg);

//		System.out.println((85+80+90+88)/4);

//		3. 국어, 영어, 수학, 과학 점수를 배열을 만들어서 넣으세요.
//		  -> 국어 점수 : 85
//		  -> 영어 점수 : 80
//		  -> 수학 점수 : 90
//		  -> 과학 점수 : 88
		int[] num = { 85, 80, 90, 88 };
		for (int i = 0; i < num.length; i++) {
			if (i == 0) {
				System.out.println("국어 점수 : " + num[i]);
			} 
			else if (i == 1) {
				System.out.println("영어 점수 : " + num[i]);
			} 
			else if (i == 2) {
				System.out.println("수학 점수 : " + num[i]);
			} 
			else if (i == 3) {
				System.out.println("과학 점수 : " + num[i]);
			}

		}
		System.out.println();

//		4. 배열에 있는 값을 모두 합친 후 평균 점수를 출력하세요.
		int avg = 0;
		avg = (num[0] + num[1] + num[2] + num[3]) / 4;// 계산식 구성 요소가 모두 정수(int)면 -> 결과 값 int(소수점으로 결과X)
		System.out.println("평균 점수 : " + avg);
		
//		double avg = 0;  // 합계점수는 정수 int    평균점수는 실수 double
//		avg = (num[0] + num[1] + num[2] + num[3]) / 4.0;  --> 계산식의 요소중 한쪽은 실수로 만들어야 소수점까지 결과 도출
//		System.out.println("평균 점수 : " + avg);   ->또는 나누는 값을 (double)4; -> 과목점수의 합계식 int형(정수) 이므로 나누는 값을  

		
	}

}
