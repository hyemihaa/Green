package kr.co.green;

import java.util.ArrayList;
import java.util.Scanner;

class Students { // 학생 정보 클래스
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
      ArrayList<Students> list = new ArrayList<>();    // 학생 리스트
      Scanner sc = new Scanner(System.in);
      Boolean isTrue = true;
      
      while(isTrue) {
         System.out.println("1. 학생 성적 추가");
         System.out.println("2. 전체 성적 평균 조회");
         System.out.println("3. 최고 성적 학생 정보");
         System.out.println("4. 최저 성적 학생 정보");
         System.out.println("5. 모든 학생들의 성적 조회");
         System.out.println("6. 종료");
         System.out.println("메뉴를 선택하세요 : ");
         int select = sc.nextInt();
         sc.nextLine();
         
         switch(select){
            case 1: // 학생 성적 추가
               System.out.print("학생 이름을 입력하세요: ");
               String name = sc.nextLine();
               
               System.out.print("학생 성적을 입력하세요(0~100) : ");
               int score = sc.nextInt();
                             
               Students s = new Students(name, score); // 객체 생성 -> 사용자가 입력한 정보를 s변수에 담는다
               
               list.add(s); // list에 s변수에 담은 객체정보 리스트에 추가
               System.out.println("-------------------------------------");
               break;
            case 2:  // 전체성적 평균조회
            	int totalScore = 0;
            	
            	for(int i = 0; i < list.size(); i++) {
            		totalScore = totalScore + list.get(i).getScore(); 
            									// get(i) 객체 인덱스, getScore() : i번째 객체의 점수
            	}
            	System.out.println("전체 평균 : " + totalScore/list.size());
            	
               break;
            case 3: // 최고 성적
            	int maxScore = -1;
            	for(int i = 0; i < list.size(); i++) {
            		if(maxScore < list.get(i).getScore()) {
            			maxScore = list.get(i).getScore();
            		}
            	}
            	System.out.println("최고 성적 : " + maxScore);
               break;
            case 4: // 최저 성적
            	int minScore = 101;
//            	for(int i = 0; i < list.size(); i++) {
//            		if(minScore > list.get(i).getScore()) {
//            			minScore = list.get(i).getScore();
//            		}
//            	}
            	// for - each문 사용
            	for(Students item:list) {
            		if(minScore > item.getScore()) {
            			minScore = item.getScore();
            		}
            	}
            	System.out.println("최저 성적 : " + minScore);
               break;
            case 5: // 모든 학생들의 성적 조회
               for(int i=0; i<list.size(); i++) {
                  System.out.println(list.get(i).getName() + " ( " + list.get(i).getScore() + " ) ");
               }
               break;
            case 6:
            	isTrue = false;
            	System.out.println("종료되었습니다.");
               break;
            default:
         }
               
      }
      
   }
   
}



