package kr.co.green;

// ���� ���赵(Ʋ)
public class Ex5_1_Object_Calc {

	// ���� ����� �����ϴ� �޼���
	public int add(int addNum,int addNum2 ) { //�Ű������� �� 2�� �ޱ�
		System.out.println("���� ��� : " + (addNum + addNum2)); //100 + 50
		return addNum + addNum2;  // ȣ��� ��ġ�� ��ȯ
	}
	
	// ������(��) ����� �����ϴ� �޼���
		public int div(int divNum, int divNum2) {
			System.out.println("������(��) ��� : " + (divNum / divNum2));
			return divNum / divNum2;
		}
		
	// ���� ����� �����ϴ� �޼��� (��ȯ������ Ÿ��)
	public void sub(int subNum, int subNum1) {
		System.out.println("���� ��� : " + (subNum - subNum1));
	}
	
	// ���� ����� �����ϴ� �޼���
	public String mul(int mulNum, int mulNum1) {
		System.out.println("���� ��� : " + (mulNum * mulNum1));
		return "���� ����!";
	}
	
	
	
	
	
	
}
