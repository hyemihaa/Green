package kr.co.green; 

public class Ex9_2_Extends_Dog extends Ex9_2_Extends_Animal {
	
	public Ex9_2_Extends_Dog(String name, int age) {
//		 �������� super. : �θ�Ŭ������ ���(����,�޼���)�� ����Ŵ
//		 * �θ�Ŭ������ �⺻�����ڰ� �־�� ��
//  ex) super.���� / super.�޼����
		super.name = name;
		super.age = age;
		
	}
	public void bark() {
		System.out.println("�۸�");
		System.out.println();
	}
	@Override
	public void eat() {
		System.out.println("�������̵� �޼ҵ�");
		System.out.println("�������� �Դ� ���Դϴ�." + "(" + age + "��" + "�̸� : " + name + ")");
	}
	@Override
	public void makeSound() {
		System.out.println("�۸�! �ϰ� �Ҹ��� ���ϴ�.");
		System.out.println("�̸� : " + name + " " + age + "�� ");
	}
}





