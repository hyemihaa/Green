package kr.co.quiz;

public class Quiz_3_26 {

	public static void main(String[] args) {
		
		

//		주어진 배열을 생성하고 아래의 조건에 만족하는 값을 출력하는 프로그램을 작성하세요.
		int[] arr = {10, 34, 59, 20, 22, 66, 88, 65, 1, 99};
		
//		1-1) 배열 요소의 합계를 출력하세요.
		int sum = (arr[0] + arr[1] + arr[2] + arr[3] + arr[4] + arr[5] + arr[6] + arr[7] + arr[8] + arr[9]);
		System.out.println("배열의 합계 : " + sum);
		
//		1-2) 배열의 요소 중 짝수가 몇 개인지 출력하세요.
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
					count++;
			}
		}
		System.out.println("짝수의 개수 : " + count);
	
//		1-3) 배열의 요소 중 3의 배수를 모두 출력하세요.
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 3 == 0) {
				System.out.println("3의 배수는 : " + arr[i]);
			}
		}
		
//		1-4) 배열의 요소 중 가장 작은 값을 출력하세요.
		int min = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("최소값은 : " + min);
		
//		1-5) 1-4에서 확인한 가장 작은 값이 몇 번 인덱스에 있는지 출력하세요.
		for(int i = 0; i < arr.length; i++)	
			if(min == arr[i]) {
				System.out.println(min + "의 인덱스 위치 : " + i);
			}
	

	}

}
