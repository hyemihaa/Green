package kr.co.quiz;

public class Ex5_2_minMax {
	//�ּҰ��� ���ϴ� �޼ҵ�
	//�Ű����� : �迭(int[] ������)
	
	//�ּҰ��� ���ϰ�
	
	//���� ���� return
	
//	public ��ȯŸ�� �޼ҵ��(int[] ������) {
//		//�ּҰ��� ���ϴ� �ڵ� �ۼ�
//		return �ּҰ�;
//	}

	//	�ּҰ� ���ϱ�
	
//	public void num(int[] minNum) {
//		int min = minNum[0];
//		for(int i = 1; i<minNum.length; i++) {
//			if(min > minNum[i]) {
//				min = minNum[i];
//			}
//		}
//	}
	

	//�ּҰ� ���ϱ� return
	public int minResult(int[] minNum) {
		int min = minNum[0];
		for(int i = 1; i<minNum.length; i++) {
			if(min > minNum[i]) { //min ���� numbers�� ���� �� 
				min = minNum[i]; // true�϶� min�� ����
			}
		}
		return min;
		
	}
	
	
	//�ִ밪 ���ϱ� return
	public int maxResult(int[] maxNum) {
		int max = maxNum[0];
		for(int i = 1; i < maxNum.length; i++) {
			if(max < maxNum[i]) {
				max = maxNum[i];
			}
		}
		return max;
	}
		
//	public void accelerate() {
//		System.out.println("�ڵ����� �����մϴ�.");
//	}

	
	
	// �޴� �������� ���ڰ� �������� �ʾ��� ��� (�������ڴ� �迭�� ���) -> �Ű������� �Ѱ��� �Է��ص� ����X
	//						�Ű������� ���� �������� ����
	public int getMin(int num1, int... num2) {
		System.out.println(num1 + " " + num2);
		
		for(int num : num2) {
			System.out.println(num);
		}
		
		return 0;
	}
	
	
	

	

	    
	
	

	
	
	
}

