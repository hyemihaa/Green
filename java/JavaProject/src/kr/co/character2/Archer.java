package kr.co.character2;

public class Archer extends Character {
//	 Archer Ŭ�������� �Ʒ��� ���� �޼ҵ尡 �ֽ��ϴ�.
//	   -> Archer ��ü ���� �� ��10, ��ø50, ����10���� �����˴ϴ�.
//	   -> attack() : "Ȱ�� ���ϴ�.", ����ġ 25 ����, ü�� 10 ����
//	                     ü���� 0�� ��� attack() ��� �Ұ�
//	   -> skill() : "���� ������ ��� �մϴ�." ���, ����ġ 50 ����, ���� 10 ����
//	                   ������ 0�� ��� skill() ��� �Ұ�
//	   -> levelUp() : "�������� �Ͽ� ��ø�� 5 ���� �մϴ�." ��� �� ��ø 5 ����
	public Archer() {		 
		super.ca.setStr(10); //�� : 10
		super.ca.setDex(50); // ��ø : 50
		super.ca.setKnowledge(50); // ���� : 10
	}
	@Override
	public void sttack() {
		if(super.ca.getHp() > 0) { // ü���� 0�̻��� ��� ���� - ����ġ 25����, ü��10����  
			System.out.println("---------����---------");
			System.out.println("Ȱ�� ���ϴ�.");
			super.ca.setExperience(25); // ����ġ 25����
			super.ca.setHp(-10); // ü�� 10����
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
			System.out.println("���� ������ ��� �մϴ�.");
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
		super.ca.setDex(5); // �������� ��� ��ø ����
		System.out.println("�������� �Ͽ� ��ø�� 5 ���� �մϴ�." + " ��ø : " + super.ca.getDex());
	}
	@Override
	public void chInfo() {
		System.out.println("���� �� : " + super.ca.getStr() + " ���� ��ø : " + super.ca.getDex() + " ���� ���� : " + super.ca.getKnowledge());
		System.out.println("���� ü�� : " + super.ca.getHp() + " ���� ���� : " + super.ca.getMp());
		System.out.println("���� ����ġ : " + super.ca.getExperience() + " ���� ���� : " +super.ca.getLevel());
	}
}


