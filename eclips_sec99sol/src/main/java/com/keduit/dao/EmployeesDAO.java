package com.keduit.dao;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.keduit.vo.EmployeesVO;

import util.DBManager;

public class EmployeesDAO {
	
	private EmployeesDAO() {
		
	}
	
	private static EmployeesDAO instance = new EmployeesDAO();
	
	public static EmployeesDAO getInstance() {
		return instance;
	}
	
	// selectAllBoards 메소드는 테이블 employees의 데이터를 모두 꺼내와 DTO에 담고 그것을 다시 ArrayList에 포장하여 리턴
	public List<EmployeesVO> selectAllBoards() {
		String sql = "select * from employees order by id desc";

		List<EmployeesVO> list = new ArrayList<EmployeesVO>();
		Connection conn = null;
		Statement stmt = null;
		
		// ResultSet은 Statement를 통해 값을 저장할 수 있다.
		ResultSet rs = null;
		
		EmployeesVO eVO = null;
		
		try {
			conn = DBManager.getConnection();
			stmt = conn.createStatement();
			
			// 사용하는 메소드는 executeQuery(sql) 메소드를 통해 저장할 수 있다.
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				eVO = new EmployeesVO();
				
				eVO.setId(rs.getString("id"));
				eVO.setPass(rs.getString("pass"));
				eVO.setName(rs.getString("name"));
				eVO.setLev(rs.getString("lev"));
				eVO.setEnter(rs.getDate("enter"));
				eVO.setGender(rs.getInt("gender"));
				eVO.setPhone(rs.getString("phone"));
				
				list.add(eVO);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.clos(conn, stmt, rs);
		}
		return list;
	}
	
}
