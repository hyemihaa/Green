package kr.co.quiz;

public class Ex9_2_cat extends Ex9_2_Animal {
	
	public Ex9_2_cat(String name, int age) {
	//	1. super()
		super(name, age);
	//  2. super.  -> 부모클래스에 기본생성자가 있어야 사용이 가능함
	//	super.name = name
	//	super.age = age
	}
	
//	public void meow() {
//		System.out.println("야옹~");
//	}
	
	// sleep메소드
	@Override
	public void sleep() {
		System.out.println("sleep 메소드 오버라이딩 함");
	}
	@Override
	public void makeSound() {
		System.out.println("동물들이 소리를 냅니다.");
		System.out.println(name + " " + age + " 이가 야옹~ 하고 소리를 냅니다.");
	}
	
	
	
	
	
}
