package kr.co.organize;

public class Ex1_operator {

	public static void main(String[] args) {
		
		// <연산자>
		// 1. 산술 연산자(+,-,*,?,%)
		int aNum = 10;
		int bNum = 20;
		int result1 = aNum + bNum; 
		int result2 = aNum - bNum;
		int result3 = aNum * bNum;
		int result4 = aNum / bNum;
		int result5 = aNum % bNum;
		
		// 2. 증감 연산자 (++, --)
		// 1증가 또는 1감소
		aNum++;
		bNum--;
		
		// 3. 비교 연산자(>, >=, <, <=, ==, !=)
		// a > b : a가 b보다 크다 (초과)
		// a >=b : a가 b보다 크거나 같다 (이상)
		// a < b : b가 a보다 작다 (미만)
		// a <= b : b가 a보다 작거나 같다 (이하)
		// a == b : a가 b와 같다 
		// a != b : a가 b와 같지 않다
		
		// 4. 논리 부정 연산자(!)
		// 연산의 결과가 true일 경우에 false 반환
		// 연산의 결과가 false일 경우에 true 반환
		boolean isTrue = true;
		System.out.println(!isTrue); // 논리 부정 연산자에 의해 false로 변경
		
		String s1 = "apple";
		String s2 = new String("apple"); 
		
		// 0x100 == 0x200 -> false
		System.out.println(s1 == s2); // 서로 같은 데이터(객체)인지 비교
		
		// "apple".equals("apple") -> true
		System.out.println(s1.equals(s2)); // 순수하게 문자열이 같은지만 비교
		
		// 문자열이 같으면 false, 다르면 true
		System.out.println(!s1.equals(s2));
		
		// 5. 논리 연산자(&&, ||)
		// && : 왼쪽의 결과와 오른쪽의 결과가 둘 다 참(true)일 때 true 반환
		// || : 왼쪽의 결과와 오른쪽의 결과가 둘 중 하나라도 참(true)일 때 true 반환
		// ex) 10 > 5 && 100 == 101 --> 왼쪽의 결과 true 오른쪽의 결과 false --> false
		// ex) 10 > 5 || 100 == 101 --> 왼쪽의 결과 true 오른쪽의 결과 false --> true
		
		// 6. 복합 대입 연산자(+=, -=, *=, /=, %=)
		// 산술 연산자와 대입 연산자를 하나로 나타낼 수 있는 연산자
		aNum += 5; // 덧셈, aNum 변수의 값에 5를 더하겠다.
		aNum -= 5; // 뺄셈, aNum 변수의 값에 5를 빼겠다.
		
		// 7. 삼항 연산자(조건 ? 참 : 거짓)
		// 코드(로직)가 복잡해질수록 가독성이 많이 떨어지기 때문에 되도록 사용하지 않는것을 권장
		int result = aNum > bNum ? aNum + 10 : aNum - 15;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
