package kr.co.character1;

public class Character {
	public int str, dex, knowledge, level; //인스턴스변수
	
	public Character() {}
	public Character(int str, int dex, int knowledge) {
		this.str = str;
		this.dex = dex;
		this.knowledge = knowledge;
		this.level++;
		
		
	}
	
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
