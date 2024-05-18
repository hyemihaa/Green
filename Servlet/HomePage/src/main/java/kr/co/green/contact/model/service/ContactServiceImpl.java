package kr.co.green.contact.model.service;

import java.util.ArrayList;

import kr.co.green.common.PageInfo;
import kr.co.green.contact.model.dao.ContactDao;
import kr.co.green.contact.model.dto.ContactDto;

public class ContactServiceImpl implements ContactService {
	ContactDao contactDao;
	
	public ContactServiceImpl() { // 기본생성자안에 객체 생성 
		contactDao = new ContactDao();
	}
	
	@Override
	public int enroll(ContactDto contactDto) {
		return contactDao.enroll(contactDto);
	}
	
	// 리스트 조회
	@Override
	public ArrayList<ContactDto> getList(PageInfo pi) {
		return contactDao.getList(pi);
	}

	//전체 연락 내역 수
	@Override
	public int getListCount() {
		return contactDao.getListCount();
	}
	// 연락내역 상세보기
	@Override
	public ContactDto getDetail(int no) {
		return contactDao.getDetail(no);
	}
	
	// 연락내역 답변 등록
	@Override
	public int setAnswer(ContactDto contactDto) {
		//contact_answer 테이블에 insert
		int answerResult = contactDao.setAnswer(contactDto);
		 if(answerResult == 1) {
			 //contact 테이블에 contact_answer_status = 'Y'로 update
			 return contactDao.setAnswerUpdate(contactDto.getNo()); 
		 }
 		 return 0;
	}
	
	// 연락내역 답변 폼 -> 폼컨트롤러에 데이터 보내는 메서드
	@Override
	public ContactDto getAnswerForm(int no) {
		ContactDto result = contactDao.getDetail(no);
		return result;
	}
	
	// 연락내역 삭제
	@Override
	public int caDelete(int no) {
		//contact_answer 삭제 -> contact 삭제 (답변 있을때)
		contactDao.caDelete(no);
		//contact 삭제 -> contact 삭제 (답변 업을때)
		return contactDao.cDelete(no);
	}	
		
}	
