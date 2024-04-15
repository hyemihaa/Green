package kr.co.character1;

public class Game {

	public static void main(String[] args) {
		Warlord w = new Warlord();
		w.attack();
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
