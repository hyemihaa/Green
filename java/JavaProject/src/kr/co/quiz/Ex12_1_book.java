package kr.co.quiz;

public class Ex12_1_book extends Ex12_1_item {
	private String author;
	
	
	public Ex12_1_book(String name, double price, String aythor) {
		super.name = name;
		super.price =price;
		this.author = aythor;
		
	}
	
	@Override
	public void use() {
		System.out.println("å�� �н��ϴ�.");
	}
	public String getAuthor() {
		return this.author;
	}
	
	
}
