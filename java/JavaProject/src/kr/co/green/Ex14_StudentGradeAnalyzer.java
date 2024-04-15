package kr.co.green;

import java.util.ArrayList;
import java.util.Scanner;

class Students { // �л� ���� Ŭ����
   private String name;
   private int score;
 
   public Students(String name, int score) {
      this.name = name;
      this.score = score;
   }
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public int getScore() {
      return score;
   }
   public void setScore(int score) {
      this.score = score;
   }
   
   
}

public class Ex14_StudentGradeAnalyzer {

   public static void main(String[] args) {
      ArrayList<Students> list = new ArrayList<>();    // �л� ����Ʈ
      Scanner sc = new Scanner(System.in);
      Boolean isTrue = true;
      
      while(isTrue) {
         System.out.println("1. �л� ���� �߰�");
         System.out.println("2. ��ü ���� ��� ��ȸ");
         System.out.println("3. �ְ� ���� �л� ����");
         System.out.println("4. ���� ���� �л� ����");
         System.out.println("5. ��� �л����� ���� ��ȸ");
         System.out.println("6. ����");
         System.out.println("�޴��� �����ϼ��� : ");
         int select = sc.nextInt();
         sc.nextLine();
         
         switch(select){
            case 1: // �л� ���� �߰�
               System.out.print("�л� �̸��� �Է��ϼ���: ");
               String name = sc.nextLine();
               
               System.out.print("�л� ������ �Է��ϼ���(0~100) : ");
               int score = sc.nextInt();
                             
               Students s = new Students(name, score); // ��ü ���� -> ����ڰ� �Է��� ������ s������ ��´�
               
               list.add(s); // list�� s������ ���� ��ü���� ����Ʈ�� �߰�
               System.out.println("-------------------------------------");
               break;
            case 2:  // ��ü���� �����ȸ
            	int totalScore = 0;
            	
            	for(int i = 0; i < list.size(); i++) {
            		totalScore = totalScore + list.get(i).getScore(); 
            									// get(i) ��ü �ε���, getScore() : i��° ��ü�� ����
            	}
            	System.out.println("��ü ��� : " + totalScore/list.size());
            	
               break;
            case 3: // �ְ� ����
            	int maxScore = -1;
            	for(int i = 0; i < list.size(); i++) {
            		if(maxScore < list.get(i).getScore()) {
            			maxScore = list.get(i).getScore();
            		}
            	}
            	System.out.println("�ְ� ���� : " + maxScore);
               break;
            case 4: // ���� ����
            	int minScore = 101;
//            	for(int i = 0; i < list.size(); i++) {
//            		if(minScore > list.get(i).getScore()) {
//            			minScore = list.get(i).getScore();
//            		}
//            	}
            	// for - each�� ���
            	for(Students item:list) {
            		if(minScore > item.getScore()) {
            			minScore = item.getScore();
            		}
            	}
            	System.out.println("���� ���� : " + minScore);
               break;
            case 5: // ��� �л����� ���� ��ȸ
               for(int i=0; i<list.size(); i++) {
                  System.out.println(list.get(i).getName() + " ( " + list.get(i).getScore() + " ) ");
               }
               break;
            case 6:
            	isTrue = false;
            	System.out.println("����Ǿ����ϴ�.");
               break;
            default:
         }
               
      }
      
   }
   
}



