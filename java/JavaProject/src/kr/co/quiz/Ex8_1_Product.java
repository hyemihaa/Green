package kr.co.quiz;

public class Ex8_1_Product {
	// 인스턴스 변수 선언
	// name : 상품 이름
	// price : 상품 가격
	// count : 상품 수량
	
	String name;
	int price;
	int count;
	
	
	// 기본 생성자와 매개변수있는 생성자를 만들껀데
	// 매개변수있는 생성자는 아래의 조건에 맞춰 작성
	
	public Ex8_1_Product() {
		
	}
	
	// 1. name, price, count를 받는 생성자
	public Ex8_1_Product(String name, int price, int count) {
		System.out.println(name + "는 " + price +"원 " + count + "개");
	}
	
	// 2. name, price를 받는 생성자
	public Ex8_1_Product(String name, int price) {
		System.out.println(name + "는 " + price +"원 ");
	}
	
}
