package kr.co.green;

public class Ex4_2dArray {

	public static void main(String[] args) {
		//<2차원 배열 선언> 자료형[][] 변수명 = new 자료형[행크기][열크기];
		
		int[][] arr = new int[2][2];
//		int[][] arr2 = {{10, 20},
//	               {100, 200}};  //테이블타입
		
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[1][0] = 100;
		arr[1][1] = 200;
		
		// arr.length => 첫번째 배열의 길이를 가져온다
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		System.out.println("----------------------------------------------------");
		
		
		int[][] arr3 = new int[3][2];
		arr3[0][0] = 10;
	    arr3[0][1] = 20;
	    arr3[1][0] = 100;
	    arr3[1][1] = 200;
	    arr3[2][0] = 1000;
	    arr3[2][1] = 2000;
	    	
//		int[][] arr3 = {arr[0]{10,   20},
//		               arr[1]{100,  200},
//		               arr[2]{1000, 2000}};
//		
//		
		for(int i=0; i<arr3.length; i++) {
			for(int j=0; j<arr3[i].length; j++) {  
				System.out.println(arr3[i][j]);
			}
		}
		System.out.println("----------------------------------------------------");

		//for문으로 바꿔서보기!
		int[][] arr4 = {{10, 20, 30}
		               ,{100,200,300}};  // new int[2][3];
		
		for(int i=0; i<arr4.length; i++) {
			for(int j=0; j<arr4[i].length; j++) {
				System.out.println(arr4[i][j]);
			}
		}
	




//이해가 어려운 부분 (메모리 Stack, Heap 그려가면서 이해하기)

	}

}
