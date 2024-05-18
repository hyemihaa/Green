package kr.co.green.member.model.dto;

public class Member {
	private int userNo;
	private String userFirstName;
	private String userLastName; 
	private String userEmail; 
	private String userPwd; 
	private String confirmPwd;

//	getter, setter 
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public void setConfirmPwd(String confirmPwd) {
		this.confirmPwd = confirmPwd;
	}
	
	public int getUserNo() {
		return userNo;
	}
	public String getUserFirstName() {
		return userFirstName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public String getConfirmPwd() {
		return confirmPwd;
	}
}