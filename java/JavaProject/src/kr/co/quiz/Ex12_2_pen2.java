package kr.co.quiz;

// Ex12_2_pen2 클래스는 Ex12_2_item2 클래스를 상속 
//		 -> 인터페이스 상속시 implements
public class Ex12_2_pen2 implements Ex12_2_item2 {
	
	public String color; 
	
	public Ex12_2_pen2(String name, double price, String color) {
//		참조변수 super는 부모클래스에 기본 생성자가 있어야 사용 가능
		this.color = color;
	}	
	@Override
	public void use() {
		System.out.println("펜으로 쓰기를 합니다.");
	}	
	public String getColor() {
		return this.color;
	}
	
	
	
	
}
