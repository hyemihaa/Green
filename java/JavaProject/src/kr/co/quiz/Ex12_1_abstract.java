package kr.co.quiz;

public class Ex12_1_abstract {

	public static void main(String[] args) {
		Ex12_1_book b = new Ex12_1_book("��", 10000, "������");
		b.use();
		System.out.println("�̸� : " + b.name);
		System.out.println("���� : " + b.price);
		System.out.println("�۰��̸� : " + b.getAuthor());
		System.out.println();
		
		Ex12_1_pen p = new Ex12_1_pen("����", 20000, "��蹫��");
		p.use();
		System.out.println("�̸� : " + p.name);
		System.out.println("���� : " + p.price);
		System.out.println("���� : " + p.getColor());
	
	
		
	}
	
	
}
