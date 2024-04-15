package kr.co.quiz;

// Item클래스상속
public class Ex12_1_pen extends Ex12_1_item {
	public String color;
	
	public Ex12_1_pen(String name, double price, String color) {
//	참조변수 super는 부모생성자에 기본생성자를 생성해야 사용가능
		super.name = name;
		super.price = price;
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
