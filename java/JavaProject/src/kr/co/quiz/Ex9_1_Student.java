package kr.co.quiz;

public class Ex9_1_Student extends Ex9_1_Person { //Q1
	public String studentId;
	
	public void study() {
		System.out.println("���θ� �����մϴ�.");
	}
	
	public void studentInfo() {
		System.out.println("�̸� : " + super.name);
		System.out.println("���� : " + super.age);
		System.out.println("�й� : " + studentId);
	}
	
	@Override
	public void displayInfo(String name, int age) {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		studentId = "2025";
		System.out.println("�й� : " + studentId);
	}

}
