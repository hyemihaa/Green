package kr.co.test3;

public class MainCar {

	public static void main(String[] args) {
		
		SportsCar sc = new SportsCar();
		sc.start();
		sc.accelerate();
		sc.brake();
		
		
		RegularCar rc = new RegularCar();
		rc.start();
		rc.accelerate();
		rc.brake();
	}
}
	

	
	
// 자동차 인터페이스 생성	
interface car {
	
	public void start();
	
	public void accelerate();
	
	public void brake();
}
	
	
	
	
	
	
	// 스포츠카 클래스 생성
class SportsCar implements car {
	@Override
	public void start() {
		System.out.println("스포츠카를 시동합니다.");
	}
	
	@Override
	public void accelerate() {
		System.out.println("스포츠카를 가속합니다.");
		
	}
	
	@Override
	public void brake() {
		System.out.println("스포츠카를 제동합니다.");
		
	}
}	
	
	
class RegularCar implements car {
	@Override
	public void start() {
		System.out.println("일반 자동차를 시동합니다.");
	}
		
	@Override
	public void accelerate() {
		System.out.println("일반 자동차를 가속합니다.");
			
	}
		
	@Override
	public void brake() {
		System.out.println("일반 자동차를 제동합니다.");
			
	}
}





