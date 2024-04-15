package kr.co.green;

// 클래스는 추상메소드가 단 한개라도 있으면 무조건 추상클래스(abstract class)
public abstract class Ex12_1_Organism {
	
	// 추상메소드 : 구현부{}가 없음
	public abstract void eat(); 
	
	public abstract void breathe();
	
	
	public void organism() { // 추상클래스에 일반 메소드 사용 가능
		System.out.println("생물체 입니다.");
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
