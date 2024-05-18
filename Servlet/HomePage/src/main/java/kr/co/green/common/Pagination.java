package kr.co.green.common;

// 페이징 처리 로직
public class Pagination { 
	
	public static PageInfo getPageInfo(int listCount, int cpage, int pageLimit, int boardLimit) {
		// 전체페이지
		// ex ) listCount : 101, boardLimit : 5 = 20.2 --> 총필요한 페이지 수 = 21페이지 
		// int로 나누면 소수점X ->  double로 형변환(소수점까지 필요하므로) Math.ceil : 올림 처리
		// 필요한 데이터는 int이므로 int로 형변환
		int maxPage = (int)(Math.ceil((double)listCount/boardLimit));
		
		// ex) cpage : 16, pageLimit : 10 (연산 순서)
		// 1. (16 - 1) / 10 => 15 / 10 = 1(몫)
		// 2. 1 * 10 = 10 => 10 + 1 = 11
		int startPage = (cpage-1) / pageLimit * pageLimit + 1;
		
		// ex) startPage : 11, pageLimit : 10
		// 11 + 10 = 21 => 21 - 1 = 20
		int endPage = startPage + pageLimit -1;
		
		// 현재 있는 페이지가 끝페이지 일때 더이상 이동하지 않게 하는 로직
		if(endPage > maxPage) {
			endPage = maxPage;
		}
		
		// ex) cpage : 16 boardLimit : 10
		// 16 - 1 = 15 => 15 * 10 = 150
		// DB에서 몇번째 데이터 부터 가져올지 (150번째행 부터)
		int offset = (cpage - 1) * boardLimit;
		
		return new PageInfo(listCount, cpage, pageLimit, boardLimit, 
							maxPage, startPage, endPage, offset);
	}
}
