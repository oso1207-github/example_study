package com.keduit.controller.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.keduit.dao.EmployeesDAO;
import com.keduit.vo.EmployeesVO;

public class EmployeesListAction implements Action {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String url = "/employees/employeesList.jsp";
		
		EmployeesDAO eDAO = EmployeesDAO.getInstance();
		
		List<EmployeesVO> employeesList = eDAO.selectAllBoards();
		
		// 웹 브라우저에서 요청한 request 객체에 employeesList의 값으로 employeesList를 바인딩한다.
		request.setAttribute("employeesList", employeesList);
		
		// 일반적인 포워딩 기능 (포워드할 서블릿이나 jsp)
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
		
	}

}
