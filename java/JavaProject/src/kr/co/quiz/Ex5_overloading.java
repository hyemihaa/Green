package kr.co.quiz;

public class Ex5_overloading {

	public static void main(String[] args) {
		Ex5_overloading ol = new Ex5_overloading();
		ol.add(3, 5);
		ol.add(5, 2.2);		
		ol.add(5.5, 5);
		ol.add(2.2, 2, 2.2);
		ol.add(5, 50, 3.3);
		int addNum = ol.add(5, 5, 1.1, 1.2);
		System.out.println(addNum);
	}
	
	// add �޼ҵ� 5�� ����
	// ex) 10 + 10, 10 +5.5, 5.5 + 10, 2.2 + 5 + 3.3
	
	public void add(int num1, int num2) {
		System.out.println("1�� �޼ҵ� : " + (num1 + num2));
	}
	
	public void add(int num1, double num2) {
		System.out.println("2�� �޼ҵ� : " + (num1 + num2));
	}
	
	public void add(double num1, int num2) {
		System.out.println("3�� �޼ҵ� : " + (num1 + num2));
	}
	
	public void add(double num1, int num2, double num3) {
		System.out.println("4�� �޼ҵ� : " + (num1 + num2 + num3));
	}
	
	public void add(int num1, int num2, double num3) {
		System.out.println("5�� �޼ҵ� : " + (num1 + num2 + num3));
	}
	
	public int add(int num1, int num2, double num3, double num4) {
		return num1 + num2 + (int)num3 + (int)num4;
	}
	
	
	

	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
