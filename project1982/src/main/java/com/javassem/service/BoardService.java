package com.javassem.service;

import java.util.HashMap;
import java.util.List;

import com.javassem.domain.BoardVO;
import com.javassem.util.PagingVO;



public interface BoardService {
	// CRUD 기능의 메소드 구현
	// 글 등록
	void insertBoard(BoardVO vo);

	// 글 수정
	void updateBoard(BoardVO vo);

	// 글 삭제
	void deleteBoard(BoardVO vo);

	// 글 상세 조회
	BoardVO getBoard(BoardVO vo);

	// 글 목록 조회
	List<BoardVO> getBoardList(HashMap map);
	
	public int countBoard();

	List<BoardVO> selectBoard(PagingVO vo);	
	
}
