package kr.co.quiz;

public class Ex9_2_Dog extends Ex9_2_Animal {
	
	public Ex9_2_Dog(String name, int age) {
		super(name, age); //�θ�Ŭ������ ���� -> �θ� �Ű������� ���� ������� ��
	}
	@Override
	public void makeSound() {
		System.out.println("�������� �Ҹ��� ���ϴ�.");
		System.out.println(name + " " + age +" �̰� �۸�! �ϰ� �Ҹ��� ���ϴ�.");
	}
//	public void bark() {
//		System.out.println("�۸�");
//	}
}
