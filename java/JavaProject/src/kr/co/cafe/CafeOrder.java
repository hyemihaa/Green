package kr.co.cafe;

import java.util.ArrayList;
import java.util.Scanner;

public class CafeOrder {
	public static void main(String[] args) {
        // ArrayList를 사용하며, OrderDTO 타입의 변수명 orderList를 생성
        // Scanner 객체 생성 (변수명 : sc)
		
		Scanner sc = new Scanner(System.in);
		ArrayList<OrderDTO> orderList = new ArrayList<>();
		
		int orderCounter = 1; // 주문 번호를 자동으로 증가시킬 변수
		Boolean isTrue = true;
		
		while (isTrue) {
			System.out.println("1. 주문 입력");
			System.out.println("2. 주문 목록 출력");
			System.out.println("3. 종료");
			System.out.print("메뉴를 선택하세요: ");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
//     			주문자 이름과 주문 물품을 입력 받습니다.
				System.out.print("주문자 이름 : ");
				String name = sc.nextLine();
				System.out.print("주문 물품 : ");
				String item = sc.nextLine();
//     			OrderDTO 객체를 생성하며 생성자로 주문자 이름, 주문 번호, 주문 물품을 전달하여 저장합니다.
//				orderList에 객체를 추가하고, orderCounter 값을 1증가합니다.
				OrderDTO OrderDto = new OrderDTO(name, (orderCounter++), item);
//      		“주문이 접수되었습니다.”를 출력하고 처음 매뉴로 돌아가세요.
				orderList.add(OrderDto);
//				orderCounter++; --> orderCounter 값을 1증가합니다
				System.out.println("주문이 접수되었습니다.");
				System.out.println("--------------------------------------------------------------");
				break;
				
			case 2:
//				orderList가 비어있을 경우 “주문 목록이 비어 있습니다.” 출력
//				비어있지 않을 경우 전체 주문 목록(orderList)에 대해 주문자 이름, 주문 번호, 주문 물품을 출력합니다.
				if(!orderList.isEmpty()) {
					for(int i = 0; i < orderList.size(); i++) {
						String name1 = orderList.get(i).getCustomerName();
						int num = orderList.get(i).getOrderNumber();
						String list = orderList.get(i).getOrderItem();
						System.out.println("주문자이름 : " + name1 + " 주문번호 : " + num + " 주문물품 : " + list);
					}
//					for(OrderDTO o : orderList) {
//						System.out.println("주문자이름 : " + o.getCustomerName() + " 주문번호 : " + o.getOrderNumber() + " 주문물품 : " + o.getOrderItem());
//					}
					
				}
				else {
					System.out.println("주문 목록이 비어 있습니다.");
					
				}
				System.out.println("--------------------------------------------------------------");
				break;
				
			case 3:
//				sc.close();
//				System.exit(0);
				isTrue = false;
				System.out.println("프로그램을 종료합니다.");
//				“프로그램을 종료합니다.“ 출력 후 종료합니다.
				System.out.println("--------------------------------------------------------------");
				break;
				
			default:
				System.out.println("1,2,3만 입력 가능합니다.");
				System.out.println("존재하지 않는 메뉴입니다.");
//				“존재하지 않는 메뉴입니다.” 출력 후 처음 메뉴로 돌아갑니다
			}
		}

	}
}
