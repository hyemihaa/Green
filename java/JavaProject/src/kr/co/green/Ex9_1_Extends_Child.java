package kr.co.green;

// ** ��� Ŭ������ �ְ� ������ Object Ŭ����
// ��� ǥ���� : (public) class Ŭ������ extends ��ӹ���Ŭ���� {}

public class Ex9_1_Extends_Child extends Ex9_1_Extends_Parent {
	public String childVar = "�ڽĺ���";

	public void childMethod() {
		System.out.println("�ڽ� Ŭ����");
		String str1 = "a";
		String str2 = "b"; // ��� Ŭ������ �����Ǿ����� -> ��� -> ��� 
		str1.equals(str2); // object -> parent -> child
	}
	
	@Override // �������̵� ������̼� : ���� Ÿ��(�θ� Ÿ��)�� �޼��带 ���������� (�޼��忡���� ���)
	public void parentMethod() {
		System.out.println("�������̵��� �޼���"); //�����ΰ� �ٸ���
	}
	
	

	
}
