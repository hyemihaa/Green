package kr.co.quiz;

public class Ex5_4_rating {
	// Q3. ���� �ν��Ͻ� ���� ���� (rating)
	
	double rating;
	
	// ����� ���� ������� ���� ���� ����
	public final double USER_A_RATING = 3; 
	public final double USER_B_RATING = 2; 
	public final double USER_C_RATING = 2.5; 
	public final double USER_D_RATING = 4; 
	public final double USER_E_RATING = 5; 
	
	// getAvaRating() �޼��� �����ϴµ�
	// ����ڰ� �Է��� �� 1���� ���� ����(�Ű�����)
	
	public double getAvgRating(double num) {
		rating =((USER_A_RATING + USER_B_RATING + USER_C_RATING + USER_D_RATING + USER_E_RATING) + num)/6;
		
		return rating;
	}
	
	
	
	// A~E������ ���� ������ ���޹��� ������ �հ踦 ���� �� ��������� ����
	//			--> ������� ���Ѱ� rating�� ����
	// ������� ��ȯ
	
	
	
	
	
	
	
	
	
	
}


