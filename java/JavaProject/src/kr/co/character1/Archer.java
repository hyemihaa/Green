package kr.co.character1;

public class Archer extends Character {
	public Archer() {
		super(10, 50, 10);
	}
	
	@Override
	public void attack() {
		System.out.println("Ȱ�� ���ϴ�.");
		System.out.println("---------------------------");
	}
	@Override
	public void skill() {
		System.out.println("���� ������ ����մϴ�.");
		System.out.println("---------------------------");
	}
	@Override
	public void levelUp() {
		System.out.println("�������� �Ͽ� ��ø�� 5���� �մϴ�.");
		super.dex = dex + 5;
		System.out.println("���� ���� : " + super.level + " ���� ��ø : " + super.dex);
		System.out.println("---------------------------");
	}
}
