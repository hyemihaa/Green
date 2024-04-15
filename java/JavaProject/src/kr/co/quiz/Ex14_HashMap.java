package kr.co.quiz;

import java.util.HashMap;
import java.util.Scanner;


public class Ex14_HashMap {
	public static void main(String[] args) {
		// ��ȭ��ȣ �߰�, �˻�, ����
		// ��ȭ��ȣ �߰� : �̸�, ��ȭ��ȣ
		// Key(���缷) = Value(01091201466)
		// ��ȭ��ȣ �˻� : �̸��� �˻��ؼ� ���ϴ� ��ȭ��ȣ�� ã�� �� ����

		HashMap<String, String> phoneBook = new HashMap<>();																					
		Scanner sc = new Scanner(System.in);
		boolean isTrue = true;

		while (isTrue) {
			System.out.println("1. ��ȭ��ȣ �߰�");
			System.out.println("2. ��ȭ��ȣ �˻�");
			System.out.println("3. ��ȭ��ȣ ��ü �˻�");
			System.out.println("4. ��ȭ��ȣ ����");
			System.out.println("5. ����");
			System.out.print("�޴��� �������ּ���: ");

			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				// ��ȭ��ȣ �߰�
				// �̸�, ��ȭ��ȣ �Է¹���
				System.out.print("�̸��� �Է��ϼ���: ");
				String name = sc.nextLine();
				
				System.out.print("��ȭ��ȣ�� �Է��ϼ���: ");
				String phone = sc.nextLine();
				
				phoneBook.put(name, phone);
				
				System.out.println(name + "�� ��ȭ��ȣ�� �߰��߽��ϴ�.");                
				System.out.println("----------------------------");
				break;
			case 2:
				// ��ȭ��ȣ �˻�
				// �̸� �Է¹���
				System.out.print("�̸��� �Է��ϼ���: ");
				name = sc.nextLine();
				
				// ��ġ�ϴ� �̸��� ���� �� 
				// Key(name),  Value(phone) ���
				if(phoneBook.containsKey(name)) {
					System.out.println(name + "�� ��ȭ��ȣ: " + phoneBook.get(name));
					System.out.println("-----------------------------------");
				} else {
					// ��ġ�ϴ� �̸��� ���� ��
					System.out.println(name + "�� ��ȭ��ȣ�� ã�� �� �����ϴ�.");
					System.out.println("-----------------------------------");
				}
				
				break;
			case 3: 
				// ��ü�˻�
				// ��� key�� value ���
				for(String key : phoneBook.keySet()) {
					System.out.println("�̸�: " + key + " ��ȭ��ȣ : " + phoneBook.get(key));
				}
			case 4:
				// ��ȭ��ȣ ����
				// �̸� �Է¹���
				System.out.print("�̸��� �Է��ϼ���: ");
				name = sc.nextLine();
				// ��ġ�ϴ� �̸��� ���� ��
				if(phoneBook.containsKey(name)) {
					phoneBook.remove(name);
					System.out.println(name + "�� ��ȭ��ȣ�� �����߽��ϴ�.");
					System.out.println("-----------------------------------");
				} else {
					// ��ġ�ϴ� �̸��� ���� ��
					System.out.println(name + "�� ��ȭ��ȣ�� ã�� �� �����ϴ�.");
					System.out.println("-----------------------------------");
				}
				break;
			case 5:
				// ����
				System.out.println("���α׷��� �����մϴ�.");
				isTrue = false;
				break;
			default:
				// �ùٸ� ��ȣ�� �Է����ּ���.
				System.out.println("�ùٸ� ��ȣ�� �Է����ּ���.");
				System.out.println("-----------------------------------");
			}
		}
	}

}
