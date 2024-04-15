package kr.co.green;

public class Ex12_abstract {
	// 추상클래스 : 추상메소드가 단 한개라도 있으면 무조건 추상클래스(abstract class)
	//			  -> 멤버변수, 구현부가 있는 메소드 다사용가능
	//			  -> 객체 생성 불가 -> 자식이 구현을 해야 사용가능 
	//							->  ㄴ(추상클래스를 상속받은 자식클래스가 구현부 없는 메소드를 구현해줘야 사용 가능)
	// 추상메소드 : 구현부{}없는 메소드

	public static void main(String[] args) {
		// 추상클래스는 객체 생성 불가 ㄱ
		//Ex12_1_Organism o = Ex12_1_Organism();
		
		Ex12_1_Animal animal = new Ex12_1_Animal();
		animal.eat();
		animal.breathe();
			
//		Ex12_1_Plant plant = new Ex12_1_Plant();  // 오류가 뜨는 이유는 
//												  //-> Ex12_1_Plan 클래스에서 추상메서드가 모두 구현X ->즉, 추상클래스임
	                                              
//		plant.eat();
//		plant.breathe();
	
		Ex12_A a = new Ex12_A();  // Ex12_1_Plan 클래스를 다시 상속 받은 Ex12_A클래스를 사용
		a.eat();
		a.breathe();
		
		
	}

}
