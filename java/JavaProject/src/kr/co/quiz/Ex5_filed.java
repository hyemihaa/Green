package kr.co.quiz;

import java.util.Scanner;

public class Ex5_filed {

	public static void main(String[] args) {
	// Q2 Ex5_3_Buy
    // 1.Buy클래스 생성 
    // 2.초기 금액(소지금)을 설정하기 위한 변수 설정  ->Buy클래스의 인스턴스 변수
    // int balance = 100000
    	
	Ex5_3_Buy buy = new Ex5_3_Buy();
	
		
	
    // 3. 물건들의 가격 설정
    // 모니터 20000(변수명 monitorPrice)
    // 마우스 18000(변수명 mousePrice)
    // 데스크탑 70000(desktopPrice)
    	
    // 4. 각각의 물품을 구매하기 위한 메서드 생성
    // -> buyMonitor, buyMouse, buyDesktop
    // -> 해당하는 금액 만큼 소지금에서 제외
    // -> "---을 구입하셨습니다. 남은 금액은 -----원 입니다." 메세지 출력
    	
	buy.buyMonitor();
	buy.buyMouse();
	buy.buyDesktop();
	
    // * 소지금은 -가 될 수 없음 
    
	
Ex5_3_Buy buyNum = new Ex5_3_Buy();
	
	buyNum.buyMonitor();
	buyNum.buyMouse();
	buyNum.buyDesktop();
	
	
	// Q3 Ex5_4_rating
	// 사용자로부터 숫자 1개를 입력받음(double)
	Scanner sc = new Scanner(System.in);
	System.out.println("평점을 입력하세요 : ");
	
	double input = sc.nextDouble();
	
	// 객체생성
	Ex5_4_rating rating = new Ex5_4_rating();
	//생성된 객체의 getAvgRating 메서드를 호출하면서, 입력받았던 값 전달
	
	//getAvgRating 메서드로부터 반환받은 평균점수를 result 변수에 저장후 출력
	double result = rating.getAvgRating(input);
	System.out.println("결과 : " + result);
	
	
	// Q4  Ex5_5_student
	// 사용자로부터 이름, 국어, 영어, 수학, 과학 점수를 입력받아야 함
	// 객체생성

	Ex5_5_student student = new Ex5_5_student();
	
	 System.out.print("이름을 입력하세요 : ");
	 student.name = sc.nextLine();
	 
	 System.out.print("국어점수 : ");
	 student.kor = sc.nextDouble();
	 
	 System.out.print("영어점수 : ");
	 student.eng = sc.nextDouble();
	 
	 System.out.print("수학점수 : ");
	 student.mat = sc.nextDouble();
	 
	 System.out.print("과학점수 : ");
	 student.sci = sc.nextDouble();
	
	// getSum 호출
	 student.getSum();
	// getAvg 호출
	 double avg = student.getAvg();
	// getRank 호출 -> 나의 평균점수를 전달해줘야 함 
	 student.getRank(avg);
	}

}
