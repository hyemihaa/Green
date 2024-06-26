package kr.co.green.board.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.green.board.model.dao.NewsDao;
import kr.co.green.board.model.dto.NewsDto;
import kr.co.green.common.pageing.PageInfo;

@Service // service 어노테이션
public class NewsServiceImpl implements NewsService {
	
	// Dao 객체 생성
	private final NewsDao newsDao;
	private NewsDto newsDto;
	
	@Autowired
	public NewsServiceImpl(NewsDao newsDao) {
		this.newsDao = newsDao;
		this.newsDto = new NewsDto();
	}

	@Override
	public List<NewsDto> newsList(NewsDto newsDto, PageInfo pi) {
		return newsDao.newsList(newsDto, pi);
	}
	
	// 전체 게시글 조회
	@Override
	public int getListCount(NewsDto newsDto) {
		return newsDao.getListCount(newsDto);
	}

	@Override
	public NewsDto getDetail(NewsDto newsDto) {
		try {
			// 조회수 증가
			int result = newsDao.addViews(newsDto);
			// 게시글 정보 조회
			if(result == 1) {
				newsDto = newsDao.getDetail(newsDto);
				return newsDto;
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

