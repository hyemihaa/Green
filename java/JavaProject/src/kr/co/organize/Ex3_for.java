package kr.co.organize;

public class Ex3_for {

	public static void main(String[] args) {
		
		// <반복문>
		// for문
		// 반복할 횟수를 알고 있을 때 사용, 대부분의 경우는 for문을 사용
		
		// 초기식 : int i = 0;
		// 조건식 : i < 10;
		// 증감식 : i++;
		for(초기식; 조건식; 증감식) {
			// 반복 실행할 코드
		}
		
		
		// 중첩 for문 (= 이중 for문)
		// for문 안에 for문이 하나 더 있는 구조
		// 처음 for문이 한번 돌 때,
		// 안에 있는 for문은 조건을 만족할 때 까지 반복을 하고 나서 다시 처음 for문으로 돌아옴
		
		// 첫번째 for문의 변수명 i
		// 두번째 for문의 변수명 j, k
		
		for(int i = 0; i < 10; i++) {
			// 실행할 코드
			
			for(int j = 0; j < 5; j++) {
				// 실행할 코드
			}
			
			// 실행할 코드
		}
		
		
		// 향상된 for문(= for each문)
		// 배열에 있는 값(요소)을 하나씩 꺼내주는 for문
		// 더이상 꺼낼 요소가 없으면 종료
		
		// 배열에 자료형과 꺼낼 변수의 자료형이 같아야 함
		// ex) int[] 배열을 꺼낼 때는 변수의 자료형도 int
		for(자료형 변수명 : 배열명) {
			// 실행할 코드
		}
		
		
		
		// while문
		// 반복할 횟수를 모를 경우에 사용
		// * 무한 루프의 발생 가능성이 높기 때문에 사용 시 주의가 필요함
		while(조건식) {
			// 실행할 코드
		}
	
		
		// do-while문
		// while의 조건식을 보기 전에, do에 있는 코드를 먼저 실행 함
		// 처음 실행이 될 때 조건식을 보지 않아서 최최 한번은 무조건 코드가 실행
		do {
			// 실행할 코드
		}
		while(조건식)
		
		
			
		
		
		
		
		
		
		
		

	}

}
