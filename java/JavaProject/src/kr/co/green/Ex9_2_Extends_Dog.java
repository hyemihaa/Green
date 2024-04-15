package kr.co.green; 

public class Ex9_2_Extends_Dog extends Ex9_2_Extends_Animal {
	
	public Ex9_2_Extends_Dog(String name, int age) {
//		 참조변수 super. : 부모클래스의 멤버(변수,메서드)를 가리킴
//		 * 부모클래스에 기본생성자가 있어야 함
//  ex) super.변수 / super.메서드명
		super.name = name;
		super.age = age;
		
	}
	public void bark() {
		System.out.println("멍멍");
		System.out.println();
	}
	@Override
	public void eat() {
		System.out.println("오버라이딩 메소드");
		System.out.println("강아지가 먹는 중입니다." + "(" + age + "살" + "이름 : " + name + ")");
	}
	@Override
	public void makeSound() {
		System.out.println("멍멍! 하고 소리를 냅니다.");
		System.out.println("이름 : " + name + " " + age + "살 ");
	}
}





