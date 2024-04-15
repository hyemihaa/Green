package kr.co.quiz;

import java.util.Scanner;

public class Ex12_4_Quiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("제목 : ");
		String inputTitle = sc.nextLine();
		
		System.out.print("내용 : ");
		String inputContent = sc.nextLine();
		
		System.out.print("작성자 : ");
		String inputWriter = sc.nextLine();
		
		System.out.print("날짜 : ");
		String inputDate = sc.nextLine();
	
		Ex12_4_NoticeBoard notice = new Ex12_4_NoticeBoard(inputTitle, inputContent, inputWriter, inputDate);	
		notice.delete();
		
		Ex12_4_FreeBoard free = new Ex12_4_FreeBoard(inputTitle, inputContent, inputWriter, inputDate);
	
	}

}
