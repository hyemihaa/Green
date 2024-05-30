package kr.co.character1;

public class Warlord extends Character { // Character 상속
	
	public Warlord() {
		super(50, 10, 10); // 부모생성자 참조 ( 부모클래스에 기본생성자가 있어야 사용 가능)
	}
	@Override // 메서드 오버라이딩
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
