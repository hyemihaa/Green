package kr.co.test3;

import java.util.Scanner;
//7�� ����
public class MemberInfo {
	// ���� �޼���
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̵� �Է��ϼ��� : ");
		String inputId = sc.nextLine();
		
		System.out.print("��й�ȣ�� �Է��ϼ��� : ");
		String inputPw = sc.nextLine();
		
		//��ü����
		Login info = new Login();
		
		//�޼ҵ� ȣ��
		String result = info.login(inputId, inputPw);
		
		System.out.println(result);
	} //���� �޼��� ��
	
}

//LoginInterface �������̽��� ����
interface LoginInterface{
	public String login(String inputId, String inputPw);
}



// LoginŬ���� ���� -> ������� memberId = "id" , memberPwd = "qwer1234" �� �����ϴ�.
class Login implements LoginInterface {
	String memberId = "id";
	String memberPwd  = "qwer1234";
	
	@Override
	public String login(String inputId, String inputPw) {
		if(memberId.equals(inputId) && memberPwd.equals(inputPw)) {
			return "�α��� �Ǿ����ϴ�.";
		}
		else if(memberId.equals(inputId) && memberPwd.equals(inputPw)) {
			return "���̵� Ʋ�Ƚ��ϴ�.";
		}
		else if(memberId.equals(inputId) && memberPwd.equals(inputPw)) {
			return "��й�ȣ�� Ʋ�Ƚ��ϴ�.";
		}
		else {
			return "�ٽ� Ȯ�ιٶ��ϴ�.";
		}
	}
	
	
	
	
	
	
}