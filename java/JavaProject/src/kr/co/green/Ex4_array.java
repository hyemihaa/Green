package kr.co.green;

public class Ex4_array {

	public static void main(String[] args) {
		//�迭(Array) - ���� �ڷ����� ���� ������ �ϳ��� ���� ������
		//	ex) int num1 = 1, int num2= 2 --> {1,2}
		//  ex) string str = "AB", "BC" --> {"AB", "BC"}

        // <�迭����>
        // 1. �ڷ���[] �迭��; (java - ������)
        // 2. �ڷ��� �迭��[];
        int[] numbers;
        
        // <�迭 ���� �� �Ҵ�>
        // 1. �ڷ���[] �迭�� = new �ڷ���[�迭ũ��]; (java - ������)
        // 2. �ڷ��� �迭��[] = new �ڷ���[�迭ũ��];
        int[] numbers2 = new int[5]; // ������ �迭 ���� -> �迭ũ�� = 5
        
        //�ε���(Index) - �迭 ���� �� ���(element)�� �����ϱ� ���� ���Ǵ� ��ȣ�ν� �ε����� 0���� ������ (=��ġ�� ����Ű�� ��ȣ)
        // <�迭�ʱ�ȭ> -> �ε����� ���� �־��ش�
        numbers2[0] = 10;
        numbers2[1] = 20;
        numbers2[2] = 30;
        numbers2[3] = 40;
        numbers2[4] = 50;
        
        // for���� Ȱ���ؼ� ���� �ڵ带 ����
        // 1��°
        int value = 10;
        for(int i=0; i<5; i++) { // i=0 �϶�                      			     i=1 �϶�
        	numbers2[i] = value; // numbers2[0] = 10(value��);       			 numbers2[1] = 20(value��);
        	value += 10;         // i=0 �϶� value = 10(�ʱⰪ value) + 10 = 20;    i=1 �϶� value = 10(�ʱⰪ value) + 20 = 30;
        }
        
        // 2��°
        for(int i=1; i<6; i++) {
        	numbers2[i-1] = i*10;
        }
        
        // <�迭 ����� �ʱ�ȭ>
        int[] numbers3 = {10, 20, 30 ,40 ,50};
        //                  0   1   2   3   4 --> index ��ġ
        System.out.println(numbers3[2]);


	}

}
