package com.keduit.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Criteria {
	private int pageNum;
	private int amount;
	
	private String type;	// T(제목), C(타이틀), W(작성자), TC, TW, TCW
	private String keyword;
	
	public Criteria() {
		this(1, 10);
	}

	public Criteria(int i, int j) {
		this.pageNum = i;
		this.amount = j;
	}
	
	public String[] getTypeArr() {
		return type==null ? new String[] {}:type.split("");
	}
}
