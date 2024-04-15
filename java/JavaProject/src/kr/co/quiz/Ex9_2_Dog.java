package kr.co.quiz;

public class Ex9_2_Dog extends Ex9_2_Animal {
	
	public Ex9_2_Dog(String name, int age) {
		super(name, age); //부모클래스에 전달 -> 부모 매개변수와 맞춰 적어줘야 함
	}
	@Override
	public void makeSound() {
		System.out.println("동물들이 소리를 냅니다.");
		System.out.println(name + " " + age +" 이가 멍멍! 하고 소리를 냅니다.");
	}
//	public void bark() {
//		System.out.println("멍멍");
//	}
}
