package kr.co.green;

public class Ex5_Object_Overloading {

	public static void main(String[] args) {// 오버로딩 - 같은 메소드이름 사용 O 
		                                    // -> 매개변수의 데이터타입이나, 개수, 위치가 달라야 함
		Ex5_Object_Overloading ol = new Ex5_Object_Overloading();
		ol.overloading("ABC");
		ol.overloading(22, "문자열");
		ol.overloading();
	}
	
	
	public void overloading() { //매개변수가 없어도 된다
		System.out.println("0번 메소드 : 매개변수 없음");
	}
	
	public void overloading(int num) {
		System.out.println("1번 메소드 : " + num);
	}
	public void overloading(String str) {
		System.out.println("2번 메소드 : " + str);
	}
	public void overloading(int num,String str) {
		System.out.println("3번 메소드 : " + num + " " + str);
	}
	public void overloading(String str, int num) {
		System.out.println("4번 메소드 : " + str + " " + num);
	}
	
	
	
	
	
	
	
	
	
	

}
