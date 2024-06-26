package kr.co.green.board.model.service;

import java.util.List;

import kr.co.green.board.model.dto.BoardDto;
import kr.co.green.board.model.dto.NewsDto;
import kr.co.green.common.pageing.PageInfo;

public interface NewsService {
	// 게시글 조회
	List<NewsDto> newsList(NewsDto newsDto, PageInfo pi);
	
	// 전체 게시글 조회
	int getListCount(NewsDto newsDto);
	
	// 게시글 상세보기 -> 게시글 조회 + 조회수 증가
	NewsDto getDetail(NewsDto newsDto);

}
