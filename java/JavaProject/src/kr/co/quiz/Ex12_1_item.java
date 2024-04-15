package kr.co.quiz;

//물건(Item) 이라는 추상화클래스가 있습니다.	
public abstract class Ex12_1_item {

//	Item 추상화 클래스에는 아래와 같은 멤버 변수가 있습니다.
	public String name;
	public double price;
	
//  Item 추상화 클래스에는 아래와 같은 메소드가 있습니다.
//	매개변수 있는 생성자(name, price)
	public Ex12_1_item() {}
	public Ex12_1_item (String name, int price) {
		this.name = name;
		this.price = price;
	}
//	use 추상화 메소드
	public abstract void use();

}
