package kr.co.character1;

public class Archer extends Character {
	public Archer() {
		super(10, 50, 10);
	}
	
	@Override
	public void attack() {
		System.out.println("활을 쏩니다.");
		System.out.println("---------------------------");
	}
	@Override
	public void skill() {
		System.out.println("집중 공격을 사용합니다.");
		System.out.println("---------------------------");
	}
	@Override
	public void levelUp() {
		System.out.println("레벨업을 하여 민첩이 5증가 합니다.");
		super.dex = dex + 5;
		System.out.println("현재 레벨 : " + super.level + " 현재 민첩 : " + super.dex);
		System.out.println("---------------------------");
	}
}
