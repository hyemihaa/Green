package kr.co.green;

public class Ex4_2dArray {

	public static void main(String[] args) {
		//<2���� �迭 ����> �ڷ���[][] ������ = new �ڷ���[��ũ��][��ũ��];
		
		int[][] arr = new int[2][2];
//		int[][] arr2 = {{10, 20},
//	               {100, 200}};  //���̺�Ÿ��
		
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[1][0] = 100;
		arr[1][1] = 200;
		
		// arr.length => ù��° �迭�� ���̸� �����´�
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

		//for������ �ٲ㼭����!
		int[][] arr4 = {{10, 20, 30}
		               ,{100,200,300}};  // new int[2][3];
		
		for(int i=0; i<arr4.length; i++) {
			for(int j=0; j<arr4[i].length; j++) {
				System.out.println(arr4[i][j]);
			}
		}
	




//���ذ� ����� �κ� (�޸� Stack, Heap �׷����鼭 �����ϱ�)

	}

}
