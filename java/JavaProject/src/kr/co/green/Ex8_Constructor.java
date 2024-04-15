package kr.co.green;

public class Ex8_Constructor {

	public static void main(String[] args) {
		// 매개변수 있는 객체 생성
		Ex8_1_Constructor_Calc calc = new Ex8_1_Constructor_Calc(100, 8, "뭉구");
//		calc.num = 100;
//		calc.age = 8;
//		calc.name = "뭉구";
		calc.add();

	
	
		
		
		
		// 	getter / setter
		
		Ex8_2_Constructor_Student s = new Ex8_2_Constructor_Student();
	//	System.out.println(s.name);  에러 - private이기 때문에 -> gettet 사용해야 함
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getGrade());
		System.out.println(s.getStudentNumber());
		System.out.println("------------------------------");

		
		s.setName("뭉구");
		System.out.println(s.getName());
		s.setAge(2);
		System.out.println(s.getAge());
		s.setGrade(5);
		System.out.println(s.getGrade());
		s.setStudentNumber("7777");
		System.out.println(s.getStudentNumber());
		
		
		
		
		
		}

	
}
