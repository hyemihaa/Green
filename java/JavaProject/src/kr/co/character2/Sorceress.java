package kr.co.character2;

public class Sorceress extends Character {
//	Sorceress 클래스에는 아래와 같은 메소드가 있습니다.
//	   -> Sorceress 객체 생성 시 힘10, 민첩10, 지력50으로 생성됩니다.
//	   -> attack() : "지팡이를 휘두릅니다.", 경험치 25 증가, 체력 10 감소
//	                     체력이 0일 경우 attack() 사용 불가
//	   -> skill() : "아이스 애로우를 사용 합니다." 출력, 경험치 50 증가, 마력 10 감소
//	                   마력이 0일 경우 skill() 사용 불가
//	   -> levelUp() : "레벨업을 하여 지력이 5 증가 합니다." 출력 및 지력 5 증가
	
	public Sorceress() {		 
		super.ca.setStr(10); //힘 : 10
		super.ca.setDex(10); // 민첩 : 10
		super.ca.setKnowledge(50); // 지력 : 50
	}
	@Override
	public void sttack() {
		if(super.ca.getHp() > 0) { // 체력이 0이상일 경우 공격 - 경험치 25증가, 체력10감소  
			System.out.println("---------공격---------");
			System.out.println("지팡이를 휘두릅니다.");
			super.ca.setExperience(25); 
			super.ca.setHp(-10);
			System.out.println("------------------");
		}
		else if(super.ca.getHp() == 0) { // 체력이 0일 경우 공격 불가
			System.out.println("------------공격불가-------------");
			System.out.println("체력이 떨어져서 공격을 할 수 없습니다.");
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
			System.out.println("---------스킬사용---------");
			System.out.println("아이스 애로우를 사용 합니다.");
			super.ca.setExperience(50); //경험치 50증가
			super.ca.setMp(-10); // 마력10 감소
			System.out.println("------------------");
		}
		else if (super.ca.getMp() == 0) {
			System.out.println("------------스킬불가-------------");
			System.out.println("마력이 떨어져서 스킬을 사용할 수 없습니다.");
		}
		if (super.ca.getExperience() >= 100) {
			super.ca.setLevel();
			
			this.levelUp();
		}
		chInfo();
	}	
	
	public void levelUp () {		
		super.ca.setKnowledge(5); // 레벨업할 경우 지력 증가
		System.out.println("레벨업을 하여 지력이 5 증가 합니다." + " 지력 : " + super.ca.getKnowledge());
	}
	@Override
	public void chInfo() {
		System.out.println("현재 힘 : " + super.ca.getStr() + " 현재 민첩 : " + super.ca.getDex() + " 현재 지력 : " + super.ca.getKnowledge());
		System.out.println("현재 체력 : " + super.ca.getHp() + " 현재 마력 : " + super.ca.getMp());
		System.out.println("현재 경험치 : " + super.ca.getExperience() + " 현재 레벨 : " +super.ca.getLevel());
	}
}
