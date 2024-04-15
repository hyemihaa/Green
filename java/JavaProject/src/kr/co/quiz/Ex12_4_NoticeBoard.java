package kr.co.quiz;

public class Ex12_4_NoticeBoard implements Ex12_4_Board {
	public String title, content, writer,date; 
	
	public Ex12_4_NoticeBoard() {}
	public Ex12_4_NoticeBoard(String inputTitle, String inputContent, String inputWriter, String inputDate) {
		this.title = inputTitle;
		this.content = inputContent;
		this.writer = inputWriter;
		this.date = inputDate;
	}
	@Override
	public String insert() {
		if(writer.equals(WRITER)) {
			System.out.println(title);
			System.out.println(content);
			System.out.println(date);
		}
		else {
			System.out.println("��ġ���� �ʽ��ϴ�.");
		}
		return " ";
	}
	@Override
	public String edit() {
		if(writer.equals(WRITER)) {
			System.out.println(title);
			System.out.println(content);
			System.out.println(date);
		}
		else {
			System.out.println("��ġ���� �ʽ��ϴ�.");
		}
		return " ";
	}
	@Override
	public  String delete() {
		if(writer.equals(WRITER)) {
			System.out.println("�������� �Խ��ǿ� ���� ���� �Ǿ����ϴ�.");
		}
		else {
			System.out.println("��ġ���� �ʽ��ϴ�.");
		}
		return " ";
	}
	
}
	


