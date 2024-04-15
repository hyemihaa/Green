package kr.co.green;

// 동물 클래스
public class Ex5_2__Object_Animal {
	// 먹기
	public int eat(String eat) {
		System.out.println(eat);
		return 1;
		//eat메소드는 1을 반환
	}
	// 잠자기
	public int sleep(String sleep) {
		System.out.println(sleep);
		return 2;
	}
	// 소리
	public void makeSound() {
		System.out.println();
	}
}
