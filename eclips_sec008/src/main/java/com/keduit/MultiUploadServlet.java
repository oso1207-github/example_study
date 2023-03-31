package com.keduit;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

/**
 * Servlet implementation class MultiUploadServlet
 */
@WebServlet("/upload2.do")
public class MultiUploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		String savePath = "upload";
		int uploadFileSizeLimit = 5 * 1024 * 1024;
		String encType = "utf-8";
		
		ServletContext context = getServletContext();
		String uploadFilePath = context.getRealPath(savePath);
		
		try {
			MultipartRequest multi = new MultipartRequest(
					request, uploadFilePath,
					uploadFileSizeLimit, encType,
					new DefaultFileRenamePolicy());
			Enumeration<String> files = multi.getFileNames();
			while(files.hasMoreElements()){
				String file = files.nextElement();
				String file_Name = multi.getFilesystemName(file);
				
				String ori_file_name = multi.getOriginalFileName(file);
				out.println("<br> upload된 파일명 : " + file_Name);
				out.println("<br> 원본 파일명 : " + ori_file_name);
				out.println("<hr>");
			}
	
		} catch (Exception e) {
			System.out.println("예외발생 : " + e);
			e.printStackTrace();
		}
		}

}
