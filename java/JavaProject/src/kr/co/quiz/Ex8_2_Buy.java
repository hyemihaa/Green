package kr.co.quiz;

public class Ex8_2_Buy {
	public int balance;
	public int monitorPrice;
	public int mousePrice;
	public int desktopPrice;
	
	// 기본생성자 
	public Ex8_2_Buy() {
//		this.balance = 10000000;
//		this.monitorPrice = 50000;
//		this.mousePrice = 30000;
//		this.desktopPrice = 1500000;
		this(10000000, 50000, 30000, 1500000); //-> 생성자 this() : 반드시 첫줄에 선언
	}
	
	// 매개변수있는 생성자 (balance, monitorPrice, moucePrice, desktopPrice)
	public Ex8_2_Buy(int balance, int monitorPrice, int mousePrice, int desktopPrice) {
		this.balance = balance;
		this.monitorPrice = monitorPrice;
		this.mousePrice = mousePrice;
		this.desktopPrice = desktopPrice;
				
		
	}
	

	public void buyMonitor() {
		balance = balance - monitorPrice;
		System.out.println("모니터를 구입하셨습니다. 남은 금액은" + balance +"입니다.");
	}
	
	public void buyMouse() {
		balance = balance - mousePrice;
		System.out.println("마우스를 구입하셨습니다. 남은 금액은" + balance +"입니다.");
	}
	
	public void buyDesktop() {
		balance = balance - desktopPrice;
		System.out.println("데스크탑을 구입하셨습니다. 남은 금액은" + balance +"입니다.");
	}
}
