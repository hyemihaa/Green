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
		System.out.println("���� Warlord�� �ɷ�ġ : �� : " + Ablilty.ca.getStr() + " ����ġ : " + Ablilty.ca.getExperience() + " ���� : " + Ablilty.ca.getLevel());
	}	
	public static void info(Sorceress Ablilty) {
		System.out.println("-------------------------------------");
		System.out.println("���� Sorceress�� �ɷ�ġ : ���� : " + Ablilty.ca.getKnowledge() + " ����ġ : " + Ablilty.ca.getExperience() + " ���� : " + Ablilty.ca.getLevel());
	}
	public static void info(Archer Ablilty) {
		System.out.println("-------------------------------------");
		System.out.println("���� Sorceress�� �ɷ�ġ : ��ø : " + Ablilty.ca.getDex() + " ����ġ : " + Ablilty.ca.getExperience() + " ���� : " + Ablilty.ca.getLevel());
	}
	
}
