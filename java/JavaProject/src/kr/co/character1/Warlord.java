package kr.co.character1;

public class Warlord extends Character {
	
	public Warlord() {
		super(50, 10, 10);
	}
	@Override
	public void attack() {
		System.out.println("�б⸦ ����մϴ�.");
		System.out.println("---------------------------");
	}
	@Override
	public void skill() {
		System.out.println("���� ������ ����մϴ�.");
		System.out.println("---------------------------");
	}
	@Override
	public void levelUp() {
		System.out.println("�������� �Ͽ� ���� 5���� �մϴ�.");
		super.str = str + 5;
		System.out.println("���� ���� : " + super.level + " ���� �� : " + super.str);
		System.out.println("---------------------------");
	}
	
	
	
}
