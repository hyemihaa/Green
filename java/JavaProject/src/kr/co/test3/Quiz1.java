package kr.co.test3;

public class Quiz1 {

	public static void main(String[] args) {
		// Ex1 
		int age = 25;
		double weight = 68.5;
		char grade = 'A';
		boolean isMale = true;
		String name = "John Doe";
		System.out.println("���ڿ��� ���� : " + name.length());
		System.out.println("���ڿ��� ù��° ���� : " + name.charAt(0));
		System.out.println("���ڿ� �빮�� ��ȯ : " + name.toUpperCase());
		System.out.println();
		
		
		// Ex2
		int x = 10;
		int y = 5;
		int sum = x + y;
		int difference = x - y;
		int product = x * y;
		int quotient = x / y;
		int remainder = x % y;
		
		
		// Ex3
		int num = 53;
		if(num >= 0 && num < 10) {
		}
		if(num >= 10 && num < 20) {
		}
		if(num < 50 || num >=60) {
		}
		else {
		}

		
		// Ex4
		for(int i = 0; i <= 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		// Ex5 - 1)
		Quiz1 concat = new Quiz1();
		concat.concat("������ ", "��");
		concat.concat("���̿� ", "������ ", "������");
		
		System.out.println();

		
		// Ex5 - 2)
	     // ���ڿ��� �ݺ� Ƚ���� �Է¹޾� �ش� ���ڿ��� �Էµ� �ݺ� Ƚ����ŭ �ݺ��� ����� ��ȯ
        String repeatedString = repeatString("Hello ", 3);
        System.out.println(repeatedString); // ���: Hello Hello Hello 

        // ���ڿ��� �Է¹޾��� ���� �� ���� �ݺ��ϵ��� �����ε�
        String singleRepeat = repeatString("Hi");
        System.out.println(singleRepeat); // ���: Hi

        // �ݺ� Ƚ���� �Է¹��� �ʾ��� ���� ���� �޽����� ����ϵ��� �����ε�
        String errorMessage = repeatString();
        System.out.println(errorMessage); // ���: �ݺ� Ƚ���� �Է����ּ���.
		
        System.out.println();
        
        
        
		
		// Ex5 - 3) ���� �����
		int[] numbers = {50, 5, 8, 132, 15};
//		Quiz1 ex = new Quiz1(); // ��ü���� �� �޼ҵ� ȣ�� 
		
//		�Ǵ� static�޼ҵ���� �� ȣ�� -> Ŭ������.�޼ҵ��̸�		
		int arrSum = Quiz1.sum(numbers);
		System.out.println("���� : " + arrSum);
		int arrProduct = Quiz1.product(numbers);
		System.out.println("���� : " + arrProduct);
		int arrMax = Quiz1.max(numbers);
		System.out.println(arrMax);
		int arrMin = Quiz1.min(numbers);
		System.out.println(arrMin);
		System.out.println();
		
	
	} // main ��
	
	
	
		// Ex5 - 1)
		public void concat(String str1, String str2) {
			System.out.println(str1 + str2);
		}
		public void concat(String str1, String str2, String str3) {
			System.out.println(str1 + str2 + str3);
		}
		
	
		
		
		// Ex5 - 2)
		
		static public String repeatString(String str, int num) {
			String result = "";
			for(int i = 0; i < num; i++) {
				result = result + str;
			}
			return result;
		}
		
		static public String repeatString(String str) {
			return str;
		}
		
		static public String repeatString() {
			return "�ݺ� Ƚ���� �Է����ּ���.";
		}
	
		
		
		// Ex5 - 3) ���� �����
		static public int sum(int[] numbers) {
			int sum = 0;
			for(int i = 0; i < numbers.length; i++) {
				sum += numbers[i];
			}
			return sum;
		}
		static public int product(int[] numbers) {
			int product = numbers[0];
			for(int i = 1; i < numbers.length; i++) {
				product *= numbers[i];
			}
			return product;
		}
		static public int max(int[] numbers) {
			int max = numbers[0];
			for(int i = 0; i < numbers.length; i++) {
				if(max < numbers[i]) {
					max = numbers[i];
				}
			}
			return max;
		}
		static public int min(int[] numbers) {
			int min = numbers[0];
			for(int i = 0; i < numbers.length; i++) {
				if(min > numbers[i]) {
					min = numbers[i];
				}
			}
			return min;
		}
		
	
		

		
		
		
	
}
