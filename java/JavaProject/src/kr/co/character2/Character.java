package kr.co.character2;

public class Character {
//	5. Character 클래스에는 아래와 같은 변수와 메소드가 있습니다.
//	   -> walk() : "케릭터가 한걸음 걷습니다." 출력
//	   -> stop() : "케릭터가 멈춥니다." 출력
//	   -> attack() : "공격" 출력
//	   -> skill() : "공통 스킬 사용" 출력

	CharacterAbility ca = new CharacterAbility();  // 케릭터의 능력치가 있는 클래스 객체생성
	
	public Character() {}
	
	public void walk() {
		System.out.println("케릭터가 한걸음 걷습니다.");
	}
	public void stop() {
		System.out.println("케릭터가 멈춥니다.");
	}
	public void sttack() {
		System.out.println("공격");
	}
	public void skill() {
		System.out.println("공통 스킬 사용");
	}
	
	public void chInfo() { // 현재 능력치를 출력해주는 메소드
		System.out.println("현재 힘 : " + "현재 민첩 : " + " 현재 지력 : ");
		System.out.println("현재 체력 : " + "현재 마력 : ");
		System.out.println("현재 경험치 : " + "현재 레벨 : ");
	}
	
}
