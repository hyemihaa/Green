package kr.co.test3;

public class Quiz1 {

	public static void main(String[] args) {
		// Ex1 
		int age = 25;
		double weight = 68.5;
		char grade = 'A';
		boolean isMale = true;
		String name = "John Doe";
		System.out.println("문자열의 길이 : " + name.length());
		System.out.println("문자열의 첫번째 문자 : " + name.charAt(0));
		System.out.println("문자열 대문자 변환 : " + name.toUpperCase());
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
		concat.concat("뭉구와 ", "봄");
		concat.concat("봄이와 ", "뭉구는 ", "뭉봄이");
		
		System.out.println();

		
		// Ex5 - 2)
	     // 문자열과 반복 횟수를 입력받아 해당 문자열을 입력된 반복 횟수만큼 반복한 결과를 반환
        String repeatedString = repeatString("Hello ", 3);
        System.out.println(repeatedString); // 출력: Hello Hello Hello 

        // 문자열만 입력받았을 때는 한 번만 반복하도록 오버로딩
        String singleRepeat = repeatString("Hi");
        System.out.println(singleRepeat); // 출력: Hi

        // 반복 횟수를 입력받지 않았을 때는 오류 메시지를 출력하도록 오버로딩
        String errorMessage = repeatString();
        System.out.println(errorMessage); // 출력: 반복 횟수를 입력해주세요.
		
        System.out.println();
        
        
        
		
		// Ex5 - 3) 계산기 만들기
		int[] numbers = {50, 5, 8, 132, 15};
//		Quiz1 ex = new Quiz1(); // 객체선언 후 메소드 호출 
		
//		또는 static메소드생성 후 호출 -> 클래스명.메소드이름		
		int arrSum = Quiz1.sum(numbers);
		System.out.println("덧셈 : " + arrSum);
		int arrProduct = Quiz1.product(numbers);
		System.out.println("곱셈 : " + arrProduct);
		int arrMax = Quiz1.max(numbers);
		System.out.println(arrMax);
		int arrMin = Quiz1.min(numbers);
		System.out.println(arrMin);
		System.out.println();
		
	
	} // main 끝
	
	
	
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
			return "반복 횟수를 입력해주세요.";
		}
	
		
		
		// Ex5 - 3) 계산기 만들기
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
