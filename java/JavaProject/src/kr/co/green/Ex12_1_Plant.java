package kr.co.green;

public abstract class Ex12_1_Plant extends Ex12_1_Organism{  // -> �߻�޼��� ��� �������� �ʾƼ� �߻�Ŭ�����̴�. 
	@Override
	public void eat(){
		System.out.println("�Ĺ��� ���ռ��� �մϴ�.");
	}
//	public abstract void breathe();
//	@Override
//	public void breathe() {
//		System.out.println("�Ĺ��� ��ȯ����� ���� ���� ���ϴ�.");
//	}
	
}

class Ex12_A extends Ex12_1_Plant{        // �� Ŭ����(Ex12_1_Plant)���� breathe�޼ҵ�(�������̵�) ���X 
	@Override                             // -> �ٸ� Ŭ����(Ex12_A)�� ����� breathe�޼ҵ�(�������̵�)�ؾ� �Ѵ�.
	public void breathe() {		          // -> ��, �������� �߻� �޼ҵ��� �Ϻθ� ������ ��� 
		System.out.println("AŬ����");      // -> �߻�Ŭ������ ����� ����Ѵ�. �ƴϸ� ��ӵ� Ŭ������ �Ϻ� �߻�Ŭ������ ���� �ؾ���
	}
}	
	
	



