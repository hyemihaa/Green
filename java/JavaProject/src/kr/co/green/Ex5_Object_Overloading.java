package kr.co.green;

public class Ex5_Object_Overloading {

	public static void main(String[] args) {// �����ε� - ���� �޼ҵ��̸� ��� O 
		                                    // -> �Ű������� ������Ÿ���̳�, ����, ��ġ�� �޶�� ��
		Ex5_Object_Overloading ol = new Ex5_Object_Overloading();
		ol.overloading("ABC");
		ol.overloading(22, "���ڿ�");
		ol.overloading();
	}
	
	
	public void overloading() { //�Ű������� ��� �ȴ�
		System.out.println("0�� �޼ҵ� : �Ű����� ����");
	}
	
	public void overloading(int num) {
		System.out.println("1�� �޼ҵ� : " + num);
	}
	public void overloading(String str) {
		System.out.println("2�� �޼ҵ� : " + str);
	}
	public void overloading(int num,String str) {
		System.out.println("3�� �޼ҵ� : " + num + " " + str);
	}
	public void overloading(String str, int num) {
		System.out.println("4�� �޼ҵ� : " + str + " " + num);
	}
	
	
	
	
	
	
	
	
	
	

}
