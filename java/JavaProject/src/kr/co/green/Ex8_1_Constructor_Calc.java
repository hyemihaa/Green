package kr.co.green;

public class Ex8_1_Constructor_Calc {
	int num; // �����ڰ� ȣ��Ǹ� ��� ���� �ʱ�ȭ (num = 0)
	int age;
	String name;
	
	public void add() {
//		int localVar;
//		System.out.println(localVar); // �ʱ�ȭ X 
		
		System.out.println(num);  // num = 0
		System.out.println("------------------------------");
	}
	
	
	// �⺻ ������
	public Ex8_1_Constructor_Calc() {
		num = 100;
		System.out.println("�⺻ �����ڰ� ȣ��Ǿ����ϴ�.");
		System.out.println("------------------------------");
	}

	// �Ű� ���� �ִ� ������
	public Ex8_1_Constructor_Calc(int num, int age, String name) {
		this.num = num;
		this.age = age;
		this.name = name;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
