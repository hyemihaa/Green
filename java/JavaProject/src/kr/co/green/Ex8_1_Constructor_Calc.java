package kr.co.green;

public class Ex8_1_Constructor_Calc {
	int num; // 생성자가 호출되면 멤버 변수 초기화 (num = 0)
	int age;
	String name;
	
	public void add() {
//		int localVar;
//		System.out.println(localVar); // 초기화 X 
		
		System.out.println(num);  // num = 0
		System.out.println("------------------------------");
	}
	
	
	// 기본 생성자
	public Ex8_1_Constructor_Calc() {
		num = 100;
		System.out.println("기본 생성자가 호출되었습니다.");
		System.out.println("------------------------------");
	}

	// 매개 변수 있는 생성자
	public Ex8_1_Constructor_Calc(int num, int age, String name) {
		this.num = num;
		this.age = age;
		this.name = name;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
