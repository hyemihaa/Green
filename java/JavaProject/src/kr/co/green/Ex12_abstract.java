package kr.co.green;

public class Ex12_abstract {
	// �߻�Ŭ���� : �߻�޼ҵ尡 �� �Ѱ��� ������ ������ �߻�Ŭ����(abstract class)
	//			  -> �������, �����ΰ� �ִ� �޼ҵ� �ٻ�밡��
	//			  -> ��ü ���� �Ұ� -> �ڽ��� ������ �ؾ� ��밡�� 
	//							->  ��(�߻�Ŭ������ ��ӹ��� �ڽ�Ŭ������ ������ ���� �޼ҵ带 ��������� ��� ����)
	// �߻�޼ҵ� : ������{}���� �޼ҵ�

	public static void main(String[] args) {
		// �߻�Ŭ������ ��ü ���� �Ұ� ��
		//Ex12_1_Organism o = Ex12_1_Organism();
		
		Ex12_1_Animal animal = new Ex12_1_Animal();
		animal.eat();
		animal.breathe();
			
//		Ex12_1_Plant plant = new Ex12_1_Plant();  // ������ �ߴ� ������ 
//												  //-> Ex12_1_Plan Ŭ�������� �߻�޼��尡 ��� ����X ->��, �߻�Ŭ������
	                                              
//		plant.eat();
//		plant.breathe();
	
		Ex12_A a = new Ex12_A();  // Ex12_1_Plan Ŭ������ �ٽ� ��� ���� Ex12_AŬ������ ���
		a.eat();
		a.breathe();
		
		
	}

}
