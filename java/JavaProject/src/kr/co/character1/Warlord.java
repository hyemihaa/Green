package kr.co.character1;

public class Warlord extends Character {
	
	public Warlord() {
		super(50, 10, 10);
	}
	@Override
	public void attack() {
		System.out.println("둔기를 사용합니다.");
		System.out.println("---------------------------");
	}
	@Override
	public void skill() {
		System.out.println("리프 어택을 사용합니다.");
		System.out.println("---------------------------");
	}
	@Override
	public void levelUp() {
		System.out.println("레벨업을 하여 힘이 5증가 합니다.");
		super.str = str + 5;
		System.out.println("현재 레벨 : " + super.level + " 현재 힘 : " + super.str);
		System.out.println("---------------------------");
	}
	
	
	
}
