package kr.co.green;

public abstract class Ex12_1_Plant extends Ex12_1_Organism{  // -> 추상메서드 모두 구현하지 않아서 추상클래스이다. 
	@Override
	public void eat(){
		System.out.println("식물이 광합성을 합니다.");
	}
//	public abstract void breathe();
//	@Override
//	public void breathe() {
//		System.out.println("식물이 교환기능을 통해 숨을 쉽니다.");
//	}
	
}

class Ex12_A extends Ex12_1_Plant{        // 위 클래스(Ex12_1_Plant)에서 breathe메소드(오버라이딩) 사용X 
	@Override                             // -> 다른 클래스(Ex12_A)를 만들어 breathe메소드(오버라이딩)해야 한다.
	public void breathe() {		          // -> 즉, 여러개의 추상 메소드중 일부만 구현할 경우 
		System.out.println("A클래스");      // -> 추상클래스로 만들어 줘야한다. 아니면 상속된 클래스에 일부 추상클래스를 구현 해야함
	}
}	
	
	



