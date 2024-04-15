package kr.co.cafe;

public class OrderDTO {
	//1) OrderDTO 클래스를 생성하고 아래의 변수와 생성자, 메소드를 만드세요.
	//private String customerName (주문자 이름)
	//private int orderNumber (주문 번호)
	//private String orderItem (주문 물품)
	//- 매개변수 있는 생성자 (주문자 이름, 주문 번호, 주문 물품)
	//- 각 변수들에 대한 getter/setter
	

	private String customerName;
	private int orderNumber;
	private String orderItem;
	
	public OrderDTO(String customerName, int orderNumber, String orderItem) {
		this.customerName = customerName;
		this.orderNumber = orderNumber;
		this.orderItem = orderItem;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	
	public void setOrderItem(String orderItem) {
		this.orderItem = orderItem;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public int getOrderNumber() {
		return orderNumber;
	}
	
	public String getOrderItem() {
		return orderItem;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		

}
