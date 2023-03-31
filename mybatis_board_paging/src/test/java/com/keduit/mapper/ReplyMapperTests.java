package com.keduit.mapper;

import java.util.List;
import java.util.stream.IntStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.keduit.domain.Criteria;
import com.keduit.domain.ReplyVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
//controller test를 위해
@WebAppConfiguration
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
@Log4j
public class ReplyMapperTests {
	
	@Setter(onMethod_ = @Autowired)
	private ReplyMapper mapper;
	
	private Long[] bnoArr = {81970L,
			81969L,
			81981L,
			81968L,
			81967L};
	
	@Test
	public void testMapper() {
		log.info(mapper);
	}
	
	@Test
	public void testCreate() {
		IntStream.rangeClosed(1, 10)
				 .forEach(i -> 
				 { ReplyVO vo = new ReplyVO();
				 	vo.setBno(bnoArr[i%5]);
				 	vo.setReply("댓글테스트 " + i);
				 	vo.setReplyer("replyer" + i);
				 	
				 	mapper.insert(vo);
				 
				 });
	}
	
	
	@Test
	public void testRead() {
		Long targetRno = 9L;
		
		ReplyVO vo = mapper.read(targetRno);
		log.info(vo);
	}
	
	@Test
	public void testDelete() {
		int result = mapper.delete(2L);
		log.info("------------------delete => " + result);
	}
	
	@Test
	public void testUpdate() {
		ReplyVO vo = mapper.read(10L);
		vo.setReply("댓글 수정 테스트 글");
		int result = mapper.update(vo);
		log.info("-------------update count =>" + result);
	}
	
	@Test
	public void testList() {
		Criteria cri = new Criteria();
		List<ReplyVO> replies = mapper.getListWithPaging(cri, bnoArr[2]);
		log.info("----------testList ---" + replies);
		log.info("-------**cri.toString-----##" + cri.toString());
	}
	
	@Test
	public void testList2() {
		Criteria cri = new Criteria(2,10);
		List<ReplyVO> replies = mapper.getListWithPaging(cri, 81967L);
		replies.forEach(reply -> log.info(reply));
	}
	
	
}
