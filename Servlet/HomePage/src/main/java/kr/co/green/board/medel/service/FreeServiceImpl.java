package kr.co.green.board.medel.service;

import java.util.ArrayList;

import kr.co.green.board.medel.dao.FreeDao;
import kr.co.green.board.medel.dto.FreeDtoImpl;
import kr.co.green.common.PageInfo;

public class FreeServiceImpl implements BoardService {
	FreeDao freeDao; 
	
	public FreeServiceImpl() {
		freeDao = new FreeDao();
	}
	
	//리스트 조회
	@Override
	public ArrayList<FreeDtoImpl> getList(PageInfo pi,  String category, String searchText) { // 인터페이스 추상메서드 구현
		return freeDao.getList(pi, category, searchText);
	}
	
	//전체 게시글 수
	@Override
	public int getListCount(String category, String searchText) {
		return freeDao.getListCount(category, searchText) ;
	}
	
	//글 등록
	@Override
	public int enroll(FreeDtoImpl freeDto) {
		return freeDao.enroll(freeDto);
	}
	
	//글 상세보기
	@Override
	public FreeDtoImpl getDetail(int boardNo) {
		// 게시글 상세보기를 가져오면서 필요한 작업(트랜잭션) 
		
		// 1. 게시글 정보 조회
		FreeDtoImpl result = freeDao.getDetail(boardNo);
		
		// 2. 작성자 조회
		freeDao.getWriter(result);
		
		// 3. 조회수 증가
		int resultView = freeDao.setViews(result.getBoardNo());
										// 증가시킬 게시글의 번호를 넘겨준다
		if(resultView == 1) {
			return result;
		}
		return null;
	}
	
	//글 수정 폼
	@Override
	public FreeDtoImpl getEditForm(int boardNo) {
		FreeDtoImpl result = freeDao.getDetail(boardNo);
		freeDao.getWriter(result);
		
		return result;
	}
	//글 수정
	@Override
	public int setEdit(FreeDtoImpl freeDto) {
		return freeDao.setEdit(freeDto);
	}
	
	//글 삭제
	@Override
	public int setDelete(FreeDtoImpl freeDto) {
		return freeDao.setDelete(freeDto);
	}

}