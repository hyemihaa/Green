package kr.co.green;

public class Ex8_Constructor {

	public static void main(String[] args) {
		// �Ű����� �ִ� ��ü ����
		Ex8_1_Constructor_Calc calc = new Ex8_1_Constructor_Calc(100, 8, "����");
//		calc.num = 100;
//		calc.age = 8;
//		calc.name = "����";
		calc.add();

	
	
		
		
		
		// 	getter / setter
		
		Ex8_2_Constructor_Student s = new Ex8_2_Constructor_Student();
	//	System.out.println(s.name);  ���� - private�̱� ������ -> gettet ����ؾ� ��
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getGrade());
		System.out.println(s.getStudentNumber());
		System.out.println("------------------------------");

		
		s.setName("����");
		System.out.println(s.getName());
		s.setAge(2);
		System.out.println(s.getAge());
		s.setGrade(5);
		System.out.println(s.getGrade());
		s.setStudentNumber("7777");
		System.out.println(s.getStudentNumber());
		
		
		
		
		
		}

	
}
