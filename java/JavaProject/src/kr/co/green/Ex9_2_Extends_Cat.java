package kr.co.green;

public class Ex9_2_Extends_Cat extends Ex9_2_Extends_Animal {
	
	public Ex9_2_Extends_Cat(String name, int age) {
// 		������ super() : �θ�Ŭ������ �����ڸ� ȣ���� �� ���
// 		* �ݵ�� ù�ٿ� ����Ǿ�� ��
//  ex) super(���ڰ�1, ���ڰ�2); -> �θ�Ŭ������ ������ �Ű������� �����ϰ� �����
		super(name, age);
	}
	
	public void meow() {
		System.out.println("�߿�~");
		System.out.println();
	}
	
	@Override
	public void sleep() {
		System.out.println("�������̵� �޼ҵ�");
		System.out.println("����̰� ���� �ڰ� �ֽ��ϴ�." + "(" + age + "�� �̸� : " + name + ")");
	}
	@Override
	public void makeSound() {
		System.out.println("�߿�~ �ϰ� �Ҹ��� ���ϴ�.");
		System.out.println("�̸� : " + name + " " + age + "�� ");
	}
}
