package kr.co.quiz;

public class Ex9_2_cat extends Ex9_2_Animal {
	
	public Ex9_2_cat(String name, int age) {
	//	1. super()
		super(name, age);
	//  2. super.  -> �θ�Ŭ������ �⺻�����ڰ� �־�� ����� ������
	//	super.name = name
	//	super.age = age
	}
	
//	public void meow() {
//		System.out.println("�߿�~");
//	}
	
	// sleep�޼ҵ�
	@Override
	public void sleep() {
		System.out.println("sleep �޼ҵ� �������̵� ��");
	}
	@Override
	public void makeSound() {
		System.out.println("�������� �Ҹ��� ���ϴ�.");
		System.out.println(name + " " + age + " �̰� �߿�~ �ϰ� �Ҹ��� ���ϴ�.");
	}
	
	
	
	
	
}
