package kr.co.quiz;

public class Ex3_for2 {

	public static void main(String[] args) {
		// <��øfor��>
		
		//Q1. ��øfor���� ����Ͽ� ������ ���α׷� �ۼ� (2�� ~9��)
		for(int i=2; i<=9; i++) {
			System.out.println(i + "��");
			for(int j=1; j<=9; j++) {
				System.out.println(i*j);
			}
		}
		System.out.println();
		
		//Q2.�����
        //	*
        //	**
        //	***
        //	****
        //	*****
        
		for(int i=1; i<=5; i++) { // 5�� �ݺ�
			for(int j=1; j<=i; j++) { // ����� ���� i=1 -> j<=1 1�� ���� "*"
				System.out.print("*"); // 		  i=2 -> j<=2 2�� ���� "**"
			}
			System.out.println(); //�� ���� �� �ٹٲ�
		}
		
		
		
		
		
		
		
	}

}
