package kr.co.green.board.model.service;

import java.util.List;

import kr.co.green.board.model.dto.BoardDto;
import kr.co.green.board.model.dto.NewsDto;
import kr.co.green.common.pageing.PageInfo;

public interface FreeService {
	// 게시글 조회
	List<BoardDto> freeList(PageInfo pi, BoardDto free);
	
	// 전체 게시글 조회
	int getListCount(BoardDto free);
	
	// 게시글 상세보기 -> 게시글 조회 + 조회수 증가
	BoardDto getDetail(BoardDto free);
	
	// 게시글 등록
	int enroll(BoardDto board);
}
