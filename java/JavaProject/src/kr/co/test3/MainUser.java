package kr.co.test3;
// 4번 문제
public class MainUser {

	public static void main(String[] args) {
        // 인터넷 사용자 생성
        InternetUser user1 = new InternetUser("User1", "user1@example.com");
        user1.displayUserInfo(); // 사용자 정보 출력

        // 프리미엄 사용자 생성
        PremiumUser premiumUser1 = new PremiumUser("PremiumUser1", "premiumuser1@example.com", 12);
        premiumUser1.displayUserInfo(); // 사용자 정보 출력
        premiumUser1.displayMembershipPeriod(); // 멤버십 기간 출력

	} //메인 끝
	
}
	//인터넷 사용자 클래스
	class InternetUser {
	    private String username;
	    private String email;
	    
	    public InternetUser() {} //기본생성자
	    public InternetUser(String username, String email) {
	    	this.username = username;
	    	this.email = email;
	    }
	    
	    // 사용자 정보 출력 메서드
	    public void displayUserInfo() {
	    	System.out.println("사용자 이름 : " + username + " 이메일 : " + email);
	    }
	    
	    // getter/setter 생성
	    public void setUserName(String username) {
	    	this.username = username;
	    }
	    public void setEmail(String email) {
	    	this.email = email;
	    }
	    
	    public String getUserName() {
	    	return username;
	    }
	    public String setEmail() {
	    	return email;
	    }
	}
	
	
	// 프리미엄 사용자 클래스 (인터넷 사용자 클래스를 상속해야 함)
	class PremiumUser extends InternetUser {
	    private int membershipPeriod;

	    // 생성자
	    public PremiumUser(String username, String email, int membershipPeriod) {
	    	this.setUserName(username);
	    	this.setEmail(email);
	    	this.setMembershipPerio(membershipPeriod);
	    }

	    // membershipPeriod setter생성
	    public void setMembershipPerio(int membershipPeriod) {
	    	this.membershipPeriod = membershipPeriod;
	    }
	    
	    // 멤버십 기간 출력 메서드
	    public void displayMembershipPeriod() {
	    	System.out.println("멤버쉽 기간 : " + membershipPeriod);
	    }
	    
	}


