package kr.co.quiz;

public class Ex8_Constructor {

	public static void main(String[] args) {
		// 기본생성자 호출 후 name, price, count 출력
		// 매개변수있는 생성자(1) 호출 후 name, price, count 출력
		// 매개변수있는 생성자(2) 호출 후 name, price 출력
		Ex8_1_Product product = new Ex8_1_Product();
//		product.name = "사과";
//		product.price = 5000;
//		product.count = 3;
		System.out.println(product.name + product.price + product.count);
		
		Ex8_1_Product product1 = new Ex8_1_Product("사과", 5000, 3);
		
		
		Ex8_1_Product product2 = new Ex8_1_Product("사과",5000);
		
		
		
		
		// Ex8_2_Buy 객체 생성 = 생성자 호출할 때 200000, 130000, 50000, 150000
		Ex8_2_Buy buy = new Ex8_2_Buy(200000, 130000, 50000, 150000);

		// buyMonitor, buyMouse, buyDesktop 메소드 아무거나 호출해보기
		buy.buyDesktop();
		
		
		
	}

}
