package kr.co.green;

public class Ex9_2_Extends_Cat extends Ex9_2_Extends_Animal {
	
	public Ex9_2_Extends_Cat(String name, int age) {
// 		생성자 super() : 부모클래스의 생성자를 호출할 때 사용
// 		* 반드시 첫줄에 선언되어야 함
//  ex) super(인자값1, 인자값2); -> 부모클래스의 생성자 매개변수와 동일하게 써야함
		super(name, age);
	}
	
	public void meow() {
		System.out.println("야옹~");
		System.out.println();
	}
	
	@Override
	public void sleep() {
		System.out.println("오버라이딩 메소드");
		System.out.println("고양이가 잠을 자고 있습니다." + "(" + age + "살 이름 : " + name + ")");
	}
	@Override
	public void makeSound() {
		System.out.println("야옹~ 하고 소리를 냅니다.");
		System.out.println("이름 : " + name + " " + age + "살 ");
	}
}
