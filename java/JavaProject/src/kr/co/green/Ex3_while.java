package kr.co.green;

import java.util.Scanner;

public class Ex3_while {

	public static void main(String[] args) {
		//<while문> while(조건식){반복 실행할 코드; 증감식 또는 분기문;} -> 조건식이 false될 때 까지 반복
		
		//cnt = count
		int cnt = 0;
		
		while(cnt < 10) {  // ++cnt < 10 : 1증가 -> 조건식 확인, cnt++ < 10 : 조건식 확인후 -> 1증가 => 잘 쓰지 않음
			System.out.println("cnt : " + cnt);
			cnt++;  //cnt = cnt + 1; , cnt += 1; --> 증감식을 생략할 경우 무한루프 발생
		}
		
		// --> 위의 while문을 for문으로 변경
		for(int i=0; i<10; i++) {
			System.out.println("i :" + i);
		}
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("0을 입력해주세요: ");
		int num = sc.nextInt();
		
		// num 변수에는 무조건 0이 들어와야 함
		// 다른 숫자를 입력하면 다시 입력을 받아야 함
		while(num != 0) {
			System.out.print("다시 입력해주세요: ");
			num = sc.nextInt(); //0이 아닐경우 -> 다시 입력을 받아야 함
		}
		
		// 1 ~ 100 사이에서 짝수구하기
		int i = 1;
		while(i <= 100) {
			if(i%2 == 0) {
				System.out.println(i);
			}
			i++;
		}
				


	}

}
