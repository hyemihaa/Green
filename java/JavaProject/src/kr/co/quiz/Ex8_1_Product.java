package kr.co.quiz;

public class Ex8_1_Product {
	// �ν��Ͻ� ���� ����
	// name : ��ǰ �̸�
	// price : ��ǰ ����
	// count : ��ǰ ����
	
	String name;
	int price;
	int count;
	
	
	// �⺻ �����ڿ� �Ű������ִ� �����ڸ� ���鲫��
	// �Ű������ִ� �����ڴ� �Ʒ��� ���ǿ� ���� �ۼ�
	
	public Ex8_1_Product() {
		
	}
	
	// 1. name, price, count�� �޴� ������
	public Ex8_1_Product(String name, int price, int count) {
		System.out.println(name + "�� " + price +"�� " + count + "��");
	}
	
	// 2. name, price�� �޴� ������
	public Ex8_1_Product(String name, int price) {
		System.out.println(name + "�� " + price +"�� ");
	}
	
}
