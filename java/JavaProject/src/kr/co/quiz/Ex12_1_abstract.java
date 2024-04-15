package kr.co.quiz;

public class Ex12_1_abstract {

	public static void main(String[] args) {
		Ex12_1_book b = new Ex12_1_book("¹¶", 10000, "¹¶º½ÀÌ");
		b.use();
		System.out.println("ÀÌ¸§ : " + b.name);
		System.out.println("°¡°Ý : " + b.price);
		System.out.println("ÀÛ°¡ÀÌ¸§ : " + b.getAuthor());
		System.out.println();
		
		Ex12_1_pen p = new Ex12_1_pen("º½¹¶", 20000, "¾ó·è¹«´Ì");
		p.use();
		System.out.println("ÀÌ¸§ : " + p.name);
		System.out.println("°¡°Ý : " + p.price);
		System.out.println("»ö»ó : " + p.getColor());
	
	
		
	}
	
	
}
