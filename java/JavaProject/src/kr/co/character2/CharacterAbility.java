package kr.co.character2;

public class CharacterAbility {
//	2. CharacterAbility Ŭ���� ����
//	  -> str(��)
//	  -> dex(��ø)
//	  -> knowledge(����)
//	  -> level(����, �ʱⰪ 1)
//	  -> experience(����ġ, 100�� �� ��� ������ 1 �����ϰ� ����ġ�� 0�� �˴ϴ�. 0 <= ����ġ <=100)
//	  -> hp(ü��, �ʱⰪ 100, ������ �ص� ȸ�� �ȉ� 0 <= ü�� <=100)
//	  -> mp(����, �ʱⰪ 100, ������ �ص� ȸ�� �ȉ� 0 <= ���� <=100)
//	  -> ��, ��� ������ ���������ڴ� private
	
	private int str; //��
	private int dex; //��ø
	private int knowledge; //����
	private int level = 1; // ����
	private int experience; // ����ġ
	private int hp = 100; //ü��
	private int mp = 100; //����
	
	CharacterAbility() {}
	
//	3. setter/getter ����
	
	public void setStr(int str) {  //���� ������ ����� �޼���
		this.str += str;
	}
	public void setDex(int dex) {
		this.dex += dex;
	}
	public void setKnowledge(int knowledge) {
		this.knowledge += knowledge;
	}
	public void setLevel() {	
		if(this.experience >= 100) { // ����ġ�� 100�̻��� ���,
			System.out.println("����ġ 100�޼� ������ �ϼ̽��ϴ�.");
			this.experience -= 100;  // 1. this.experience = this.experience(�ν��Ͻ�����) - 100
			this.level++;			 // 2. this.level + 1  --> this.level �ʱⰪ = 1;
		}
	}
	public void setExperience(int experience) {
		this.experience += experience; // ����ġ �ʱⰪ = 0; 
	//--> this.experience = this.experience(�ν��Ͻ�����) + experience(�Ű�����)
	}
	public void setHp(int hp) {
		this.hp += hp;
		
		if(this.hp > 100) {
			this.hp = 100;
		}
		else if(this.hp < 0) {
			this.hp = 0;
		}
	}
	public void setMp(int mp) {
		this.mp += mp;
		
		if(this.mp > 100) {
			this.mp = 100;
		}
		else if(this.mp < 0) {
			this.mp = 0;
		}
	}
	
	
	public int getStr() {  //���� ������ �� ����� �޼���
		return this.str;
	}
	public int getDex() {
		return this.dex;
	}
	public int getKnowledge() {
		return knowledge;
	}
	public int getLevel() {
		return level;
	}
	public int getExperience() {
		return experience;
	}
	public int getHp() {
		return hp;
	}
	public int getMp() {
		return mp;
	}
	
	
	
	
	
	
	
	



}
