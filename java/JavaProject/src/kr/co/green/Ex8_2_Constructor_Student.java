package kr.co.green;

public class Ex8_2_Constructor_Student {
//	private : 같은 클래스에서만 접근 가능
	private String name;
	private int age;
	private int grade;
	private String studentNumber;
		
//  this. : 현재 객체를 참조하기 위한 용도 => 인스턴스 자기 자신을 가리킴
//	this() : 다른 생성자를 호출하는 용도 
	
		
	public Ex8_2_Constructor_Student (){
		this("이름없음", 0, 0, "00000000"); // -> 아래의 Ex8_2_Constructor_Student 생성자 호출(매개변수 동일하게 설정)
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("학년 : " + grade);
		System.out.println("학번 : " + studentNumber);
		System.out.println("------------------------------");
	}
		
	public Ex8_2_Constructor_Student(String name, int age, int grade, String studentNumber) {
//		멤버변수명과 매개변수명을 동일하게 설정 -> 컴파일러가 구분 X (지역변수와 인스턴스 변수 구별)
//		구분을 위해 멤버변수명앞에 this를 붙여준다.
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.studentNumber = studentNumber;
	}
	
	// 다른 클래스에서 사용할 수있게 public사용
	// private String name; -> getName : 필수X 암묵적인 약속임
	// getter : 값을 가져올 때 사용할 메서드
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
	
	// setter : 값을 넣을 때 사용할 메서드	
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
