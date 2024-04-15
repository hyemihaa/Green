package kr.co.quiz;

public class Ex5_2_minMax {
	//최소값을 구하는 메소드
	//매개변수 : 배열(int[] 변수명)
	
	//최소값을 구하고
	
	//구한 값을 return
	
//	public 반환타입 메소드명(int[] 변수명) {
//		//최소값을 구하는 코드 작성
//		return 최소값;
//	}

	//	최소값 구하기
	
//	public void num(int[] minNum) {
//		int min = minNum[0];
//		for(int i = 1; i<minNum.length; i++) {
//			if(min > minNum[i]) {
//				min = minNum[i];
//			}
//		}
//	}
	

	//최소값 구하기 return
	public int minResult(int[] minNum) {
		int min = minNum[0];
		for(int i = 1; i<minNum.length; i++) {
			if(min > minNum[i]) { //min 보다 numbers가 작은 값 
				min = minNum[i]; // true일때 min에 대입
			}
		}
		return min;
		
	}
	
	
	//최대값 구하기 return
	public int maxResult(int[] maxNum) {
		int max = maxNum[0];
		for(int i = 1; i < maxNum.length; i++) {
			if(max < maxNum[i]) {
				max = maxNum[i];
			}
		}
		return max;
	}
		
//	public void accelerate() {
//		System.out.println("자동차가 가속합니다.");
//	}

	
	
	// 받는 데이터의 숫자가 정해지지 않았을 경우 (가변인자는 배열로 취급) -> 매개변수는 한개만 입력해도 오류X
	//						매개변수는 가장 마지막에 설정
	public int getMin(int num1, int... num2) {
		System.out.println(num1 + " " + num2);
		
		for(int num : num2) {
			System.out.println(num);
		}
		
		return 0;
	}
	
	
	

	

	    
	
	

	
	
	
}

