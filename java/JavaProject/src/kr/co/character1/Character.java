package kr.co.character1;

public class Character {
	public int str, dex, knowledge, level; //인스턴스변수
	
	public Character() {} // 기본생성자
	
	public Character(int str, int dex, int knowledge) { // 매개변수 있는 생성자
		this.str = str; // 인스턴스 변수를 가리킴 (참조변수 this) 
		this.dex = dex;
		this.knowledge = knowledge;
		this.level++;
		
		
	}
	// 메서드 생성
	public void walk() { 
		System.out.println("케릭터가 한걸음 걷습니다.");
	}
	public void stop() {
		System.out.println("케릭터가 멈춥니다.");
	}
	public void attack() {
		System.out.println("공격");
	}
	public void skill() {
		System.out.println("공통 스킬 사용");
	}
	public void levelUp() {
		System.out.println("레벨업");
	}
	
	
}
