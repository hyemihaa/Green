package kr.co.quiz;

// Ex12_2_pen2 Ŭ������ Ex12_2_item2 Ŭ������ ��� 
//		 -> �������̽� ��ӽ� implements
public class Ex12_2_pen2 implements Ex12_2_item2 {
	
	public String color; 
	
	public Ex12_2_pen2(String name, double price, String color) {
//		�������� super�� �θ�Ŭ������ �⺻ �����ڰ� �־�� ��� ����
		this.color = color;
	}	
	@Override
	public void use() {
		System.out.println("������ ���⸦ �մϴ�.");
	}	
	public String getColor() {
		return this.color;
	}
	
	
	
	
}
