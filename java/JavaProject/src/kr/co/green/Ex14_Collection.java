package kr.co.green;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Ex14_Collection {

	public static void main(String[] args) {
		ArrayList<Integer> integerList = new ArrayList<>();
		// add(값) : 데이터 추가
		integerList.add(10);
		integerList.add(20);
		integerList.add(20);
		System.out.println(integerList);
		
		// size() : ArrayList의 길이
		for(int i = 0; i < integerList.size(); i++) {
			// 원래 썼던 배열 : 변수명[인덱스];
			// ArrayList : 변수명.get(인덱스);
			System.out.println(integerList.get(i));
		}
		
		for(Integer item : integerList) {
			System.out.println(item);
		}
		
		// set(인덱스, 값) : 데이터 수정
		integerList.set(1, 50);
		System.out.println(integerList);
		
		// remove(인덱스) : 데이터(요소)삭제
		integerList.remove(1);
		System.out.println(integerList);
		
		// clear() : 전체 삭제
		integerList.clear();
		System.out.println(integerList);
		
		// isEmpty() : 배열이 비어져 있으면 true, 비어져 있지 않으면 false
		System.out.println(integerList.isEmpty());
		System.out.println("---------------------------------------");
	
		// LinkedList -> 순서보장 O
		LinkedList<Integer> linked = new LinkedList<>();
		
		linked.add(10);
		linked.add(20);
		
		linked.addFirst(100);
		linked.add(1, 500);
		System.out.println(linked);
		
		System.out.println("---------------------------------------");
		
		
		// Hash -> 순서보장 X
		// Linked -> 순서보장 O
		
		// HashSet -> 순서가 보장되지 않고, 중복 허용X
		HashSet<Integer> hs = new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(20);
		hs.add(20);
		hs.add(30);
		
		System.out.println(hs);
		
		System.out.println("---------------------------------------");
	
	
		// HashMap -> Key(중복X) - value(중복O) 형태, 순서가 보장되지 않음
		HashMap<String, Integer> hm = new HashMap<>();
		// String : Key의 데이터 타입
		// integer : Value의 데이터 타입
		// ex) "국어점수" : 50, "영어점수" : 70
		
		hm.put("국어점수", 50);
		hm.put("영어점수", 70);
		hm.put("수학점수", 90);
		System.out.println(hm); // HahsMap 값 출력
		System.out.println(hm.get("국어점수")); // 해당하는 키("국어점수")에  Value값 출력
		System.out.println(hm.keySet()); // HashMap에 담겨있는 Key의 값을 배열형태로 반환
		if(hm.containsKey("국어점수")) { // true반환, containsKey containsValue : 맵에서 키나 값이 있는지 확인하는 메소드
			System.out.println("-------------------------------------");
			System.out.println(hm.get("국어점수")); // Value값 출력
			System.out.println("-------------------------------------");
		}
		
		
		for(String key : hm.keySet()) { // HashMap에 있는 값을 모두 꺼내기 위해서는 for문 사용해야 한다.
			System.out.print(key + ":"); // key의 값 출력
			System.out.println(hm.get(key)); // key의 value값 출력
		}
	}
}
	



