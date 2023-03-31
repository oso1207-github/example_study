package com.keduit.controller;

import com.keduit.controller.action.Action;
import com.keduit.controller.action.BoardListAction;
import com.keduit.controller.action.BoardWriteAction;
import com.keduit.controller.action.BoardWriteFormAction;

public class ActionFactory {
	private static ActionFactory instance = new ActionFactory();
	
	private ActionFactory() {
		super();
	}
	
	// 싱글톤 패턴 : 객체의 인스턴스가 오직 1개만 생성되는 패턴을 의미한다. 
	public static ActionFactory getInstance() {
		return instance;
	}
	
	public Action getAction(String command) {
		Action action = null;
		System.out.println("ActioinFactory : " + command);
		
		if(command.equals("board_list")) {
			action = new BoardListAction();	
		} else if (command.equals("board_write_form")) {
			action = new BoardWriteFormAction();
		} else if (command.equals("board_write")) {
			action = new BoardWriteAction();
		}
		return action;
		
	}
}
