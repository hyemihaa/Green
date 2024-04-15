package kr.co.green;

public class Ex5_Object_Filed { //class 영역
	// 멤버 변수 (인스턴스 변수 + 클래스변수)
	int num = 10; // 인스턴스 변수
	static int classNum = 100; // 클래스 변수 --> 클래식 내에서 static로 선언된 변수)
	
	public static void main(String[] args) {
	
		Ex5_Object_Filed f = new Ex5_Object_Filed();
		System.out.println("인스턴스 변수 : " + f.num);
		
		f.num = 200; //변수
		
		System.out.println("인스턴스 변수 : " + f.num);
		System.out.println(Ex5_Object_Filed.classNum); //클래스명.클래스변수명;
		
		// 사람 클래스에 대한 객체 생성(인스턴스화) -> 데이터가 메모리에 올라가는 순간 인스턴스라고 부름
		Ex5_3_Object_Person p = new Ex5_3_Object_Person(); 
		
		// 클래스 변수 사용
		System.out.println(Ex5_3_Object_Person.phone);
		
		System.out.println("이름 : " + p.name);
		System.out.println("나이 : " + p.age);
		p.walk(); // 메소드 호출
		p.run();
		
		Calc calc = new Calc(); //객체 생성
		calc.instanceNumFirst = 10;
		calc.instanceNumSecond = 20;
		System.out.println(calc.instanceNumFirst + calc.instanceNumSecond);
		
		Calc.classNumThird = 30;   //인스턴스 변수   +    클래스명.변수
		System.out.println(calc.instanceNumFirst + Calc.classNumThird);
		                                            // 클래스변수는 객체생성 없이 사용 가능하다.
		calc.add();
		
	}
	
	public void add() { // 지역변수 --> 메소드{}안에서 선언된 변수
		int localNum = 100; 
	}

} // class 영역


class Calc{ //클래스 생성
	
	public int instanceNumFirst; // 인스턴스 변수
	public int instanceNumSecond; // 인스턴스 변수
	public static int classNumThird; // 클래스 변수
	
	public void add() {
		instanceNumFirst = 10;
		instanceNumSecond = 20;
		System.out.println(instanceNumFirst + instanceNumSecond);
	}
	
	
}





















