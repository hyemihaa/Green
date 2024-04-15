package kr.co.quiz;

public class Ex9_2_Animal {
	public String name;
	public int age;
	
	
	public Ex9_2_Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void makeSound() {
		System.out.println("동물들이 소리를 냅니다.");
	}
	
	public void eat() {
		System.out.println("강아지가 먹는 중입니다." + age + "살 " + "이름: " + name);
	}
	public void sleep() {
		System.out.println("고양이가 잠을 자고 있습니다." + age + name);
	}
	
}
