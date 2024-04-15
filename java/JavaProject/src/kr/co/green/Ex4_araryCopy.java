package kr.co.green;

public class Ex4_araryCopy {

	public static void main(String[] args) {

		// <얕은 복사(Shallow copy)>
		int[] tempArr = new int[3];
		tempArr[0] = 10;
		tempArr[1] = 20;
		tempArr[2] = 30;

		int[] arr = tempArr; // 배열의 주소값만 가져와 참조 (같은 데이터를 본다)
								// -> tempArr의 데이터가 변경되면 arr의 데이터도 똑같이 변경
		// tempArr = {10, 20, 30};
		// arr ={10, 20, 30};

		arr[1] = 999;

		// tempArr = {10, 20, 30}; tempArr[1] = 999 로 변경됨 (arr과 tempArr이 같은 주소값(같은데이터)을 보고있어서)
		// arr ={10, 999, 30};

		tempArr[0] = 777;

		// tempArr = {777, 20, 30};
		// arr ={10, 999, 30}; arr[0] = 777 로 변경됨 (arr과 tempArr이 같은 주소값(같은데이터)을 보고있어서)

		for (int i = 0; i < tempArr.length; i++) {
			System.out.println("원본 배열 : " + tempArr[i]);
			System.out.println("배열 : " + arr[i]);
			System.out.println();
		}

		// <깊은 복사(Deep Copy)>
		// 새로운 배열을 생성하고 기존의 배열의 데이터만 가져와서 넣는 방식
		int[] tempArr2 = { 10, 20, 30 }; // 배열 선언 및 할당, 초기화 (tempArr2)

		int[] arr2 = new int[tempArr2.length]; // 배열 선언 및 할당, 새로운 배열 생성 (arr2)
//				arr2[0] = tempArr2[0];
//				arr2[1] = tempArr2[1];
//				arr2[2] = tempArr2[2];

		for (int i = 0; i < tempArr2.length; i++) {
			arr2[i] = tempArr2[i];
			System.out.println(arr2[i]);
		}
		arr2[2] = 2; // tempArr2[2] = 30 은 변하지 않음 -> arr2[2]의 값만 변경된다

		// arraycopy()를 활용한 방식
		// System.arraycopy(원본배열, 복사를 시작할 위치, 저장할 배열, 저장을 시작할 위치, 복사할 요소의 개수);
		System.arraycopy(tempArr2, 0, arr2, 0, tempArr2.length);

	}

}
