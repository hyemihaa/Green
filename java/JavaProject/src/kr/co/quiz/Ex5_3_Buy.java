package kr.co.quiz;

public class Ex5_3_Buy {
    // 2.초기 금액(소지금)을 설정하기 위한 변수 설정  ->Buy클래스의 인스턴스 변수
    // int balance = 100000
	
    // 3. 물건들의 가격 설정
    // 모니터 20000(변수명 monitorPrice)
    // 마우스 18000(변수명 mousePrice)
    // 데스크탑 70000(desktopPrice)
	int balance = 100000;
	
	int monitorPrice = 20000;
	int mousePrice = 18000;
	int desktopPrice = 70000;
	
    // 4. 각각의 물품을 구매하기 위한 메서드 생성
    // -> buyMonitor, buyMouse, buyDesktop
    // -> 해당하는 금액 만큼 소지금에서 제외
    // -> "---을 구입하셨습니다. 남은 금액은 -----원 입니다." 메세지 출력
	
	
	public void buyMonitor() {
		balance -= monitorPrice;
		System.out.println("모니터를 구입하셨습니다. 남은 금액은 " + balance + "원 입니다.");
	}
	
	public void buyMouse() {
		balance -= mousePrice;
		System.out.println("마우스를 구입하셨습니다. 남은 금액은 " + balance + "원 입니다.");
	}
	
	public void buyDesktop() {
		balance -= desktopPrice;
		if(balance < 0)
			System.out.println("소지금이 부족하여 구매하실수 없습니다.");
		else {
		System.out.println("데스크탑을 구입하셨습니다. 남은 금액은 " + balance + "원 입니다.");
		}
	}
	
	
	
	
	
	
	
}
