package kr.co.character1;

public class Character {
	public int str, dex, knowledge, level; //�ν��Ͻ�����
	
	public Character() {}
	public Character(int str, int dex, int knowledge) {
		this.str = str;
		this.dex = dex;
		this.knowledge = knowledge;
		this.level++;
		
		
	}
	
	public void walk() {
		System.out.println("�ɸ��Ͱ� �Ѱ��� �Ƚ��ϴ�.");
	}
	public void stop() {
		System.out.println("�ɸ��Ͱ� ����ϴ�.");
	}
	public void attack() {
		System.out.println("����");
	}
	public void skill() {
		System.out.println("���� ��ų ���");
	}
	public void levelUp() {
		System.out.println("������");
	}
	
	
}
