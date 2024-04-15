package kr.co.test3;
// 4�� ����
public class MainUser {

	public static void main(String[] args) {
        // ���ͳ� ����� ����
        InternetUser user1 = new InternetUser("User1", "user1@example.com");
        user1.displayUserInfo(); // ����� ���� ���

        // �����̾� ����� ����
        PremiumUser premiumUser1 = new PremiumUser("PremiumUser1", "premiumuser1@example.com", 12);
        premiumUser1.displayUserInfo(); // ����� ���� ���
        premiumUser1.displayMembershipPeriod(); // ����� �Ⱓ ���

	} //���� ��
	
}
	//���ͳ� ����� Ŭ����
	class InternetUser {
	    private String username;
	    private String email;
	    
	    public InternetUser() {} //�⺻������
	    public InternetUser(String username, String email) {
	    	this.username = username;
	    	this.email = email;
	    }
	    
	    // ����� ���� ��� �޼���
	    public void displayUserInfo() {
	    	System.out.println("����� �̸� : " + username + " �̸��� : " + email);
	    }
	    
	    // getter/setter ����
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
	
	
	// �����̾� ����� Ŭ���� (���ͳ� ����� Ŭ������ ����ؾ� ��)
	class PremiumUser extends InternetUser {
	    private int membershipPeriod;

	    // ������
	    public PremiumUser(String username, String email, int membershipPeriod) {
	    	this.setUserName(username);
	    	this.setEmail(email);
	    	this.setMembershipPerio(membershipPeriod);
	    }

	    // membershipPeriod setter����
	    public void setMembershipPerio(int membershipPeriod) {
	    	this.membershipPeriod = membershipPeriod;
	    }
	    
	    // ����� �Ⱓ ��� �޼���
	    public void displayMembershipPeriod() {
	    	System.out.println("����� �Ⱓ : " + membershipPeriod);
	    }
	    
	}


