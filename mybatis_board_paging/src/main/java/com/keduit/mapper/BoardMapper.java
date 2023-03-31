package com.keduit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.keduit.domain.BoardVO;
import com.keduit.domain.Criteria;

public interface BoardMapper {
	
	// 펑션이나 계산식을 테이블 생성없이 수행해 보기 위한 용도로 사용하는 일종의 'dummy' 테이블이다.
	@Select("select sysdate from dual")
	public String getTime();
	
	
	//@Select("select * from tbl_board order by bno DESC")
	public List<BoardVO> getList();
	
	public List<BoardVO> getListWithPaging(Criteria cri);
	
	public void insert(BoardVO board);
	
	public int insertSelectKey(BoardVO board);
	
	public BoardVO read(Long bno);
	
	public int delete(Long bno);
	
	public int update(BoardVO board);
	
	public int getTotalCount(Criteria cri);
	
	public void updateReplyCnt(@Param("bno") Long bno, 
								@Param("replyCnt") int replyCnt);

}
