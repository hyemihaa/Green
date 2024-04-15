package kr.co.quiz;

	// 인터페이스 ( -> 부모클래스는 인터페이스만 가능)
public interface Ex12_2_item2 {

	public static final String name = "asd"; // 클래스변수(static) + 상수(final)
	public static final double price1 = 10.1; // 클래스변수
	public final double price2 = 10.1; // 상수

	public abstract void use(); // 추상메서드
}
