package kr.co.green.board.model.service;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.web.multipart.MultipartFile;

import kr.co.green.board.model.dao.FreeDao;
import kr.co.green.board.model.dto.BoardDto;
import kr.co.green.common.pageing.PageInfo;
import kr.co.green.common.transaction.TransactionHandler;
import kr.co.green.common.upload.UploadFile;
import kr.co.green.common.validation.DataValidation;

@Service // service 어노테이션
public class FreeServiceImpl implements FreeService{
	
	// Dao 객체 생성
	private final FreeDao freeDao;
	private final DataValidation dataValidation;
	private final UploadFile uploadFile;
	private static final Logger logger = LogManager.getLogger(FreeServiceImpl.class); // logger객체 생성
	private final TransactionHandler transactionHandler;
	private BoardDto freeDto;
	
	@Autowired
	public FreeServiceImpl(FreeDao freeDao, DataValidation dataValidation, UploadFile uploadFile, TransactionHandler transactionHandler) {
		this.freeDao = freeDao;
		this.dataValidation = dataValidation;
		this.uploadFile = uploadFile;
		this.freeDto = new BoardDto();
		this.transactionHandler = transactionHandler;
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
	public BoardDto getDetail(BoardDto free, String type) {
		HashMap<String, Object> getTransaction = transactionHandler.getStatus();
		TransactionStatus status = (TransactionStatus) getTransaction.get("status");
		PlatformTransactionManager transactionManager = (PlatformTransactionManager) getTransaction.get("transactionManager");
		
		logger.info("게시글 조회 요청: boardNo={}",free.getBoardNo());
		try {
				int result = 0;
			
			if(type.equals("detail")) {
				// 조회수 증가
				result = freeDao.addViews(free);
			}
			else if(type.equals("edit")) {
				result = 1;
			}
			
			// 게시글 정보 조회
			if(result == 1) {
				logger.info("게시글 상세 조회 성공: boardNo={}",free.getBoardNo());
				freeDto = freeDao.getDetail(free);
				
				transactionManager.commit(status);
				return freeDto;
			}
			else {
				logger.error("게시글 조회 실패: 결과 없음, boardNo={}",free.getBoardNo());
				
				transactionManager.rollback(status);
				return null;
			}
		}
		catch(Exception e) {
			logger.error("게시글 상세 조회 중 예외 발생, Exception : ", e);
			return null;
		}
		
	}

	@Override
	public int enroll(BoardDto free, MultipartFile upload, HttpSession session) {
		logger.info("게시글 등록 요청: BoardDto={}, MultipartFile={}", free, upload);
		
		if(dataValidation.lengthCheck(free.getBoardTitle(), 100)) {
			
			uploadFile.upload(free, upload, session);
			int result = freeDao.enroll(free);
			
			if(result == 1 && free.getUploadPath() != null) {
				logger.info("게시글 등록 및 파일 업로드 정보 저장 성공 : boardNo={}", free.getBoardNo());
				return freeDao.setUpload(free);
			}
			else if (result == 1) { 
				logger.info("게시글 등록 성공(업로드 파일 없음) : boardNo={}", free.getBoardNo());
				return result;
			}
		}
		logger.error("게시글 등록 실패: 제목 길이 검증 실패");
		return 0;
	}

	@Override
	public int delete(int boardNo, int memberNo, int loginMemberNo) {
		logger.info("게시글 삭제 요청: boardNo={}, memberNo={}, loginMemberNo={}", boardNo, memberNo, loginMemberNo);
		BoardDto resultDto = freeDao.getFileName(boardNo); // fileName 가져오기
		
//		if(memberNo == (int)session.getAttribute("memberNo")) {
		if(memberNo == loginMemberNo) {
			int deleteResult = freeDao.delete(boardNo); // update성공
			logger.info("게시글 삭제 성공: boardNo={}", boardNo);
			
			if(deleteResult == 1 && freeDao.getFileName(boardNo) != null) {
				// 파일삭제 -> fileName
				int result = uploadFile.delete(resultDto) ? 1 : 0 ; // 삼항연산자
				if(result == 1) {
					logger.info("파일 삭제 성공: boardNo={}, boardUploadName={}", boardNo, resultDto.getUploadName() );
					return result;
				}
				else {
					logger.error("파일 삭제 실패: boardNo={}, boardUploadName={}", boardNo, resultDto.getUploadName() );
					return result;
				}
			}
			else {
				logger.error("게시글 삭제 실패: boardNo={}", boardNo);
				return deleteResult;
			}
		}
		logger.error("게시글 삭제 실패: 사용자 검증 실패");
		return 0;
	}

	
//	@Override
//	public int edit(BoardDto free, MultipartFile upload, int loginMemberNo) {
//		logger.info("게시글 수정 요청: BoardDto={}, loginMemberNo={}", free, loginMemberNo);
//		
//		// 1. 사용자 검증 
//		// 2. 유효성 검사(데이터 길이) -> 제목 : 최대 300byte 
//		int updateResult = 0;
//		
//		if(free.getMemberNo() == loginMemberNo && dataValidation.lengthCheck(free.getBoardTitle(), 300)) {
//			// 3. 제목,내용 update
//			updateResult = freeDao.edit(free);
//			
//			if(updateResult == 1 && !upload.isEmpty()) { // 업로드한 파일이 있을 떄
//				logger.info( "새로운 파일 업로드 성공: boardNo={}, boardUploadName={}",free.getBoardNo());
//				// 4. 업로드한 파일이 있을 때 : 기존 파일 이름 가져오기 -> 기존 파일 삭제 -> 새로운 파일 업로드 (upload 테이블 update)
//				BoardDto getFileName = freeDao.getFileName(free.getBoardNo()); // 위에서 만든 메서드 사용
//				uploadFile.upload(free, upload, null); // session은 사용하고 있지 않으므로 null
//				
//				// 기존 파일 삭제 ㄱ
//				if(uploadFile.delete(getFileName) && free.getUploadName() != null) {
//					logger.info("기존 파일 삭제 성공: boardNo={}, boardUploadName={}", free.getBoardNo(), free.getUploadName());
//					return freeDao.setUploadUpdate(free) == 1 ? 1 : 0;
//				}
//			}
//			// 5. 업로드한 파일이 없을 때 : 할거 없음
//		}
//		logger.error("게시글 등록 실패: 제목 길이 검증 실패");
//		return updateResult;
//	}
	
	@Override
	public int edit(BoardDto free, MultipartFile upload, int loginMemberNo) {
		HashMap<String, Object> getTransaction = transactionHandler.getStatus();
		TransactionStatus status = (TransactionStatus) getTransaction.get("status");
		PlatformTransactionManager transactionManager = (PlatformTransactionManager) getTransaction.get("transactionManager");

		logger.info("게시글 수정 요청: BoardDto={}, loginMemberNo={}", free, loginMemberNo);
		
		// 1. 사용자 검증 
		// 2. 유효성 검사(데이터 길이) -> 제목 : 최대 300byte 
		
		if(free.getMemberNo() == loginMemberNo && dataValidation.lengthCheck(free.getBoardTitle(), 300)) {
			// 3. 제목,내용 update
			int updateResult = freeDao.edit(free);
			
			if(updateResult == 1 && !upload.isEmpty()) { // 업로드한 파일이 있을 떄
				System.out.println("updateResult : " + updateResult);
				// 4. 업로드한 파일이 있을 때 : 기존 파일 이름 가져오기 -> 기존 파일 삭제 -> 새로운 파일 업로드 (upload 테이블 update)
				BoardDto getFileName = freeDao.getFileName(free.getBoardNo()); // 위에서 만든 메서드 사용
				
				uploadFile.upload(free, upload, null); // session은 사용하고 있지 않으므로 null, 실제 파일을 업로드 시키는 메서드
				
				System.out.println("!upload.isEmpty() : " + !upload.isEmpty() + "업로드 이름 : " + free.getUploadName() + " originalName : " + free.getUploadOriginName());
				logger.info( "새로운 파일 업로드 성공: boardNo = {}, boardUploadName = {}",free.getBoardNo(), free.getUploadName());
				
				// 서버에 업로드 실패시 롤백
				if(free.getUploadPath() == null && free.getUploadName() == null && free.getUploadOriginName() == null) {
					System.out.println(free.getUploadName());
					transactionManager.rollback(status);
					return 0;
				}
				
				boolean deleteResult = uploadFile.delete(getFileName); // 기존파일 삭제
				System.out.println(deleteResult);
				if(deleteResult) {
					int result = freeDao.setUploadUpdate(free);
					
					if(result == 1) {
						transactionManager.commit(status);
						logger.info("기존 파일 삭제 성공 & 새로운 파일 업로드 성공 : boardNo={}, boardUploadName={}", free.getBoardNo(), free.getUploadName());
						return 1;
					}
				} else { // 삭제 실패시
					logger.error("새로운 파일 업로드 실패 : boardNo={}, boardUploadName={}", free.getBoardNo(), free.getUploadName());
					transactionManager.rollback(status);
					return 0;
				}
			} else {
				// 5. 업로드한 파일이 없을 때 : 할거 없음
				transactionManager.commit(status);
				return 1;
			}
		}
		logger.error("게시글 등록 실패");
		return 0;
	}
	
	
	
}
