package kr.co.character2;

public class Character {
//	5. Character Ŭ�������� �Ʒ��� ���� ������ �޼ҵ尡 �ֽ��ϴ�.
//	   -> walk() : "�ɸ��Ͱ� �Ѱ��� �Ƚ��ϴ�." ���
//	   -> stop() : "�ɸ��Ͱ� ����ϴ�." ���
//	   -> attack() : "����" ���
//	   -> skill() : "���� ��ų ���" ���

	CharacterAbility ca = new CharacterAbility();  // �ɸ����� �ɷ�ġ�� �ִ� Ŭ���� ��ü����
	
	public Character() {}
	
	public void walk() {
		System.out.println("�ɸ��Ͱ� �Ѱ��� �Ƚ��ϴ�.");
	}
	public void stop() {
		System.out.println("�ɸ��Ͱ� ����ϴ�.");
	}
	public void sttack() {
		System.out.println("����");
	}
	public void skill() {
		System.out.println("���� ��ų ���");
	}
	
	public void chInfo() { // ���� �ɷ�ġ�� ������ִ� �޼ҵ�
		System.out.println("���� �� : " + "���� ��ø : " + " ���� ���� : ");
		System.out.println("���� ü�� : " + "���� ���� : ");
		System.out.println("���� ����ġ : " + "���� ���� : ");
	}
	
}
