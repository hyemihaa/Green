package kr.co.quiz;

// 인터페이스 ( -> 부모클래스는 인터페이스만 가능)
public interface Ex12_4_Board {
	public abstract String insert();  // 추상메서드
	public abstract String edit();
	public abstract String delete();
	
	final String WRITER = "홍길동";	// 상수
}
