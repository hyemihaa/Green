package kr.co.character1;

public class Game {

	public static void main(String[] args) {
		Warlord w = new Warlord(); // 객체 생성
		w.attack(); // Warlord객체의 메서드 호출??
		w.skill();
		w.levelUp();
	
		Sorceress s = new Sorceress();
		s.attack();
		s.skill();
		s.levelUp();
	
		Archer a = new Archer();
		a.attack();
		a.skill();
		a.levelUp();
		
	}

}
