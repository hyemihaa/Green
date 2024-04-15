package kr.co.quiz;

public class Ex5_5_student {

	// 이름, 국어, 영어, 수학, 과학 점수를 인스턴스 변수로 생성(변수선언)
	// 변수명 : name, kor, eng, mat, sci
	public String name;
	public double kor;
	public double eng;
	public double mat;
	public double sci;
	
	
	public final double STUDENT_A_AVG = 93.5;
	public final double STUDENT_B_AVG = 56.0;
	public final double STUDENT_C_AVG = 68.5;
	public final double STUDENT_D_AVG = 80.5;
	public final double STUDENT_E_AVG = 73.5;
	
	
	// 성적의 합계를 구하는 getSum 메서드 생성
	public void getSum() {
		double sum = kor + eng + mat + sci;
		System.out.println(name + "님의 합계점수는 " + sum + "점 입니다.");
	}
	// 합계를 구한 후 "---님의 합계 점수는 --점 입니다." 출력
	
	// 성적의 평균을 구하는 gerAvg 메서드 생성
	public double getAvg() {
		double avg = (kor + eng + mat + sci)/4.0;
		System.out.println(name + "님의 평균점수는 " + avg + "점 입니다.");
		return avg;
	}
	
	// 평균를 구한 후 "---님의 평균 점수는 --점 입니다." 출력
	
//------------------------------------- 위에 완료후 
	// 자신의 평균 점수가 몇등인지 확인할 수 있는 getRank 메서드 생성
	// 자신의 평균 점수는 매개변수로 받음
	// 힌트 : STUDENT_A_AVG ~ E -> 배열
	// 배열의 길이 만큼 반복, 조건
	// 조건 : 내가 전달받은 평균점수 < 배열의 요소
	//      count 값 증가
	
	public void getRank(double avg) {
		int count = 1;
		double avgScore[] = {STUDENT_A_AVG, STUDENT_B_AVG, STUDENT_C_AVG, STUDENT_D_AVG, STUDENT_E_AVG}; 
		for(int i = 0; i<avgScore.length; i++) {
			if(avg < avgScore[i]) {
				count++;
			}
		}
		System.out.println("등수 : " + count);
		
	}


	
}
