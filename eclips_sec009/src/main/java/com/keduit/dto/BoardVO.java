package com.keduit.dto;

import java.sql.Timestamp;

public class BoardVO {
	private int num;
	private String pass;
	private String name;
	private String email;
	private String title;
	private String content;
	private Timestamp writedate;
	private int readcount;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getReadcount() {
		return readcount;
	}
	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}
	public Timestamp getWritedate() {
		return writedate;
	}
	public void setWritedate(Timestamp writedate) {
		this.writedate = writedate;
	}
	@Override
	public String toString() {
		return "BoardVO [num=" + num + ", pass=" + pass + ", name=" + name + ", email=" + email + ", title=" + title
				+ ", content=" + content + ", readcount=" + readcount + ", writedate=" + writedate + "]";
	}
	
	
}
