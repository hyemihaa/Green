package kr.co.quiz;

public class Ex9_1_Student extends Ex9_1_Person { //Q1
	public String studentId;
	
	public void study() {
		System.out.println("공부를 시작합니다.");
	}
	
	public void studentInfo() {
		System.out.println("이름 : " + super.name);
		System.out.println("나이 : " + super.age);
		System.out.println("학번 : " + studentId);
	}
	
	@Override
	public void displayInfo(String name, int age) {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		studentId = "2025";
		System.out.println("학번 : " + studentId);
	}

}
