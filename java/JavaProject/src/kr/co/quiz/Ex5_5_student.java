package kr.co.quiz;

public class Ex5_5_student {

	// �̸�, ����, ����, ����, ���� ������ �ν��Ͻ� ������ ����(��������)
	// ������ : name, kor, eng, mat, sci
	public String name;
	public double kor;
	public double eng;
	public double mat;
	public double sci;
	
	
	public final double STUDENT_A_AVG = 93.5;
	public final double STUDENT_B_AVG = 56.0;
	public final double STUDENT_C_AVG = 68.5;
	public final double STUDENT_D_AVG = 80.5;
	public final double STUDENT_E_AVG = 73.5;
	
	
	// ������ �հ踦 ���ϴ� getSum �޼��� ����
	public void getSum() {
		double sum = kor + eng + mat + sci;
		System.out.println(name + "���� �հ������� " + sum + "�� �Դϴ�.");
	}
	// �հ踦 ���� �� "---���� �հ� ������ --�� �Դϴ�." ���
	
	// ������ ����� ���ϴ� gerAvg �޼��� ����
	public double getAvg() {
		double avg = (kor + eng + mat + sci)/4.0;
		System.out.println(name + "���� ��������� " + avg + "�� �Դϴ�.");
		return avg;
	}
	
	// ��ո� ���� �� "---���� ��� ������ --�� �Դϴ�." ���
	
//------------------------------------- ���� �Ϸ��� 
	// �ڽ��� ��� ������ ������� Ȯ���� �� �ִ� getRank �޼��� ����
	// �ڽ��� ��� ������ �Ű������� ����
	// ��Ʈ : STUDENT_A_AVG ~ E -> �迭
	// �迭�� ���� ��ŭ �ݺ�, ����
	// ���� : ���� ���޹��� ������� < �迭�� ���
	//      count �� ����
	
	public void getRank(double avg) {
		int count = 1;
		double avgScore[] = {STUDENT_A_AVG, STUDENT_B_AVG, STUDENT_C_AVG, STUDENT_D_AVG, STUDENT_E_AVG}; 
		for(int i = 0; i<avgScore.length; i++) {
			if(avg < avgScore[i]) {
				count++;
			}
		}
		System.out.println("��� : " + count);
		
	}


	
}
