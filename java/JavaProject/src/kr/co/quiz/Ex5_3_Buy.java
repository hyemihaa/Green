package kr.co.quiz;

public class Ex5_3_Buy {
    // 2.�ʱ� �ݾ�(������)�� �����ϱ� ���� ���� ����  ->BuyŬ������ �ν��Ͻ� ����
    // int balance = 100000
	
    // 3. ���ǵ��� ���� ����
    // ����� 20000(������ monitorPrice)
    // ���콺 18000(������ mousePrice)
    // ����ũž 70000(desktopPrice)
	int balance = 100000;
	
	int monitorPrice = 20000;
	int mousePrice = 18000;
	int desktopPrice = 70000;
	
    // 4. ������ ��ǰ�� �����ϱ� ���� �޼��� ����
    // -> buyMonitor, buyMouse, buyDesktop
    // -> �ش��ϴ� �ݾ� ��ŭ �����ݿ��� ����
    // -> "---�� �����ϼ̽��ϴ�. ���� �ݾ��� -----�� �Դϴ�." �޼��� ���
	
	
	public void buyMonitor() {
		balance -= monitorPrice;
		System.out.println("����͸� �����ϼ̽��ϴ�. ���� �ݾ��� " + balance + "�� �Դϴ�.");
	}
	
	public void buyMouse() {
		balance -= mousePrice;
		System.out.println("���콺�� �����ϼ̽��ϴ�. ���� �ݾ��� " + balance + "�� �Դϴ�.");
	}
	
	public void buyDesktop() {
		balance -= desktopPrice;
		if(balance < 0)
			System.out.println("�������� �����Ͽ� �����ϽǼ� �����ϴ�.");
		else {
		System.out.println("����ũž�� �����ϼ̽��ϴ�. ���� �ݾ��� " + balance + "�� �Դϴ�.");
		}
	}
	
	
	
	
	
	
	
}
