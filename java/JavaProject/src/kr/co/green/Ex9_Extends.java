package kr.co.green;

public class Ex9_Extends {

	public static void main(String[] args) {
//		 <���>
//		 �ٸ� Ŭ������ ������ �ִ� ���(����+�޼���)���� ��ӹ޾Ƽ� ��Ȱ���ϴ� ��
//		 �θ�� �ڽİ��� ���� or ����� �ڼ�
//		 �ڹٴ� ���� ��Ӹ��� ������
//		 * �������̽� ����, �������̽��� ���� ��� ����
		
		Ex9_1_Extends_Child c = new Ex9_1_Extends_Child();
		
		c.childMethod();
		c.parentMethod(); // ��ӹ��� �޼ҵ� (�������̵�)
		System.out.println(c.parentVar); // ��ӹ��� ����
		System.out.println("-----------------------------------------------");
		
		Ex9_2_Extends_Cat cat = new Ex9_2_Extends_Cat("�Ȱ���", 2);
		cat.meow();
		cat.sleep();
		cat.makeSound();
		System.out.println("-----------------------------------------------");
		
		Ex9_2_Extends_Dog dog = new Ex9_2_Extends_Dog("������", 5);
		dog.bark();
		dog.eat();
		dog.makeSound();
		
	}

}