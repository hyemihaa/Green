package kr.co.quiz;

// ItemŬ�������
public class Ex12_1_pen extends Ex12_1_item {
	public String color;
	
	public Ex12_1_pen(String name, double price, String color) {
//	�������� super�� �θ�����ڿ� �⺻�����ڸ� �����ؾ� ��밡��
		super.name = name;
		super.price = price;
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
