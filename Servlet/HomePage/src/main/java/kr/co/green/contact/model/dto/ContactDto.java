package kr.co.green.contact.model.dto;

public class ContactDto {
	// 문의 번호 = no
	// 문의 내용 = message
	// 문의한 사람 이름 = name
	// 문의 이메일 = email
	// 문의 작성일 = indate
	// 답변 여부 = answerStatus
	private int no;
	private String message;
	private String name;
	private String email;
	private String indate;
	private String answerStatus;
	
	// 답변 번호 = answerNo
	// 답변 내용 = answerContent
	// 답변 작성자 = answerWirter
	// 답변 작성일 = answerIndate
	private int answerNo;
	private String answerContent;
	private String answerWirter;
	private String answerIndate;
	
	// 회원 번호 = memberNo 
	private int memberNo;
	
	// 기본 생성자
	public ContactDto() {
		super(); // -> 생략가능 
	}
	
	// 매개변수있는 생성자
	public ContactDto(String name, String email, String message, int memberNo) {
		this.name = name;
		this.email = email;
		this.message = message;
		this.memberNo = memberNo;
	}
	

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIndate() {
		return indate;
	}

	public void setIndate(String indate) {
		this.indate = indate;
	}

	public String getAnswerStatus() {
		return answerStatus;
	}

	public void setAnswerStatus(String answerStatus) {
		this.answerStatus = answerStatus;
	}

	public int getAnswerNo() {
		return answerNo;
	}

	public void setAnswerNo(int answerNo) {
		this.answerNo = answerNo;
	}

	public String getAnswerContent() {
		return answerContent;
	}

	public void setAnswerContent(String answerContent) {
		this.answerContent = answerContent;
	}

	public String getAnswerWirter() {
		return answerWirter;
	}

	public void setAnswerWirter(String answerWirter) {
		this.answerWirter = answerWirter;
	}

	public String getAnswerIndate() {
		return answerIndate;
	}

	public void setAnswerIndate(String answerIndate) {
		this.answerIndate = answerIndate;
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	


	
}
