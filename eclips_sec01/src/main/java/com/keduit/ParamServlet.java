package com.keduit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ParamServlet")
public class ParamServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		String id = request.getParameter("id");
//		int age = Integer.parseInt(request.getParameter("age"));
		String age = request.getParameter("age");
		
		PrintWriter out = response.getWriter();
		out.println("<html><head><body>");
		out.println("당신이 입력한 자료입니다.");
		out.print("아이디 : ");
		out.println(id);
		out.print("나이 : ");
		out.println(age);
		out.println("</body></head></html>");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		
		doGet(request, response);
	}
}
