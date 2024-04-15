package kr.co.organize;

public class Ex1_operator {

	public static void main(String[] args) {
		
		// <������>
		// 1. ��� ������(+,-,*,?,%)
		int aNum = 10;
		int bNum = 20;
		int result1 = aNum + bNum; 
		int result2 = aNum - bNum;
		int result3 = aNum * bNum;
		int result4 = aNum / bNum;
		int result5 = aNum % bNum;
		
		// 2. ���� ������ (++, --)
		// 1���� �Ǵ� 1����
		aNum++;
		bNum--;
		
		// 3. �� ������(>, >=, <, <=, ==, !=)
		// a > b : a�� b���� ũ�� (�ʰ�)
		// a >=b : a�� b���� ũ�ų� ���� (�̻�)
		// a < b : b�� a���� �۴� (�̸�)
		// a <= b : b�� a���� �۰ų� ���� (����)
		// a == b : a�� b�� ���� 
		// a != b : a�� b�� ���� �ʴ�
		
		// 4. �� ���� ������(!)
		// ������ ����� true�� ��쿡 false ��ȯ
		// ������ ����� false�� ��쿡 true ��ȯ
		boolean isTrue = true;
		System.out.println(!isTrue); // �� ���� �����ڿ� ���� false�� ����
		
		String s1 = "apple";
		String s2 = new String("apple"); 
		
		// 0x100 == 0x200 -> false
		System.out.println(s1 == s2); // ���� ���� ������(��ü)���� ��
		
		// "apple".equals("apple") -> true
		System.out.println(s1.equals(s2)); // �����ϰ� ���ڿ��� �������� ��
		
		// ���ڿ��� ������ false, �ٸ��� true
		System.out.println(!s1.equals(s2));
		
		// 5. �� ������(&&, ||)
		// && : ������ ����� �������� ����� �� �� ��(true)�� �� true ��ȯ
		// || : ������ ����� �������� ����� �� �� �ϳ��� ��(true)�� �� true ��ȯ
		// ex) 10 > 5 && 100 == 101 --> ������ ��� true �������� ��� false --> false
		// ex) 10 > 5 || 100 == 101 --> ������ ��� true �������� ��� false --> true
		
		// 6. ���� ���� ������(+=, -=, *=, /=, %=)
		// ��� �����ڿ� ���� �����ڸ� �ϳ��� ��Ÿ�� �� �ִ� ������
		aNum += 5; // ����, aNum ������ ���� 5�� ���ϰڴ�.
		aNum -= 5; // ����, aNum ������ ���� 5�� ���ڴ�.
		
		// 7. ���� ������(���� ? �� : ����)
		// �ڵ�(����)�� ������������ �������� ���� �������� ������ �ǵ��� ������� �ʴ°��� ����
		int result = aNum > bNum ? aNum + 10 : aNum - 15;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
