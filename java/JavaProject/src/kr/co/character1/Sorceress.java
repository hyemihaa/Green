package kr.co.character1;

public class Sorceress extends Character {
	public Sorceress() {
		super(10, 10, 50);
	}
	
	@Override
	public void attack() {
		System.out.println("�����̸� �ֵθ��ϴ�.");
		System.out.println("---------------------------");
	}
	@Override
	public void skill() {
		System.out.println("���̽� �ַο츦 ��� �մϴ�.");
		System.out.println("---------------------------");
	}
	@Override
	public void levelUp() {
		System.out.println("�������� �Ͽ� ������ 5���� �մϴ�.");
		super.knowledge = knowledge + 5;
		System.out.println("���� ���� : " + super.level + " ���� ���� : " + super.knowledge);
		System.out.println("---------------------------");
	}
	
}
