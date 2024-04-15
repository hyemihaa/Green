package kr.co.green;

public class Ex12_1_Animal extends Ex12_1_Organism {
	@Override
	public void eat() {
		System.out.println("동물이 먹이를 먹습니다.");
	}
	@Override
	public void breathe() {
		System.out.println("동물이 숨을 쉽니다.");
	}
}
