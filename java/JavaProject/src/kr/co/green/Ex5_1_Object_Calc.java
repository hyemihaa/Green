package kr.co.green;

// 계산기 설계도(틀)
public class Ex5_1_Object_Calc {

	// 덧셈 기능을 수행하는 메서드
	public int add(int addNum,int addNum2 ) { //매개변수로 값 2개 받기
		System.out.println("덧셈 결과 : " + (addNum + addNum2)); //100 + 50
		return addNum + addNum2;  // 호출된 위치로 반환
	}
	
	// 나눗셈(몫) 기능을 수행하는 메서드
		public int div(int divNum, int divNum2) {
			System.out.println("나눗셈(몫) 결과 : " + (divNum / divNum2));
			return divNum / divNum2;
		}
		
	// 뺄셈 기능을 수행하는 메서드 (반환값없는 타입)
	public void sub(int subNum, int subNum1) {
		System.out.println("뺄셈 결과 : " + (subNum - subNum1));
	}
	
	// 곱셈 기능을 수행하는 메서드
	public String mul(int mulNum, int mulNum1) {
		System.out.println("곱셈 결과 : " + (mulNum * mulNum1));
		return "곱셈 성공!";
	}
	
	
	
	
	
	
}
