package kr.co.quiz;

//����(Item) �̶�� �߻�ȭŬ������ �ֽ��ϴ�.	
public abstract class Ex12_1_item {

//	Item �߻�ȭ Ŭ�������� �Ʒ��� ���� ��� ������ �ֽ��ϴ�.
	public String name;
	public double price;
	
//  Item �߻�ȭ Ŭ�������� �Ʒ��� ���� �޼ҵ尡 �ֽ��ϴ�.
//	�Ű����� �ִ� ������(name, price)
	public Ex12_1_item() {}
	public Ex12_1_item (String name, int price) {
		this.name = name;
		this.price = price;
	}
//	use �߻�ȭ �޼ҵ�
	public abstract void use();

}
