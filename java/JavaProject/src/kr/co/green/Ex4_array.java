package kr.co.green;

public class Ex4_array {

	public static void main(String[] args) {
		//배열(Array) - 같은 자료형을 가진 변수를 하나로 묶어 관리함
		//	ex) int num1 = 1, int num2= 2 --> {1,2}
		//  ex) string str = "AB", "BC" --> {"AB", "BC"}

        // <배열선언>
        // 1. 자료형[] 배열명; (java - 사용권장)
        // 2. 자료형 배열명[];
        int[] numbers;
        
        // <배열 선언 및 할당>
        // 1. 자료형[] 배열명 = new 자료형[배열크기]; (java - 사용권장)
        // 2. 자료형 배열명[] = new 자료형[배열크기];
        int[] numbers2 = new int[5]; // 정수형 배열 생성 -> 배열크기 = 5
        
        //인덱스(Index) - 배열 내의 각 요소(element)에 접근하기 위해 사용되는 번호로써 인덱스는 0부터 시작함 (=위치를 가리키는 번호)
        // <배열초기화> -> 인덱스에 값을 넣어준다
        numbers2[0] = 10;
        numbers2[1] = 20;
        numbers2[2] = 30;
        numbers2[3] = 40;
        numbers2[4] = 50;
        
        // for문을 활용해서 위의 코드를 만듬
        // 1번째
        int value = 10;
        for(int i=0; i<5; i++) { // i=0 일때                      			     i=1 일때
        	numbers2[i] = value; // numbers2[0] = 10(value값);       			 numbers2[1] = 20(value값);
        	value += 10;         // i=0 일때 value = 10(초기값 value) + 10 = 20;    i=1 일때 value = 10(초기값 value) + 20 = 30;
        }
        
        // 2번째
        for(int i=1; i<6; i++) {
        	numbers2[i-1] = i*10;
        }
        
        // <배열 명시적 초기화>
        int[] numbers3 = {10, 20, 30 ,40 ,50};
        //                  0   1   2   3   4 --> index 위치
        System.out.println(numbers3[2]);


	}

}
