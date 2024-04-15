package kr.co.character2;

public class Sorceress extends Character {
//	Sorceress Ŭ�������� �Ʒ��� ���� �޼ҵ尡 �ֽ��ϴ�.
//	   -> Sorceress ��ü ���� �� ��10, ��ø10, ����50���� �����˴ϴ�.
//	   -> attack() : "�����̸� �ֵθ��ϴ�.", ����ġ 25 ����, ü�� 10 ����
//	                     ü���� 0�� ��� attack() ��� �Ұ�
//	   -> skill() : "���̽� �ַο츦 ��� �մϴ�." ���, ����ġ 50 ����, ���� 10 ����
//	                   ������ 0�� ��� skill() ��� �Ұ�
//	   -> levelUp() : "�������� �Ͽ� ������ 5 ���� �մϴ�." ��� �� ���� 5 ����
	
	public Sorceress() {		 
		super.ca.setStr(10); //�� : 10
		super.ca.setDex(10); // ��ø : 10
		super.ca.setKnowledge(50); // ���� : 50
	}
	@Override
	public void sttack() {
		if(super.ca.getHp() > 0) { // ü���� 0�̻��� ��� ���� - ����ġ 25����, ü��10����  
			System.out.println("---------����---------");
			System.out.println("�����̸� �ֵθ��ϴ�.");
			super.ca.setExperience(25); 
			super.ca.setHp(-10);
			System.out.println("------------------");
		}
		else if(super.ca.getHp() == 0) { // ü���� 0�� ��� ���� �Ұ�
			System.out.println("------------���ݺҰ�-------------");
			System.out.println("ü���� �������� ������ �� �� �����ϴ�.");
		}
		if (super.ca.getExperience() >= 100) {
			super.ca.setLevel();
			
			this.levelUp();
		}
		chInfo(); 
		
	}
	@Override
	public void skill() {
		if(super.ca.getMp() > 0) { 
			System.out.println("---------��ų���---------");
			System.out.println("���̽� �ַο츦 ��� �մϴ�.");
			super.ca.setExperience(50); //����ġ 50����
			super.ca.setMp(-10); // ����10 ����
			System.out.println("------------------");
		}
		else if (super.ca.getMp() == 0) {
			System.out.println("------------��ų�Ұ�-------------");
			System.out.println("������ �������� ��ų�� ����� �� �����ϴ�.");
		}
		if (super.ca.getExperience() >= 100) {
			super.ca.setLevel();
			
			this.levelUp();
		}
		chInfo();
	}	
	
	public void levelUp () {		
		super.ca.setKnowledge(5); // �������� ��� ���� ����
		System.out.println("�������� �Ͽ� ������ 5 ���� �մϴ�." + " ���� : " + super.ca.getKnowledge());
	}
	@Override
	public void chInfo() {
		System.out.println("���� �� : " + super.ca.getStr() + " ���� ��ø : " + super.ca.getDex() + " ���� ���� : " + super.ca.getKnowledge());
		System.out.println("���� ü�� : " + super.ca.getHp() + " ���� ���� : " + super.ca.getMp());
		System.out.println("���� ����ġ : " + super.ca.getExperience() + " ���� ���� : " +super.ca.getLevel());
	}
}
