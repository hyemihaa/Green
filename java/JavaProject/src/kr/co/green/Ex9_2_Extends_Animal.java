package kr.co.green;

public class Ex9_2_Extends_Animal {
	
	public String name;
	public int age;
	
	
	public Ex9_2_Extends_Animal() {} //�⺻�����ڰ� �־��  �ڽ�Ŭ�������� �������� super. ��밡��
	
	public Ex9_2_Extends_Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void makeSound() {
		System.out.println("�������� �Ҹ��� ���ϴ�.");
	}
	
	public void eat() {
		System.out.println("�������� �Դ� ���Դϴ�." + age + "�� " + "�̸�: " + name);
	}
	public void sleep() {
		System.out.println("����̰� ���� �ڰ� �ֽ��ϴ�." + age + name);
	}
	
}
