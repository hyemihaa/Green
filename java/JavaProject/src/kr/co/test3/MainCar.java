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
	

	
	
// �ڵ��� �������̽� ����	
interface car {
	
	public void start();
	
	public void accelerate();
	
	public void brake();
}
	
	
	
	
	
	
	// ������ī Ŭ���� ����
class SportsCar implements car {
	@Override
	public void start() {
		System.out.println("������ī�� �õ��մϴ�.");
	}
	
	@Override
	public void accelerate() {
		System.out.println("������ī�� �����մϴ�.");
		
	}
	
	@Override
	public void brake() {
		System.out.println("������ī�� �����մϴ�.");
		
	}
}	
	
	
class RegularCar implements car {
	@Override
	public void start() {
		System.out.println("�Ϲ� �ڵ����� �õ��մϴ�.");
	}
		
	@Override
	public void accelerate() {
		System.out.println("�Ϲ� �ڵ����� �����մϴ�.");
			
	}
		
	@Override
	public void brake() {
		System.out.println("�Ϲ� �ڵ����� �����մϴ�.");
			
	}
}





