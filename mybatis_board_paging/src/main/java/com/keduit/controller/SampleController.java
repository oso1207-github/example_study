package com.keduit.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.keduit.domain.SampleVO;
import com.keduit.domain.Ticket;

import lombok.extern.log4j.Log4j;

@RestController
@RequestMapping("/sample")
// Java기반 로깅 라이브러리, 디버그 용으로 주로 사용
@Log4j
public class SampleController {
	
	@GetMapping(value="/getText", produces="text/plain; charset=UTF-8")
	public String getText() {
		
		log.info("Mime type : " + MediaType.TEXT_PLAIN_VALUE);
		return "안녕하세요!";
	}
	
	@GetMapping(value="/getSample", 
			produces= {MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE})
	public SampleVO getSample() {
		return new SampleVO(555, "홍", "길동");
	}
	
	@GetMapping(value="/getSample2")
	public SampleVO getSample2() {
		return new SampleVO(664, "김", "자바");
	}
	
	@GetMapping("/getList")
	public List<SampleVO> getList(){
		return IntStream.range(1,10)
						.mapToObj(i -> new SampleVO(i, i + "First", i + " Last"))
						.collect(Collectors.toList());
	}
	
	@GetMapping("/getMap")
	public Map<String, SampleVO> getMap(){
		Map<String, SampleVO> map = new HashMap<>();
			map.put("First", new SampleVO(567,"이러어어언", "꿈인걸 알지만~~"));
			
			return map;
		
	}
	
	// value만 있을 시 생략이 가능하지만 뒤에 다른게 있다면 꼭 value를 붙여줘야 한다. 
	@GetMapping(value="/check", params= {"height", "weight"})
	public ResponseEntity<SampleVO> check(Double height, Double weight) {
		SampleVO vo = new SampleVO(0, ""+height, ""+weight);
		ResponseEntity<SampleVO> result = null;
		
		if(height>150) {
			result = ResponseEntity.status(HttpStatus.BAD_GATEWAY).body(vo);
		} else {
			result = ResponseEntity.status(HttpStatus.OK).body(vo);
		}
		
		return result;
	}
	
	@GetMapping("/product/{cat}/{pid}")
	// PathVariable은 url 경로에서 가져올 수 있다.
	public String[] getPath(@PathVariable("cat") String cat, @PathVariable("pid") String pid) {
		return new String[] {"category : " + cat, "productpid : " + pid};
	}
	
	@PostMapping("/ticket")
	public Ticket convert(@RequestBody Ticket ticket) {
		log.info("...................convert........ticket --> " + ticket);
		return ticket;
	}
	
	
	
}
