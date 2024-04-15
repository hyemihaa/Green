package kr.co.test3;

public class Employee {
    private String name; // 이름
    private String position; // 직급
    private double salary; // 연봉

    // 생성자
    public Employee() {}
    public Employee(String name, String position, double salary) {
    	this.name = name;
    	this.position = position;
    	this.salary = salary;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    public void setPosition(String position) {
    	this.position = position;
    }
    public void setSalary(double salary) {
    	this.salary = salary;
    }
    public String getName() {
    	return name;
    }
    public String getPosition() {
    	return position;
    }
    public double getSalary() {
    	return salary;
    }
    

    // 연봉 인상 메서드
    public void raiseSalary(double percentage) {
    	setSalary(getSalary() + percentage); 
    }

    // 직원 정보 출력 메서드
    public void displayEmployeeInfo() {
    	System.out.println("직원이름 : " + getName() + " 직급 : " + getPosition() + " 연봉 : " + getSalary());
    }

    public static void main(String[] args) {
        // 직원 생성
        Employee employee1 = new Employee("John", "Manager", 50000);
        Employee employee2 = new Employee("Jane", "Developer", 40000);

        // 직원 정보 출력
        System.out.println("직원 1 정보:");
        employee1.displayEmployeeInfo();
        System.out.println();

        System.out.println("직원 2 정보:");
        employee2.displayEmployeeInfo();
        System.out.println();

        // 연봉 인상
        employee1.raiseSalary(30000); // 80000
        System.out.println();

        // 인상된 연봉 출력
        System.out.println("직원 1 정보 (인상 후):");
        employee1.displayEmployeeInfo();
    }
}