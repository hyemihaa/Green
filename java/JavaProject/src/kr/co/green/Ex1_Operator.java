package kr.co.green;

public class Ex1_Operator {

	public static void main(String[] args) {
		// <������ : Ư�� ������ ���ͷ�(��)�� ���� �־��� ���� ����Ͽ� ����� ���� ������ �����ϴ� ��ȣ>
		int result;
		int firstNumber = 50;
		int secondNumber = 20;
		
		// 50 + 20
		result = firstNumber + secondNumber;
		System.out.println("���� ��� : " + result);
		
		result = firstNumber - 30;
		System.out.println("���� ��� : " + result);
		
		System.out.println(10+30*5); // * > + -> �켱������ *�� �� ����
		System.out.println((10+30)*5); // + ���� ��� -> ��ȣ�� ���´� (��ȣ�� �켱������ ����)
		
		// ���� ������
		// ++ : 1����
		// -- : 1����
		
		// <���� ���� ������>
		int x = 10;
		//x = x + 1;
		x++; // 1����
		System.out.println(x); //11
		
		x--; // 1����
	    System.out.println(x); // 10
	      
	    // <���� ���� ������>
	    int y =10;
	    ++y; // 1����
	    System.out.println(y); // 11
	      
	    --y; // 1����
	    System.out.println(y); // 10
		
	    // <����, ���� ���� ������ ������>
	    int z = 10;
	    
	    // println ���� -> z���� 1����
	    // 1. println�� ����Ǹ鼭 "���� ���� ������ : 10" ���
	    // 2. z������ ���� 1����(11)
	    // 3. println�� ����Ǹ鼭 "���� �� : 11" ���
	   
	    System.out.println("���� ���� ������ : " + z++); // 10
	    // println�� ����� ��, ���� x�� +1�� �����
	    // z = z + 1; --> ��� �� �����ٿ� �� ����(��� �� ����)  --> ���� ���� ������
	    System.out.println("���� �� : " + z); // 11

	    // z���� 1���� -> println ����
	    // 1. z������ ���� 1����(12)
	    // 2. println�� ����Ǹ鼭 "���� ���� ������ : 12" ���
	    // 3. println�� ����Ǹ鼭 "���� �� : 12" ���
	    
	    // println�� ����Ǳ� ��, ���� x�� +1�� �����
	    // z = z + 1; --> ��� ���ٿ� �� ����(���� ���� �� ���) --> ���� ���� ������ (���󵵰� ����)
	    System.out.println("���� ���� ������ : " + ++z); // 12
	    System.out.println("���� �� : " + z); // 12
	    
	    // <�� ������> -> ������� ��(true) �Ǵ� ����(false)
//	    firstNumber = 50;
//	    secondNumber = 20;
	    System.out.println(10 < 5); // false
	    System.out.println(firstNumber > secondNumber); //true
	    System.out.println(firstNumber <= 50); //true
	    
	    String firstStr ="hi";
	    String secondStr = new String("hi");
	    System.out.println(firstStr == secondStr); //false --> ������ ���� �����͸� �����Ѿ� �Ѵ�.
	    System.out.println(firstStr.equals(secondStr)); //true --> equals �޼ҵ� ��� : ���ڿ� ���� ��
	                
	    
	    // <�� ���� ������ ! > true -> false, false -> true
	    boolean isTrue = true;
	    
	    System.out.println(isTrue); // true
	    System.out.println(!isTrue); // false
	    
	    // equals : �� ���� ���ڿ��� ������ true, �ٸ��� false
	    // �����ڰ� �� ���� ���ڿ��� �ٸ��� true, ������ false�� ��ȯ�ϰ� �ʹ�
	    // --> �� ���� ������(!)
	    System.out.println(!firstStr.equals(secondStr)); // false

	    // <�� ������ &&, ||>
	    // ���ǹ��� ������ �� ���ʿ��� ���������� ������
	    
	    // &&(AND) : �� ���� ��� ��(true)�϶� -> true
	    System.out.println(10>5 && 20==20); // true
	    System.out.println(10>5 && 20!=20); // false
	    
	    // ||(OR) : �� ������ �ϳ��� ��(true) �̸� -> true
	    System.out.println(10>5 || 20!=20); // true
	    System.out.println(10<5 || 20!=20); // false
	    
	    // <���� ������ : ���ǽ��� �����ϰ� �ٿ� ����ϱ� ���� ��� (���� ? ��: ����) > ������ ���꿡�� ����õ(�������� ������)
	    int a =10;
	    int b= 5;
	    
	    // ���ǽ� ? true�� �� ������ �ڵ� : false�� �� ������ �ڵ�
	    System.out.println(a>b ? a+10 : a-10); // true�� ��� ?�� �̵� -> 20 ���   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
