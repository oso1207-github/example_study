package com.keduit.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.keduit.dao.BoardDAO;
import com.keduit.dto.BoardVO;

public class BoardUpdateFormAction implements Action {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/board/boardUpdate.jsp";
		String num = request.getParameter("num");
		BoardDAO bDAO = BoardDAO.getInstance();
		bDAO.updateReadCount(num);
		BoardVO bVO = bDAO.selectOneBoardByNum(num);
		request.setAttribute("board", bVO);
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);

	}

}
