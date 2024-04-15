package kr.co.green;

public class Ex14_generic {

	public static void main(String[] args) {
		// ���׸� : ������ �ܰ迡�� �ڷ����� üũ
		Person<String> p1 = new Person();
		p1.var = "String";
		System.out.println(p1.var);
		p1.method("A");
		System.out.println("------------------------------------");
		
		Person<Boolean> p2 = new Person();
		p2.var = true;
		System.out.println(p2.var);
		p2.method(true);
		System.out.println("------------------------------------");
	}
}

class Person<T> {
//	public String var;
	public T var;
	
//	public void method{String str);
	public void method(T str) {
		System.out.println(str);
//			instanceof�� ��ü Ÿ���� Ȯ���ϴ� �������̴�.
		if(str instanceof String) {
			System.out.println("String�Դϴ�");
		}
		else {
			System.out.println("String�� �ƴմϴ�." + str.getClass());
		}
	}
}