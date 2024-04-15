package kr.co.character2;

public class CharacterInfo {
	public static void main(String[] args) {
		Warlord wl = new Warlord();
		wl.sttack();
		wl.skill();
		wl.skill();
		wl.skill();
		wl.skill();
		wl.skill();

		info(wl);
		
		System.out.println("-------------------------------");
		Sorceress s = new Sorceress();
		s.skill();
		s.skill();
		s.skill();
		s.skill();
		info(s);
		
		System.out.println("-------------------------------");
		Archer a = new Archer();
		a.skill();
		a.skill();
		a.skill();
		a.skill();
		info(a);

	}
	
	public static void info(Warlord Ablilty)
	{
		System.out.println("-------------------------------------");
		System.out.println("현재 Warlord의 능력치 : 힘 : " + Ablilty.ca.getStr() + " 경험치 : " + Ablilty.ca.getExperience() + " 레벨 : " + Ablilty.ca.getLevel());
	}	
	public static void info(Sorceress Ablilty) {
		System.out.println("-------------------------------------");
		System.out.println("현재 Sorceress의 능력치 : 지력 : " + Ablilty.ca.getKnowledge() + " 경험치 : " + Ablilty.ca.getExperience() + " 레벨 : " + Ablilty.ca.getLevel());
	}
	public static void info(Archer Ablilty) {
		System.out.println("-------------------------------------");
		System.out.println("현재 Sorceress의 능력치 : 민첩 : " + Ablilty.ca.getDex() + " 경험치 : " + Ablilty.ca.getExperience() + " 레벨 : " + Ablilty.ca.getLevel());
	}
	
}
