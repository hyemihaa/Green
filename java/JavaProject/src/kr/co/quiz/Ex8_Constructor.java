package kr.co.quiz;

public class Ex8_Constructor {

	public static void main(String[] args) {
		// �⺻������ ȣ�� �� name, price, count ���
		// �Ű������ִ� ������(1) ȣ�� �� name, price, count ���
		// �Ű������ִ� ������(2) ȣ�� �� name, price ���
		Ex8_1_Product product = new Ex8_1_Product();
//		product.name = "���";
//		product.price = 5000;
//		product.count = 3;
		System.out.println(product.name + product.price + product.count);
		
		Ex8_1_Product product1 = new Ex8_1_Product("���", 5000, 3);
		
		
		Ex8_1_Product product2 = new Ex8_1_Product("���",5000);
		
		
		
		
		// Ex8_2_Buy ��ü ���� = ������ ȣ���� �� 200000, 130000, 50000, 150000
		Ex8_2_Buy buy = new Ex8_2_Buy(200000, 130000, 50000, 150000);

		// buyMonitor, buyMouse, buyDesktop �޼ҵ� �ƹ��ų� ȣ���غ���
		buy.buyDesktop();
		
		
		
	}

}
