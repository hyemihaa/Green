package kr.co.green;

public class Ex5_Object_Filed { //class ����
	// ��� ���� (�ν��Ͻ� ���� + Ŭ��������)
	int num = 10; // �ν��Ͻ� ����
	static int classNum = 100; // Ŭ���� ���� --> Ŭ���� ������ static�� ����� ����)
	
	public static void main(String[] args) {
	
		Ex5_Object_Filed f = new Ex5_Object_Filed();
		System.out.println("�ν��Ͻ� ���� : " + f.num);
		
		f.num = 200; //����
		
		System.out.println("�ν��Ͻ� ���� : " + f.num);
		System.out.println(Ex5_Object_Filed.classNum); //Ŭ������.Ŭ����������;
		
		// ��� Ŭ������ ���� ��ü ����(�ν��Ͻ�ȭ) -> �����Ͱ� �޸𸮿� �ö󰡴� ���� �ν��Ͻ���� �θ�
		Ex5_3_Object_Person p = new Ex5_3_Object_Person(); 
		
		// Ŭ���� ���� ���
		System.out.println(Ex5_3_Object_Person.phone);
		
		System.out.println("�̸� : " + p.name);
		System.out.println("���� : " + p.age);
		p.walk(); // �޼ҵ� ȣ��
		p.run();
		
		Calc calc = new Calc(); //��ü ����
		calc.instanceNumFirst = 10;
		calc.instanceNumSecond = 20;
		System.out.println(calc.instanceNumFirst + calc.instanceNumSecond);
		
		Calc.classNumThird = 30;   //�ν��Ͻ� ����   +    Ŭ������.����
		System.out.println(calc.instanceNumFirst + Calc.classNumThird);
		                                            // Ŭ���������� ��ü���� ���� ��� �����ϴ�.
		calc.add();
		
	}
	
	public void add() { // �������� --> �޼ҵ�{}�ȿ��� ����� ����
		int localNum = 100; 
	}

} // class ����


class Calc{ //Ŭ���� ����
	
	public int instanceNumFirst; // �ν��Ͻ� ����
	public int instanceNumSecond; // �ν��Ͻ� ����
	public static int classNumThird; // Ŭ���� ����
	
	public void add() {
		instanceNumFirst = 10;
		instanceNumSecond = 20;
		System.out.println(instanceNumFirst + instanceNumSecond);
	}
	
	
}





















