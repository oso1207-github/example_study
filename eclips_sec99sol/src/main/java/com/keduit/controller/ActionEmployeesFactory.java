package com.keduit.controller;

import com.keduit.controller.action.Action;
import com.keduit.controller.action.EmployeesListAction;

public class ActionEmployeesFactory {
	
	// 싱글톤으로 하는 이유는 메모리 측면
	// 최초 한번의 new 연산자를 통해서 고정된 메모리 영역을 사용하기 때문에 추후 해당 객체에 접근할 때 메모리 낭비를 방지할 수 있다.
	private static ActionEmployeesFactory instance = new ActionEmployeesFactory();
	
	public static ActionEmployeesFactory getInstance() {
		return instance;
	}
	
	private ActionEmployeesFactory() {
		super();
	}
	
	public Action getAction(String command) {
		Action action = null;
		System.out.println("ActionEmployeesFactory : "+ command );
		
    	if (command.equals("employees_list")) {
    		action = new EmployeesListAction();
    	} 
		
		return action;
	}
	

	
}
