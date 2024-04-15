package kr.co.green;

public class Ex5_Object_Method {

	public static void main(String[] args) {
		
		// class -> 틀
		// 메소드 -> 기능을 수행
		// 객체 생성
		// 메소드 호출
		// 값을 메소드에게 넘겨줄 수 있음
		// 메소드 - 관례적으로 카멜표기법 (첫자는 소문자) 
		
		// 객체 생성 (= 인스턴스화)
		// Ex5_Object_Method 클래스를 메모리에 올리는 과정
		
		// 메소드를 만든 클래스가 있으면 객체를 생성할 때 
		// 클래스명 변수명 = new 클래스명();
		Ex5_Object_Method m = new Ex5_Object_Method(); 
		
		// 변수명.메소드명();
		String printStr = "Hello, Method!";
		m.print(printStr);
	//	int addNum = 1+2
	//  int resultAdd = m.add(addNum);  	
		int resultAdd = m.add(1,2);   
		System.out.println("add : " + resultAdd);
		m.sub(20, 10);
	 // m.sub(20, "AB");
		
		
		// 계산기 클래스(Ex5_1_calc)를 객체 생성
		Ex5_1_Object_Calc calc = new Ex5_1_Object_Calc();
		
		//calc.add(100,50); // 100 + 50 메소드한테 값 전달
		int resultAdd2 = calc.add(100,50);
		//calc.div(777,5); // 777 / 5  메소드한테 값 전달
		int resultDiv = calc.div(777,5);
		
		calc.sub(200,150); // 200 - 150  메소드한테 값 전달
		
		//calc.mul(1000,23); // 1000 * 23  메소드한테 값 전달
		String resultMul = calc.mul(1000, 23);
		
		
		
		// 동물 클래스 객체 생성
		Ex5_2__Object_Animal animal = new Ex5_2__Object_Animal();
		
		//eat메소드는 1을 반환
		
		String eat ="먹는중";
		
		int resultEat = 1; //"먹는중"이라는 문자열 전달 후 출력
		// 반환 받은 값 출력
		System.out.println(resultEat);
		
		// sleep메소드는 2를 반환
		//animal.sleep();  // "동물이 소리를 냅니다"이라는 문자열 전달후 출력
		int resultSleep = 2;
		String sleep ="동물이 소리를 냅니다";
		// 반환 받은 값 출력
		System.out.println(resultSleep);
		
		// makeSound메소드는 3를 반환
		animal.makeSound();  // "자는중"이라는 문자열 전달 후 출력
		// 반환 받은 값 출력
		
	}
	
	
	//메서드 생성
	

	
	// 덧셈을 수행하는 메소드 생성    --> void : 반환 값 없음(return 작성 X)
	//  public void add(int addNum) {
	//  System.out.println(addNum);
	//	}

	// 덧셈을 수행하는 메소드 생성 --> 반환 - return 필수 (ex) int, boolean, string, int[], ...)
	// 반환하는 값과 데이터 타입을 일치 시켜야 한다.
	public int add(int num1, int num2) { 
		return num1 + num2 ;  // return 반환값;   -->메소드 실행 후 어떠한 결과 값을 호출한 곳으로 되돌려줌(반환시킴)
	}
	
	
	// 출력해주는 메소드       매개변수  
	public void print(String printStr) {
		System.out.println(printStr);
	}
	
	// 뺄셈을 수행하는 메소드
			//  sub(int num1, String str)
	public void sub(int num1, int num2) {
		System.out.println(num1);
		
		System.out.println(num2);
	
		System.out.println("뺄셈 결과 : " + (num1-num2));
	}
	
	
	
	
	
	
	
}
