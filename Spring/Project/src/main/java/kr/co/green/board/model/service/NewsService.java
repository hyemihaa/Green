package kr.co.green.board.model.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.web.multipart.MultipartFile;

import kr.co.green.board.model.dto.BoardDto;
import kr.co.green.board.model.dto.NewsDto;
import kr.co.green.common.pageing.PageInfo;

public interface NewsService {
	// 게시글 조회
	List<NewsDto> newsList(NewsDto newsDto, PageInfo pi);
	
	// 전체 게시글 조회
	int getListCount(NewsDto newsDto);
	
	// 게시글 상세보기 -> 게시글 조회 + 조회수 증가
	NewsDto getDetail(NewsDto newsDto, String type);
	
	int enroll(NewsDto news, MultipartFile upload, HttpSession session);

	int edit(NewsDto newsDto, MultipartFile upload, int loginMemberNo);
	
	int delete(int boardNo, int memberNo, int loginMemberNo);
}
