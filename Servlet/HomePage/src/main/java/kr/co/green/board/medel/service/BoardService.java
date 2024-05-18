package kr.co.green.board.medel.service;

import java.util.ArrayList;

import kr.co.green.board.medel.dto.FreeDtoImpl;
import kr.co.green.common.PageInfo;

public interface BoardService { // 게시판에 필요한 구성?
//리스트 조회
	public ArrayList<FreeDtoImpl> getList(PageInfo pi, String category, String searchText); // 매개변수 확인 하기 
	
//전체 게시글 수
	public int getListCount(String category, String searchText); 
//글 등록
	public int enroll(FreeDtoImpl freeDto);
//글 상세보기
	public FreeDtoImpl getDetail(int boardNo);
//글 수정폼
	public FreeDtoImpl getEditForm(int boardNo);
//글 수정
	public int setEdit(FreeDtoImpl freeDto);
//글 삭제
	public int setDelete(FreeDtoImpl freeDto);
	
}
