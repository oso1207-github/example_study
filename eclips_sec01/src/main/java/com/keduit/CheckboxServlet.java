package com.keduit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CheckboxServlet")
public class CheckboxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		String items[] = request.getParameterValues("item");
		out.print("<html><body>");
		
		if(items == null) {
			out.print("선택한 항목이 없습니다.");
		}
		else {
			out.println("당신이 선택한 항목입니다.<hr>");
			for(String item : items) {
				out.print(item + " ");
			}
		}
		out.println("<hr>");
		
		String job = request.getParameter("job");
		out.println("당신이 선택한 직업 : ");
		out.print(job);
		String[] interests = request.getParameterValues("interest");
		
		if(interests == null) {
			out.print("선택한 항목이 없습니다.");
		}
		else {
			out.println("당신이 선택한 항목입니다.<hr>");
			for(String interest : interests) {
				out.print(interest + " ");
			}
		}
		
		out.println("<br><a href='javascript:history.go(-1)'>다시</a></br>");
		out.print("</body></html>");
		out.close();
	}
}
