package kr.co.green;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Ex14_Collection {

	public static void main(String[] args) {
		ArrayList<Integer> integerList = new ArrayList<>();
		// add(��) : ������ �߰�
		integerList.add(10);
		integerList.add(20);
		integerList.add(20);
		System.out.println(integerList);
		
		// size() : ArrayList�� ����
		for(int i = 0; i < integerList.size(); i++) {
			// ���� ��� �迭 : ������[�ε���];
			// ArrayList : ������.get(�ε���);
			System.out.println(integerList.get(i));
		}
		
		for(Integer item : integerList) {
			System.out.println(item);
		}
		
		// set(�ε���, ��) : ������ ����
		integerList.set(1, 50);
		System.out.println(integerList);
		
		// remove(�ε���) : ������(���)����
		integerList.remove(1);
		System.out.println(integerList);
		
		// clear() : ��ü ����
		integerList.clear();
		System.out.println(integerList);
		
		// isEmpty() : �迭�� ����� ������ true, ����� ���� ������ false
		System.out.println(integerList.isEmpty());
		System.out.println("---------------------------------------");
	
		// LinkedList -> �������� O
		LinkedList<Integer> linked = new LinkedList<>();
		
		linked.add(10);
		linked.add(20);
		
		linked.addFirst(100);
		linked.add(1, 500);
		System.out.println(linked);
		
		System.out.println("---------------------------------------");
		
		
		// Hash -> �������� X
		// Linked -> �������� O
		
		// HashSet -> ������ ������� �ʰ�, �ߺ� ���X
		HashSet<Integer> hs = new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(20);
		hs.add(20);
		hs.add(30);
		
		System.out.println(hs);
		
		System.out.println("---------------------------------------");
	
	
		// HashMap -> Key(�ߺ�X) - value(�ߺ�O) ����, ������ ������� ����
		HashMap<String, Integer> hm = new HashMap<>();
		// String : Key�� ������ Ÿ��
		// integer : Value�� ������ Ÿ��
		// ex) "��������" : 50, "��������" : 70
		
		hm.put("��������", 50);
		hm.put("��������", 70);
		hm.put("��������", 90);
		System.out.println(hm); // HahsMap �� ���
		System.out.println(hm.get("��������")); // �ش��ϴ� Ű("��������")��  Value�� ���
		System.out.println(hm.keySet()); // HashMap�� ����ִ� Key�� ���� �迭���·� ��ȯ
		if(hm.containsKey("��������")) { // true��ȯ, containsKey containsValue : �ʿ��� Ű�� ���� �ִ��� Ȯ���ϴ� �޼ҵ�
			System.out.println("-------------------------------------");
			System.out.println(hm.get("��������")); // Value�� ���
			System.out.println("-------------------------------------");
		}
		
		
		for(String key : hm.keySet()) { // HashMap�� �ִ� ���� ��� ������ ���ؼ��� for�� ����ؾ� �Ѵ�.
			System.out.print(key + ":"); // key�� �� ���
			System.out.println(hm.get(key)); // key�� value�� ���
		}
	}
}
	



