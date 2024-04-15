package kr.co.green;

public class Ex8_2_Constructor_Student {
//	private : ���� Ŭ���������� ���� ����
	private String name;
	private int age;
	private int grade;
	private String studentNumber;
		
//  this. : ���� ��ü�� �����ϱ� ���� �뵵 => �ν��Ͻ� �ڱ� �ڽ��� ����Ŵ
//	this() : �ٸ� �����ڸ� ȣ���ϴ� �뵵 
	
		
	public Ex8_2_Constructor_Student (){
		this("�̸�����", 0, 0, "00000000"); // -> �Ʒ��� Ex8_2_Constructor_Student ������ ȣ��(�Ű����� �����ϰ� ����)
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("�г� : " + grade);
		System.out.println("�й� : " + studentNumber);
		System.out.println("------------------------------");
	}
		
	public Ex8_2_Constructor_Student(String name, int age, int grade, String studentNumber) {
//		���������� �Ű��������� �����ϰ� ���� -> �����Ϸ��� ���� X (���������� �ν��Ͻ� ���� ����)
//		������ ���� ���������տ� this�� �ٿ��ش�.
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.studentNumber = studentNumber;
	}
	
	// �ٸ� Ŭ�������� ����� ���ְ� public���
	// private String name; -> getName : �ʼ�X �Ϲ����� �����
	// getter : ���� ������ �� ����� �޼���
	public String getName() { 
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getGrade() {
		return grade;
	}
	public String getStudentNumber() {
		return studentNumber;
	}
	
	// setter : ���� ���� �� ����� �޼���	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	







}
