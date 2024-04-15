package kr.co.green;

public class Ex4_araryCopy {

	public static void main(String[] args) {

		// <���� ����(Shallow copy)>
		int[] tempArr = new int[3];
		tempArr[0] = 10;
		tempArr[1] = 20;
		tempArr[2] = 30;

		int[] arr = tempArr; // �迭�� �ּҰ��� ������ ���� (���� �����͸� ����)
								// -> tempArr�� �����Ͱ� ����Ǹ� arr�� �����͵� �Ȱ��� ����
		// tempArr = {10, 20, 30};
		// arr ={10, 20, 30};

		arr[1] = 999;

		// tempArr = {10, 20, 30}; tempArr[1] = 999 �� ����� (arr�� tempArr�� ���� �ּҰ�(����������)�� �����־)
		// arr ={10, 999, 30};

		tempArr[0] = 777;

		// tempArr = {777, 20, 30};
		// arr ={10, 999, 30}; arr[0] = 777 �� ����� (arr�� tempArr�� ���� �ּҰ�(����������)�� �����־)

		for (int i = 0; i < tempArr.length; i++) {
			System.out.println("���� �迭 : " + tempArr[i]);
			System.out.println("�迭 : " + arr[i]);
			System.out.println();
		}

		// <���� ����(Deep Copy)>
		// ���ο� �迭�� �����ϰ� ������ �迭�� �����͸� �����ͼ� �ִ� ���
		int[] tempArr2 = { 10, 20, 30 }; // �迭 ���� �� �Ҵ�, �ʱ�ȭ (tempArr2)

		int[] arr2 = new int[tempArr2.length]; // �迭 ���� �� �Ҵ�, ���ο� �迭 ���� (arr2)
//				arr2[0] = tempArr2[0];
//				arr2[1] = tempArr2[1];
//				arr2[2] = tempArr2[2];

		for (int i = 0; i < tempArr2.length; i++) {
			arr2[i] = tempArr2[i];
			System.out.println(arr2[i]);
		}
		arr2[2] = 2; // tempArr2[2] = 30 �� ������ ���� -> arr2[2]�� ���� ����ȴ�

		// arraycopy()�� Ȱ���� ���
		// System.arraycopy(�����迭, ���縦 ������ ��ġ, ������ �迭, ������ ������ ��ġ, ������ ����� ����);
		System.arraycopy(tempArr2, 0, arr2, 0, tempArr2.length);

	}

}
