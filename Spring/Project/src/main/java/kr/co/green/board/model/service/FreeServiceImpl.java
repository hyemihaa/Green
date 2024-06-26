package kr.co.green.board.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.green.board.model.dao.FreeDao;
import kr.co.green.board.model.dto.BoardDto;
import kr.co.green.common.pageing.PageInfo;

@Service // service 어노테이션
public class FreeServiceImpl implements FreeService{
	
	// Dao 객체 생성
	private final FreeDao freeDao;
	private BoardDto freeDto;
	
	@Autowired
	public FreeServiceImpl(FreeDao freeDao) {
		this.freeDao = freeDao;
		this.freeDto = new BoardDto();
	}
	
	@Override
	public List<BoardDto> freeList(PageInfo pi, BoardDto free) {
		return freeDao.freeList(pi, free);
	}
	
	// 전체 게시글 조회
	@Override
	public int getListCount(BoardDto free) {
		return freeDao.getListCount(free);
	}

	@Override
	public BoardDto getDetail(BoardDto free) {
		
		try {
			// 조회수 증가
			int result = freeDao.addViews(free);

			// 게시글 정보 조회
			if(result == 1) {
				freeDto = freeDao.getDetail(free);
				return freeDto;
			}
			else {
				return null;
			}
		}
		catch(Exception e) {
			return null;
		}
		
	}
	
}
