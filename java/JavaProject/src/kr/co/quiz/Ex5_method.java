package kr.co.quiz;

import java.util.Scanner;

import kr.co.green.Ex5_1_Object_Car;

public class Ex5_method {

	public static void main(String[] args) {
		// 클래스 생성 : Ex5_1_Car
		// startEngine() : "자동차 엔진을 시작합니다." 출력
		// stopEngine() : "자동차가 엔진을 정지합니다." 출력
		// accelerate() : "자동차가 가속합니다." 출력
		// brake() : "자동차가 감속합니다." 출력
		
		
		// 객체 생성 후 4개 메소드 호출
		
		Ex5_1_Object_Car car = new Ex5_1_Object_Car();
		
		car.brake();
		car.startEngine();
		car.stopEngine();
		car.accelerate();
		
		//숙제
		
		int[] numbers = {20, 31, 34, 55, 77};
		
		//객체 생성(Ex5_2_minMax)
		Ex5_2_minMax minMax = new Ex5_2_minMax();
		//최소값 구하는 메소드 호출(numbers배열)
		
		//반환받은 최소값을 변수 minvalue에 저장 후 출력
		
		int minValue = minMax.minResult(numbers);
		System.out.println("최소값은 : " + minValue);
		
		int maxValue = minMax.maxResult(numbers);
		System.out.println("최대값은 : " + maxValue);
		
					// 받는 데이터의 숫자가 정해지지 않았을 경우 (가변인자) 
		minMax.getMin(10, 20, 30, 40);
		
		
		
//		1. 사용자로부터 반지름을 입력받고 변수(radius)에 저장하세요.
		Scanner sc = new Scanner(System.in);
	
		int radius = sc.nextInt();

		Ex5_method radiusResult = new Ex5_method();

		double area = radiusResult.areaNum(radius);
		System.out.println(area);
		
		double round = radiusResult.roundNum(radius);
		System.out.println(round);
		
	}	
//-----------------------------------------------------------------------------------------		
		
		
//		2. 원의 넓이를 구하는 메소드를 작성하세요.
		
//		  - 이 메소드는 반지름을 매개변수로 받습니다
//		  - 원의 넓이를 반환합니다. (단, 넓이가 10 이상일때만 넓이를 반환하고, 10 미만이라면 0을 반환합니다) 
//		  - 공식 : 3.14 * 반지름 * 반지름
		
		// 원의 넓이 
		public double areaNum(int radius) {
			double areaNum = 3.14 * radius * radius;
			if(areaNum >= 10) {
				return areaNum; 
			}
			else {
				return 0;
			}
		}
		
//		3. 원의 둘레를 구하는 메소드를 작성하세요.
//		  - 이 메소드는 반지름을 매개변수로 받습니다
//		  - 원의 둘레를 반환합니다.
//		(단, 둘레가 15 이상일때만 둘레를 반환하고, 15 미만이라면 0을 반환합니다) 
//		  - 공식 : 2 * 3.14 * 반지름
		
		// 원의 둘레
		public double roundNum(int radius) {
			double roundNum = 2* 3.14 * radius;
			if(roundNum >= 15) {
				return roundNum; 
			}
			else {
				return 0;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	

}
