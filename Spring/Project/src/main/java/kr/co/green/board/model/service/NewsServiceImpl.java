package kr.co.green.board.model.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kr.co.green.board.model.dao.NewsDao;
import kr.co.green.board.model.dto.BoardDto;
import kr.co.green.board.model.dto.NewsDto;
import kr.co.green.common.pageing.PageInfo;
import kr.co.green.common.upload.UploadFile;
import kr.co.green.common.validation.DataValidation;

@Service // service 어노테이션
public class NewsServiceImpl implements NewsService {
	
	// Dao 객체 생성
	private final NewsDao newsDao;
	private final DataValidation dataValidation;
	private final UploadFile uploadFile;
	private NewsDto newsDto;
	
	@Autowired
	public NewsServiceImpl(NewsDao newsDao, DataValidation dataValidation, UploadFile uploadFile) {
		this.newsDao = newsDao;
		this.dataValidation = dataValidation;
		this.uploadFile = uploadFile;
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
	public NewsDto getDetail(NewsDto newsDto, String type) {
		try {
			int result = 0;
			
		if(type.equals("detail")) {
			// 조회수 증가
			result = newsDao.addViews(newsDto);
		}
		else if(type.equals("edit")) {
			result = 1;
		}
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
	
	@Override
	public int enroll(NewsDto newsDto, MultipartFile upload, HttpSession session) {
		//파일업로드
		uploadFile.upload(newsDto, upload, session);
		
		// DB에 제목,내용 저장
		int enrollResult = newsDao.enroll(newsDto);
		int uploadResult = newsDao.setUpload(newsDto);
		
		if(enrollResult == 1 && newsDto.getUploadPath() != null) {
			return uploadResult;
		}
		else if (enrollResult == 1) {
			return enrollResult;
		}
			
	return 0;
	}
	
	@Override
	public int edit(NewsDto newsDto, MultipartFile upload, int loginMemberNo) {
		// 2. DB에 제목,내용 저장
		// 3. 원래 서버에 존재했던 파일 삭제(boardNo)
		// 4. 새로 올라온 파일 업로드
		// 5. DB에 파일 업데이트
		int updateResult = 0;
	
		// 1. 사용자 검증
		// - 제목길이 300자 제한
		// - 제목, 내용 널 체크
		if(newsDto.getMemberNo() == loginMemberNo &&
		   dataValidation.lengthCheck(newsDto.getBoardTitle(), 300) &&
		   !newsDto.getBoardTitle().equals("") && 
		   !newsDto.getBoardContent().equals("")) {
			updateResult = newsDao.edit(newsDto);
			
			if(updateResult == 1 && !upload.isEmpty()) { // 업로드한 파일이 있을 떄
				// 4. 업로드한 파일이 있을 때 : 기존 파일 이름 가져오기 -> 기존 파일 삭제 -> 새로운 파일 업로드 (upload 테이블 update)
				NewsDto getFileName = newsDao.getFileName(newsDto.getBoardNo()); // 위에서 만든 메서드 사용
				uploadFile.upload(newsDto, upload, null); // session은 사용하고 있지 않으므로 null
				
				// 기존 파일 삭제 ㄱ
				if(uploadFile.delete(getFileName) && newsDto.getUploadName() != null) {
					return newsDao.setUploadUpdate(newsDto) == 1 ? 1 : 0;
				}
			}
			// 5. 업로드한 파일이 없을 때 : 할거 없음
		}
		return updateResult;
		}
	
	@Override
	public int delete(int boardNo, int memberNo, int loginMemberNo) {
		// 1. 요청한 사용자와 로그인한 사용자가 같을 때
		if(memberNo == loginMemberNo) {
			// 2. news_board의 데이터 삭제(nb_delete update)
			int newsDelete = newsDao.newsDelete(boardNo); // update성공
			
			if(newsDelete == 1 && newsDao.getFileName(boardNo) != null) {
				NewsDto resultDto = newsDao.getFileName(boardNo); // fileName 가져오기
				// 파일삭제 -> fileName
				return uploadFile.delete(resultDto) ? 1 : 0 ; 
			}
			return newsDelete;
		}
		return 0;
	}

}

