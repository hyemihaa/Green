package kr.co.quiz;

public class Ex8_2_Buy {
	public int balance;
	public int monitorPrice;
	public int mousePrice;
	public int desktopPrice;
	
	// �⺻������ 
	public Ex8_2_Buy() {
//		this.balance = 10000000;
//		this.monitorPrice = 50000;
//		this.mousePrice = 30000;
//		this.desktopPrice = 1500000;
		this(10000000, 50000, 30000, 1500000); //-> ������ this() : �ݵ�� ù�ٿ� ����
	}
	
	// �Ű������ִ� ������ (balance, monitorPrice, moucePrice, desktopPrice)
	public Ex8_2_Buy(int balance, int monitorPrice, int mousePrice, int desktopPrice) {
		this.balance = balance;
		this.monitorPrice = monitorPrice;
		this.mousePrice = mousePrice;
		this.desktopPrice = desktopPrice;
				
		
	}
	

	public void buyMonitor() {
		balance = balance - monitorPrice;
		System.out.println("����͸� �����ϼ̽��ϴ�. ���� �ݾ���" + balance +"�Դϴ�.");
	}
	
	public void buyMouse() {
		balance = balance - mousePrice;
		System.out.println("���콺�� �����ϼ̽��ϴ�. ���� �ݾ���" + balance +"�Դϴ�.");
	}
	
	public void buyDesktop() {
		balance = balance - desktopPrice;
		System.out.println("����ũž�� �����ϼ̽��ϴ�. ���� �ݾ���" + balance +"�Դϴ�.");
	}
}
