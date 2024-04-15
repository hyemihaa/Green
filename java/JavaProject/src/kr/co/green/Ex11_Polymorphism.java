package kr.co.green;

import java.util.ArrayList;

public class Ex11_Polymorphism {
				
	public static void main(String[] args) {
		
//		자식클래스 변수명 = new 부모클래스(); --> 불가능하다
		
		//부모클래스 			자식클래스		
		Ex11_1_Animal a = new Ex11_1_Dog(); // 즉, 데이터 타입을 부모클래스로 하겠다!	
		a.makeSound();                      	
		a.eat();
		a.sleep();
//		a.bark();  에러 부모 클래스가 가지고 있는 필드를 활용할 수 있으나, 내가(Dog) 가진 메소드는 사용할 수 없음
//				 			 (--> 부모는 자식클래스에있는 메서드를 모르기때문에)
		System.out.println("--------------------------------------------------");
		Ex11_1_Dog dog = new Ex11_1_Dog();
		dog.eat(); // 상속 받은 메소드
		dog.sleep(); // 상속 받은 메소드
		dog.makeSound(); // 오버라이딩된 메소드
		
		//Dog클래스가 가지고 있는 메소드
		dog.bark();

		System.out.println("--------------------------------------------------");
//               <내가 넣을 데이터타입>           배열의 크기를 자유롭게 늘려줌( = 동적배열)
		ArrayList<Ex11_1_Animal> list = new ArrayList<>();
		list.add(new Ex11_1_Dog());
		list.add(new Ex11_1_Cat()); // cat에는 메소드가 생성되어 있지 않으므로 상속받은 animal의 메소드가 호출된다.
		//add(미리 만들어진 메소드) - 데이터 추가(배열에 넣을 데이터)
		//					현재 배열 list -> {Ex11_1_Dog(),Ex11_1_Cat()}
		for(Ex11_1_Animal animal : list) {
			animal.makeSound();  // 출력은 Dog,Cat 둘다 
		}
		
		System.out.println("--------------------------------------------------");

		
		// 참조변수 형변환
		//데이터타입(클래스명) 변수명 = (변환할타입)변환할변수;
		Ex11_1_Animal animal = (Ex11_1_Animal)dog; 
		
		// animal클래스가 가지고 있는 메소드
		animal.eat();
		animal.sleep();
		animal.makeSound();
		// Dog클래스가 가지고 있는 메소드(사용 불가)
//		animal.brak(); // animal클래스에 bark()메소드가 없기 때문에 사용 불가
		
		Ex11_1_Dog dog2 = (Ex11_1_Dog)animal; // 데이터타입(클래스명)에 있는 메소드 모두 사용가능
		// 상속받은 메소드
		dog2.eat();
		dog2.sleep();
		dog2.makeSound();
		
		// Dog가 가지고 있는 메소드
		dog2.bark();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
