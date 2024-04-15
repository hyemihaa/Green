package kr.co.cafe;

import java.util.ArrayList;
import java.util.Scanner;

public class CafeOrder {
	public static void main(String[] args) {
        // ArrayList�� ����ϸ�, OrderDTO Ÿ���� ������ orderList�� ����
        // Scanner ��ü ���� (������ : sc)
		
		Scanner sc = new Scanner(System.in);
		ArrayList<OrderDTO> orderList = new ArrayList<>();
		
		int orderCounter = 1; // �ֹ� ��ȣ�� �ڵ����� ������ų ����
		Boolean isTrue = true;
		
		while (isTrue) {
			System.out.println("1. �ֹ� �Է�");
			System.out.println("2. �ֹ� ��� ���");
			System.out.println("3. ����");
			System.out.print("�޴��� �����ϼ���: ");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
//     			�ֹ��� �̸��� �ֹ� ��ǰ�� �Է� �޽��ϴ�.
				System.out.print("�ֹ��� �̸� : ");
				String name = sc.nextLine();
				System.out.print("�ֹ� ��ǰ : ");
				String item = sc.nextLine();
//     			OrderDTO ��ü�� �����ϸ� �����ڷ� �ֹ��� �̸�, �ֹ� ��ȣ, �ֹ� ��ǰ�� �����Ͽ� �����մϴ�.
//				orderList�� ��ü�� �߰��ϰ�, orderCounter ���� 1�����մϴ�.
				OrderDTO OrderDto = new OrderDTO(name, (orderCounter++), item);
//      		���ֹ��� �����Ǿ����ϴ�.���� ����ϰ� ó�� �Ŵ��� ���ư�����.
				orderList.add(OrderDto);
//				orderCounter++; --> orderCounter ���� 1�����մϴ�
				System.out.println("�ֹ��� �����Ǿ����ϴ�.");
				System.out.println("--------------------------------------------------------------");
				break;
				
			case 2:
//				orderList�� ������� ��� ���ֹ� ����� ��� �ֽ��ϴ�.�� ���
//				������� ���� ��� ��ü �ֹ� ���(orderList)�� ���� �ֹ��� �̸�, �ֹ� ��ȣ, �ֹ� ��ǰ�� ����մϴ�.
				if(!orderList.isEmpty()) {
					for(int i = 0; i < orderList.size(); i++) {
						String name1 = orderList.get(i).getCustomerName();
						int num = orderList.get(i).getOrderNumber();
						String list = orderList.get(i).getOrderItem();
						System.out.println("�ֹ����̸� : " + name1 + " �ֹ���ȣ : " + num + " �ֹ���ǰ : " + list);
					}
//					for(OrderDTO o : orderList) {
//						System.out.println("�ֹ����̸� : " + o.getCustomerName() + " �ֹ���ȣ : " + o.getOrderNumber() + " �ֹ���ǰ : " + o.getOrderItem());
//					}
					
				}
				else {
					System.out.println("�ֹ� ����� ��� �ֽ��ϴ�.");
					
				}
				System.out.println("--------------------------------------------------------------");
				break;
				
			case 3:
//				sc.close();
//				System.exit(0);
				isTrue = false;
				System.out.println("���α׷��� �����մϴ�.");
//				�����α׷��� �����մϴ�.�� ��� �� �����մϴ�.
				System.out.println("--------------------------------------------------------------");
				break;
				
			default:
				System.out.println("1,2,3�� �Է� �����մϴ�.");
				System.out.println("�������� �ʴ� �޴��Դϴ�.");
//				���������� �ʴ� �޴��Դϴ�.�� ��� �� ó�� �޴��� ���ư��ϴ�
			}
		}

	}
}
