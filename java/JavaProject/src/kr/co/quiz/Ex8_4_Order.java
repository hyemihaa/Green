package kr.co.quiz;

public class Ex8_4_Order {
	//  �⺻������ X (�ڵ�����)
	//  �ֹ� ��ȣ(orderNumber)    -->  ORD123
	//  �ֹ� �ݾ�(orderAmount)    -->  100.5
	//  �ֹ� ����(orderStatus)    -->  ó����
	//  -> ��, ���� �������� ��� private���� ����
	private String orderNumber;
	private double orderAmount;
	private String orderStatus;
	
	
	//Order Ŭ������ ��� ������ ���� getter, setter ����
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
	
	// amountCheck() �޼ҵ� ����
	// �ֹ� �ݾ��� 100 �̸��̸� "��ȿ���� ���� �ݾ��Դϴ�." ���
	// �ֹ� �ݾ��� 100 �̻��̸� �ֹ���ȣ, �ֹ��ݾ�, �ֹ����¸� ���
						
//	public void amountCheck(double orderAmount) {
//		if(orderAmount < 100) {
//			System.out.println("��ȿ���� ���� �ݾ��Դϴ�.");
//		}
//		else if(orderAmount >= 100) {
//			System.out.println("�ֹ���ȣ : " + orderNumber + " �ֹ����� : " + orderAmount + " �ֹ����� : " + orderStatus);
//		}
//		
//	}
	
	public void amountCheck() {
		if(orderAmount < 100) {
			System.out.println("��ȿ���� ���� �ݾ��Դϴ�.");
		}
		else {
			System.out.println("�ֹ���ȣ : " + orderNumber + " �ֹ����� : " + orderAmount + " �ֹ����� : " + orderStatus);
		}
		
	}
	
	
	
	
}
