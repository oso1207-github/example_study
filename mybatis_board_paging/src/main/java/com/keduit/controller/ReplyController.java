package com.keduit.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.keduit.domain.Criteria;
import com.keduit.domain.ReplyPageDTO;
import com.keduit.domain.ReplyVO;
import com.keduit.service.ReplyService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@RestController
@RequestMapping("/replies")
@Log4j
@AllArgsConstructor
public class ReplyController {

	private ReplyService service;
	
	// 여러개 할때는 중괄호({})
	@PostMapping(value="/new",
			consumes="application/json",
			produces= { MediaType.TEXT_PLAIN_VALUE})
	public ResponseEntity<String> create(@RequestBody ReplyVO vo) {
		
		log.info("---------replyVO => " + vo);
		int result = service.register(vo);
		log.info("---------reply insert result =>" + result);
		
		return result>0?new ResponseEntity<>("success", HttpStatus.OK)
				: new ResponseEntity<>("Fail", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	
	
//	@GetMapping("/pages/{bno}/{page}")
//	public ResponseEntity<List<ReplyVO>> getList(
//			@PathVariable("page") int page,
//			@PathVariable("bno") Long bno) {
//		
//		log.info("----------getList--------");
//		Criteria cri = new Criteria(page, 10);
//		log.info(cri);
//		
//		return new ResponseEntity<>(service.getList(cri, bno), HttpStatus.OK);
//	}
	
	// 댓글 목록을 조회
	@GetMapping("/pages/{bno}/{page}")
	public ResponseEntity<ReplyPageDTO> getList(
			@PathVariable("page") int page,
			@PathVariable("bno") Long bno) {
		
		log.info("----------getList--------");
		Criteria cri = new Criteria(page, 10);
		log.info("--------getList Criteria -----" + cri);
		
		return new ResponseEntity<>(service.getListPage(cri, bno), HttpStatus.OK);
	}
	
	//댓글내용수정 및 삭제 등 할 수 있는것
	@GetMapping("/{rno}")
	public ResponseEntity<ReplyVO> get(
			@PathVariable("rno") Long rno){
		
		log.info("----------get : " + rno);
		return new ResponseEntity<ReplyVO>(service.get(rno), HttpStatus.OK);		
	}
	
	@DeleteMapping("/{rno}")
	public ResponseEntity<String> remove(
			@PathVariable("rno") Long rno) {
		log.info("-----remove : " + rno);
		return service.remove(rno) == 1 ? new ResponseEntity<String>("success",HttpStatus.OK)
				: new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	// RequestMapping(method = { RequestMethod.PUT },
	//				value="/{rno}", 
	//				consumes="application/JSON", 
	//				produces= {MediaType.TEXT_PLAIN_VALUE})
	// 위와 같은 방식으로도 사용할 수 있다.
	
	@PutMapping(value="/{rno}", 
			consumes="application/JSON", 
			produces= {MediaType.TEXT_PLAIN_VALUE})
	public ResponseEntity<String> modify(
			@RequestBody ReplyVO vo,
			@PathVariable("rno") Long rno) {
		
		vo.setRno(rno);
		log.info("rno : " + rno);
		log.info("modify : " + vo);
		
		return service.modify(vo) == 1 ?
				new ResponseEntity<>("success", HttpStatus.OK)
				: new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
}
