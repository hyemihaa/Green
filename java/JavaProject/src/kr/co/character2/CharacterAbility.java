package kr.co.character2;

public class CharacterAbility {
//	2. CharacterAbility 클래스 생성
//	  -> str(힘)
//	  -> dex(민첩)
//	  -> knowledge(지력)
//	  -> level(레벨, 초기값 1)
//	  -> experience(경험치, 100이 될 경우 레벨이 1 증가하고 경험치는 0이 됩니다. 0 <= 경험치 <=100)
//	  -> hp(체력, 초기값 100, 레벨업 해도 회복 안됌 0 <= 체력 <=100)
//	  -> mp(마력, 초기값 100, 레벨업 해도 회복 안됌 0 <= 마력 <=100)
//	  -> 단, 모든 변수의 접근제어자는 private
	
	private int str; //힘
	private int dex; //민첩
	private int knowledge; //지력
	private int level = 1; // 레벨
	private int experience; // 경험치
	private int hp = 100; //체력
	private int mp = 100; //마력
	
	CharacterAbility() {}
	
//	3. setter/getter 생성
	
	public void setStr(int str) {  //값을 넣을때 사용할 메서드
		this.str += str;
	}
	public void setDex(int dex) {
		this.dex += dex;
	}
	public void setKnowledge(int knowledge) {
		this.knowledge += knowledge;
	}
	public void setLevel() {	
		if(this.experience >= 100) { // 경험치가 100이상일 경우,
			System.out.println("경험치 100달성 레벨업 하셨습니다.");
			this.experience -= 100;  // 1. this.experience = this.experience(인스턴스변수) - 100
			this.level++;			 // 2. this.level + 1  --> this.level 초기값 = 1;
		}
	}
	public void setExperience(int experience) {
		this.experience += experience; // 경험치 초기값 = 0; 
	//--> this.experience = this.experience(인스턴스변수) + experience(매개변수)
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
	
	
	public int getStr() {  //값을 가져올 때 사용할 메서드
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
