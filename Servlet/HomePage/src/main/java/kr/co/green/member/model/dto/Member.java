package kr.co.green.member.model.dto;
// DTO(Data Transfer Object) 
// : 데이터를 전송하는데 필요한 getter와 setter 메서드만을 가지는 아주 단순한 객체

public class Member {
	private int userNo;
	private String userName;
	private String userId;
	private String userPwd;
	private String confirmPwd;
	private String userType;
	
	
	public Member(){
		
	}
	
	public Member(String userName, String userId, String userPwd, String confirmPwd){ // 생성자 사용
		this.userName = userName;
		this.userId = userId;
		this.userPwd = userPwd;
		this.confirmPwd = confirmPwd;
	}
	
	// getter, setter (alt + shift + S)
	
	
	public int getUserNo() {
		return userNo;
	}
	
	public void setUserNo(int nserNo) {
		this.userNo = nserNo;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	
	public String getConfirmPwd() {
		return confirmPwd;
	}
	public void setConfirmPwd(String confirmPwd) {
		this.confirmPwd = confirmPwd;
	}
	
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
}
