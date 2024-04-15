package kr.co.quiz;

public class Ex8_4_Order {
	//  기본생성자 X (자동생성)
	//  주문 번호(orderNumber)    -->  ORD123
	//  주문 금액(orderAmount)    -->  100.5
	//  주문 상태(orderStatus)    -->  처리중
	//  -> 단, 위의 변수들은 모두 private으로 생성
	private String orderNumber;
	private double orderAmount;
	private String orderStatus;
	
	
	//Order 클래스에 모든 변수에 대한 getter, setter 생성
	public String getOrderNumber() {
		return orderNumber;
	}
	public double getOrderAmount() {
		return orderAmount;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	// amountCheck() 메소드 생성
	// 주문 금액이 100 미만이면 "유효하지 않은 금액입니다." 출력
	// 주문 금액이 100 이상이면 주문번호, 주문금액, 주문상태를 출력
						
//	public void amountCheck(double orderAmount) {
//		if(orderAmount < 100) {
//			System.out.println("유효하지 않은 금액입니다.");
//		}
//		else if(orderAmount >= 100) {
//			System.out.println("주문번호 : " + orderNumber + " 주문가격 : " + orderAmount + " 주문상태 : " + orderStatus);
//		}
//		
//	}
	
	public void amountCheck() {
		if(orderAmount < 100) {
			System.out.println("유효하지 않은 금액입니다.");
		}
		else {
			System.out.println("주문번호 : " + orderNumber + " 주문가격 : " + orderAmount + " 주문상태 : " + orderStatus);
		}
		
	}
	
	
	
	
}
