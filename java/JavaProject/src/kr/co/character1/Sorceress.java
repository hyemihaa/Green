package kr.co.character1;

public class Sorceress extends Character {
	public Sorceress() {
		super(10, 10, 50);
	}
	
	@Override
	public void attack() {
		System.out.println("지팡이를 휘두릅니다.");
		System.out.println("---------------------------");
	}
	@Override
	public void skill() {
		System.out.println("아이스 애로우를 사용 합니다.");
		System.out.println("---------------------------");
	}
	@Override
	public void levelUp() {
		System.out.println("레벨업을 하여 지력이 5증가 합니다.");
		super.knowledge = knowledge + 5;
		System.out.println("현재 레벨 : " + super.level + " 현재 지력 : " + super.knowledge);
		System.out.println("---------------------------");
	}
	
}
