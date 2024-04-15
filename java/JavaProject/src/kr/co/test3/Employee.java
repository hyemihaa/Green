package kr.co.test3;

public class Employee {
    private String name; // �̸�
    private String position; // ����
    private double salary; // ����

    // ������
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
    

    // ���� �λ� �޼���
    public void raiseSalary(double percentage) {
    	setSalary(getSalary() + percentage); 
    }

    // ���� ���� ��� �޼���
    public void displayEmployeeInfo() {
    	System.out.println("�����̸� : " + getName() + " ���� : " + getPosition() + " ���� : " + getSalary());
    }

    public static void main(String[] args) {
        // ���� ����
        Employee employee1 = new Employee("John", "Manager", 50000);
        Employee employee2 = new Employee("Jane", "Developer", 40000);

        // ���� ���� ���
        System.out.println("���� 1 ����:");
        employee1.displayEmployeeInfo();
        System.out.println();

        System.out.println("���� 2 ����:");
        employee2.displayEmployeeInfo();
        System.out.println();

        // ���� �λ�
        employee1.raiseSalary(30000); // 80000
        System.out.println();

        // �λ�� ���� ���
        System.out.println("���� 1 ���� (�λ� ��):");
        employee1.displayEmployeeInfo();
    }
}