package kr.co.green;

import java.util.Scanner;

public class Ex3_while {

	public static void main(String[] args) {
		//<while��> while(���ǽ�){�ݺ� ������ �ڵ�; ������ �Ǵ� �б⹮;} -> ���ǽ��� false�� �� ���� �ݺ�
		
		//cnt = count
		int cnt = 0;
		
		while(cnt < 10) {  // ++cnt < 10 : 1���� -> ���ǽ� Ȯ��, cnt++ < 10 : ���ǽ� Ȯ���� -> 1���� => �� ���� ����
			System.out.println("cnt : " + cnt);
			cnt++;  //cnt = cnt + 1; , cnt += 1; --> �������� ������ ��� ���ѷ��� �߻�
		}
		
		// --> ���� while���� for������ ����
		for(int i=0; i<10; i++) {
			System.out.println("i :" + i);
		}
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("0�� �Է����ּ���: ");
		int num = sc.nextInt();
		
		// num �������� ������ 0�� ���;� ��
		// �ٸ� ���ڸ� �Է��ϸ� �ٽ� �Է��� �޾ƾ� ��
		while(num != 0) {
			System.out.print("�ٽ� �Է����ּ���: ");
			num = sc.nextInt(); //0�� �ƴҰ�� -> �ٽ� �Է��� �޾ƾ� ��
		}
		
		// 1 ~ 100 ���̿��� ¦�����ϱ�
		int i = 1;
		while(i <= 100) {
			if(i%2 == 0) {
				System.out.println(i);
			}
			i++;
		}
				


	}

}
