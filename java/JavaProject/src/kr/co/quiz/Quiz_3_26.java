package kr.co.quiz;

public class Quiz_3_26 {

	public static void main(String[] args) {
		
		

//		�־��� �迭�� �����ϰ� �Ʒ��� ���ǿ� �����ϴ� ���� ����ϴ� ���α׷��� �ۼ��ϼ���.
		int[] arr = {10, 34, 59, 20, 22, 66, 88, 65, 1, 99};
		
//		1-1) �迭 ����� �հ踦 ����ϼ���.
		int sum = (arr[0] + arr[1] + arr[2] + arr[3] + arr[4] + arr[5] + arr[6] + arr[7] + arr[8] + arr[9]);
		System.out.println("�迭�� �հ� : " + sum);
		
//		1-2) �迭�� ��� �� ¦���� �� ������ ����ϼ���.
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
					count++;
			}
		}
		System.out.println("¦���� ���� : " + count);
	
//		1-3) �迭�� ��� �� 3�� ����� ��� ����ϼ���.
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 3 == 0) {
				System.out.println("3�� ����� : " + arr[i]);
			}
		}
		
//		1-4) �迭�� ��� �� ���� ���� ���� ����ϼ���.
		int min = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("�ּҰ��� : " + min);
		
//		1-5) 1-4���� Ȯ���� ���� ���� ���� �� �� �ε����� �ִ��� ����ϼ���.
		for(int i = 0; i < arr.length; i++)	
			if(min == arr[i]) {
				System.out.println(min + "�� �ε��� ��ġ : " + i);
			}
	

	}

}
