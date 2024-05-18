package kr.co.green.contact.model.service;

import java.util.ArrayList;

import kr.co.green.common.PageInfo;
import kr.co.green.contact.model.dto.ContactDto;

public interface ContactService {
	// 등록
	public int enroll(ContactDto contactDto);
	
	// 리스트 조회(리스트 목록)
	public ArrayList<ContactDto> getList(PageInfo pi);

	//전체 게시글 수
	public int getListCount(); 
	
	// 연락내역 상세보기
	public ContactDto getDetail(int no);
	
	// 연락내역 답변
	public int setAnswer(ContactDto contactDto);
	
	// 연락내역 답변 폼 -> 연락내역에 정보데이터 보내기
	public ContactDto getAnswerForm(int no);
	
	// 연락내역 삭제
	public int caDelete(int no);
}
