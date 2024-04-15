package kr.co.green;

public class Ex9_Extends {

	public static void main(String[] args) {
//		 <상속>
//		 다른 클래스가 가지고 있는 멤버(변수+메서드)들을 상속받아서 재활용하는 것
//		 부모와 자식간의 관계 or 조상과 자손
//		 자바는 단일 상속만을 지원함
//		 * 인터페이스 제외, 인터페이스는 다중 상속 가능
		
		Ex9_1_Extends_Child c = new Ex9_1_Extends_Child();
		
		c.childMethod();
		c.parentMethod(); // 상속받은 메소드 (오버라이딩)
		System.out.println(c.parentVar); // 상속받은 변수
		System.out.println("-----------------------------------------------");
		
		Ex9_2_Extends_Cat cat = new Ex9_2_Extends_Cat("팔공이", 2);
		cat.meow();
		cat.sleep();
		cat.makeSound();
		System.out.println("-----------------------------------------------");
		
		Ex9_2_Extends_Dog dog = new Ex9_2_Extends_Dog("뭉봄이", 5);
		dog.bark();
		dog.eat();
		dog.makeSound();
		
	}

}