package kr.co.green;

import java.util.ArrayList;

public class Ex11_Polymorphism {
				
	public static void main(String[] args) {
		
//		�ڽ�Ŭ���� ������ = new �θ�Ŭ����(); --> �Ұ����ϴ�
		
		//�θ�Ŭ���� 			�ڽ�Ŭ����		
		Ex11_1_Animal a = new Ex11_1_Dog(); // ��, ������ Ÿ���� �θ�Ŭ������ �ϰڴ�!	
		a.makeSound();                      	
		a.eat();
		a.sleep();
//		a.bark();  ���� �θ� Ŭ������ ������ �ִ� �ʵ带 Ȱ���� �� ������, ����(Dog) ���� �޼ҵ�� ����� �� ����
//				 			 (--> �θ�� �ڽ�Ŭ�������ִ� �޼��带 �𸣱⶧����)
		System.out.println("--------------------------------------------------");
		Ex11_1_Dog dog = new Ex11_1_Dog();
		dog.eat(); // ��� ���� �޼ҵ�
		dog.sleep(); // ��� ���� �޼ҵ�
		dog.makeSound(); // �������̵��� �޼ҵ�
		
		//DogŬ������ ������ �ִ� �޼ҵ�
		dog.bark();

		System.out.println("--------------------------------------------------");
//               <���� ���� ������Ÿ��>           �迭�� ũ�⸦ �����Ӱ� �÷���( = �����迭)
		ArrayList<Ex11_1_Animal> list = new ArrayList<>();
		list.add(new Ex11_1_Dog());
		list.add(new Ex11_1_Cat()); // cat���� �޼ҵ尡 �����Ǿ� ���� �����Ƿ� ��ӹ��� animal�� �޼ҵ尡 ȣ��ȴ�.
		//add(�̸� ������� �޼ҵ�) - ������ �߰�(�迭�� ���� ������)
		//					���� �迭 list -> {Ex11_1_Dog(),Ex11_1_Cat()}
		for(Ex11_1_Animal animal : list) {
			animal.makeSound();  // ����� Dog,Cat �Ѵ� 
		}
		
		System.out.println("--------------------------------------------------");

		
		// �������� ����ȯ
		//������Ÿ��(Ŭ������) ������ = (��ȯ��Ÿ��)��ȯ�Һ���;
		Ex11_1_Animal animal = (Ex11_1_Animal)dog; 
		
		// animalŬ������ ������ �ִ� �޼ҵ�
		animal.eat();
		animal.sleep();
		animal.makeSound();
		// DogŬ������ ������ �ִ� �޼ҵ�(��� �Ұ�)
//		animal.brak(); // animalŬ������ bark()�޼ҵ尡 ���� ������ ��� �Ұ�
		
		Ex11_1_Dog dog2 = (Ex11_1_Dog)animal; // ������Ÿ��(Ŭ������)�� �ִ� �޼ҵ� ��� ��밡��
		// ��ӹ��� �޼ҵ�
		dog2.eat();
		dog2.sleep();
		dog2.makeSound();
		
		// Dog�� ������ �ִ� �޼ҵ�
		dog2.bark();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
