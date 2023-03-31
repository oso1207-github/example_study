package com.keduit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SignUpServlet")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
//    public SignUpServlet() {
//        super();
//    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		int renumber1 = Integer.parseInt(request.getParameter("renumber1"));
		int renumber2 = Integer.parseInt(request.getParameter("renumber2"));
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String zipcode = request.getParameter("zipcode");
		String address1 = request.getParameter("address1");
		String address2 = request.getParameter("address2");
		String phonenumber = request.getParameter("phonenumber");
		String job = request.getParameter("job");
		
		out.println("<html><head><body>");
		out.print("이름 : ");
		out.println(name);
		out.print("<br>주민번호 : ");
		out.print(renumber1);
		out.print(" - ");
		out.println(renumber2);
		out.print("<br>아이디 : ");
		out.println(id);
		out.print("<br>패스워드 : ");
		out.println(password);
		out.print("<br>이 메 일 : ");
		out.println(email);
		out.print("<br>우편번호 : ");
		out.println(zipcode);
		out.print("<br>주소 : ");
		out.println(address1 + " " + address2);
		out.print("<br>핸드폰번호 : ");
		out.println(phonenumber);
		out.print("<br>직업 : ");
		out.print(job);
		out.println("</body></head></html>");
		out.println("<br><a href='javascript:history.go(-1)'>다시</a></br>");
		out.close();
	}

//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		request.setCharacterEncoding("UTF-8");
//		response.setContentType("text/html; charset=UTF-8");
//		String name = request.getParameter("name");
//		int renumber = Integer.parseInt(request.getParameter("renumber"));
//		String id = request.getParameter("id");
////		int age = Integer.parseInt(request.getParameter("age"));
//		String age = request.getParameter("age");
//		
//		PrintWriter out = response.getWriter();
//		out.println("<html><head><body>");
//		out.println("당신이 입력한 자료입니다.");
//		out.print("아이디 : ");
//		out.println(id);
//		out.print("나이 : ");
//		out.println(age);
//		out.println("</body></head></html>");
//	}
}
