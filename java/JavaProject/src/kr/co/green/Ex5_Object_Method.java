package kr.co.green;

public class Ex5_Object_Method {

	public static void main(String[] args) {
		
		// class -> Ʋ
		// �޼ҵ� -> ����� ����
		// ��ü ����
		// �޼ҵ� ȣ��
		// ���� �޼ҵ忡�� �Ѱ��� �� ����
		// �޼ҵ� - ���������� ī��ǥ��� (ù�ڴ� �ҹ���) 
		
		// ��ü ���� (= �ν��Ͻ�ȭ)
		// Ex5_Object_Method Ŭ������ �޸𸮿� �ø��� ����
		
		// �޼ҵ带 ���� Ŭ������ ������ ��ü�� ������ �� 
		// Ŭ������ ������ = new Ŭ������();
		Ex5_Object_Method m = new Ex5_Object_Method(); 
		
		// ������.�޼ҵ��();
		String printStr = "Hello, Method!";
		m.print(printStr);
	//	int addNum = 1+2
	//  int resultAdd = m.add(addNum);  	
		int resultAdd = m.add(1,2);   
		System.out.println("add : " + resultAdd);
		m.sub(20, 10);
	 // m.sub(20, "AB");
		
		
		// ���� Ŭ����(Ex5_1_calc)�� ��ü ����
		Ex5_1_Object_Calc calc = new Ex5_1_Object_Calc();
		
		//calc.add(100,50); // 100 + 50 �޼ҵ����� �� ����
		int resultAdd2 = calc.add(100,50);
		//calc.div(777,5); // 777 / 5  �޼ҵ����� �� ����
		int resultDiv = calc.div(777,5);
		
		calc.sub(200,150); // 200 - 150  �޼ҵ����� �� ����
		
		//calc.mul(1000,23); // 1000 * 23  �޼ҵ����� �� ����
		String resultMul = calc.mul(1000, 23);
		
		
		
		// ���� Ŭ���� ��ü ����
		Ex5_2__Object_Animal animal = new Ex5_2__Object_Animal();
		
		//eat�޼ҵ�� 1�� ��ȯ
		
		String eat ="�Դ���";
		
		int resultEat = 1; //"�Դ���"�̶�� ���ڿ� ���� �� ���
		// ��ȯ ���� �� ���
		System.out.println(resultEat);
		
		// sleep�޼ҵ�� 2�� ��ȯ
		//animal.sleep();  // "������ �Ҹ��� ���ϴ�"�̶�� ���ڿ� ������ ���
		int resultSleep = 2;
		String sleep ="������ �Ҹ��� ���ϴ�";
		// ��ȯ ���� �� ���
		System.out.println(resultSleep);
		
		// makeSound�޼ҵ�� 3�� ��ȯ
		animal.makeSound();  // "�ڴ���"�̶�� ���ڿ� ���� �� ���
		// ��ȯ ���� �� ���
		
	}
	
	
	//�޼��� ����
	

	
	// ������ �����ϴ� �޼ҵ� ����    --> void : ��ȯ �� ����(return �ۼ� X)
	//  public void add(int addNum) {
	//  System.out.println(addNum);
	//	}

	// ������ �����ϴ� �޼ҵ� ���� --> ��ȯ - return �ʼ� (ex) int, boolean, string, int[], ...)
	// ��ȯ�ϴ� ���� ������ Ÿ���� ��ġ ���Ѿ� �Ѵ�.
	public int add(int num1, int num2) { 
		return num1 + num2 ;  // return ��ȯ��;   -->�޼ҵ� ���� �� ��� ��� ���� ȣ���� ������ �ǵ�����(��ȯ��Ŵ)
	}
	
	
	// ������ִ� �޼ҵ�       �Ű�����  
	public void print(String printStr) {
		System.out.println(printStr);
	}
	
	// ������ �����ϴ� �޼ҵ�
			//  sub(int num1, String str)
	public void sub(int num1, int num2) {
		System.out.println(num1);
		
		System.out.println(num2);
	
		System.out.println("���� ��� : " + (num1-num2));
	}
	
	
	
	
	
	
	
}
