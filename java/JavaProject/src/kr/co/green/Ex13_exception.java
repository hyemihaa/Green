package kr.co.green;

public class Ex13_exception {

	public static void main(String[] args) {																	
		
		try {
			int[] numArr = new int[5]; // index : 0~4
			System.out.println("예외 발생 전");
			numArr[5] = 10; // index :5 -> 예외발생
			System.out.println("예외 발생 후");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외 발생");
			System.out.println(e);
			
			System.out.println("-----------------------------");
			System.out.println("printStackTrace");
			e.printStackTrace();
			
			System.out.println("-----------------------------");
			
			System.out.println("getStackTrace");
			System.out.println(e.getStackTrace()[0]);
			e.getStackTrace();
			
			System.out.println("-----------------------------");
			System.out.println("toString");
			System.out.println(e.toString());
			e.toString();
			
			System.out.println("-----------------------------");
			System.out.println("getMessage");
			System.out.println(e.getMessage());
			e.getMessage();
			
			System.out.println("-----------------------------");
			
		} finally {
			System.out.println("무조건 실행");
		}
		

	}

}















