package kr.co.green.board.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter // getter 메서드 생성
@Setter // setter 메서드 생성
@NoArgsConstructor
@AllArgsConstructor
public class BoardDto {
	private int boardNo;
	private String boardTitle;
	private String boardContent;
	private int boardViews;
	private String boardIndate;
	private String boardUpdate;
	private String boardDelete;
	private int memberNo;
	private String memberName;
	
	private String category = "";
	private String searchText = "";

}
