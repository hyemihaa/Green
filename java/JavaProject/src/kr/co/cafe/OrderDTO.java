package kr.co.cafe;

public class OrderDTO {
	//1) OrderDTO Ŭ������ �����ϰ� �Ʒ��� ������ ������, �޼ҵ带 ���弼��.
	//private String customerName (�ֹ��� �̸�)
	//private int orderNumber (�ֹ� ��ȣ)
	//private String orderItem (�ֹ� ��ǰ)
	//- �Ű����� �ִ� ������ (�ֹ��� �̸�, �ֹ� ��ȣ, �ֹ� ��ǰ)
	//- �� �����鿡 ���� getter/setter
	

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
