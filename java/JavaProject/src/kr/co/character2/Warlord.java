package kr.co.character2;

public class Warlord extends Character {
//	Warlord Ŭ�������� �Ʒ��� ���� �޼ҵ尡 �ֽ��ϴ�.
//	   -> Warlord�� ��ü ���� �� ��50, ��ø10, ����10���� �����˴ϴ�.
//	   -> attack() : "�б⸦ �ֵθ��ϴ�." ���, ����ġ 25 ����, ü�� 10 ����
//	                     ü���� 0�� ��� attack() ��� �Ұ�
//	   -> skill() : "���� ������ ��� �մϴ�." ���, ����ġ 30 ����, ���� 10 ����
//	                   ������ 0�� ��� skill() ��� �Ұ�
//	   -> levelUp() : "�������� �Ͽ� ���� 5 ���� �մϴ�." ��� �� �� 5 ����
	
	public Warlord() {		 
		super.ca.setStr(50); //�� : 50
		super.ca.setDex(10); // ��ø : 10
		super.ca.setKnowledge(10); // ���� : 10
	}
	@Override
	public void sttack() {		
		if(super.ca.getHp() > 0) {
			System.out.println("---------����---------");
			System.out.println("�б⸦ �ֵθ��ϴ�.");
			super.ca.setExperience(25);
			super.ca.setHp(-10);
			System.out.println("------------------");
		}
		else if(super.ca.getHp() == 0) {
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
			System.out.println("���� ������ ��� �մϴ�.");
			super.ca.setExperience(30); //����ġ 30����
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
		super.ca.setStr(5); // �������� ��� �� ����
		System.out.println("�������� �Ͽ� ���� 5 ���� �մϴ�." + " �� : " + super.ca.getStr());
	}

	@Override
	public void chInfo() {
		System.out.println("���� �� : " + super.ca.getStr() + " ���� ��ø : " + super.ca.getDex() + " ���� ���� : " + super.ca.getKnowledge());
		System.out.println("���� ü�� : " + super.ca.getHp() + " ���� ���� : " + super.ca.getMp());
		System.out.println("���� ����ġ : " + super.ca.getExperience() + " ���� ���� : " +super.ca.getLevel());
	}
	
	
}
