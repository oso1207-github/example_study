package com.keduit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.keduit.dto.ProductVO;

import util.DBManager;

public class ProductDAO {
	private ProductDAO() {
	}
	
	private static ProductDAO instance = new ProductDAO();
	
	public static ProductDAO getInstance() {
		return instance;
	}
	
	// 상품 목록 
	public List<ProductVO> selectAllProducts(){
		String sql = "select * from product order by code desc";
		List<ProductVO> list = new ArrayList<>();
		Connection  conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				ProductVO pVO = new ProductVO();
				pVO.setCode(rs.getInt("code"));
				pVO.setName(rs.getString("name"));
				pVO.setPrice(rs.getInt("price"));
				pVO.setPictureurl(rs.getString("pictureurl"));
				pVO.setDescription(rs.getString("description"));
				list.add(pVO);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn,  pstmt, rs);
		}
		
		return list;
	}
	
	// 상품 등록
	public void insertProduct(ProductVO pVO) {
		String sql = " insert into product values (null,? ,? ,? ,?)";
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, pVO.getName());
			pstmt.setInt(2, pVO.getPrice());
			pstmt.setString(3, pVO.getPictureurl());
			pstmt.setString(4, pVO.getDescription());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
	}
	
	// code로 상품 하나 읽어오기
	public ProductVO selectProductByCode(String code) {
		ProductVO pVO = null;
		String sql = "select * from product where code = ?";
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			try {
				conn = DBManager.getConnection();
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, code);
				rs = pstmt.executeQuery();
				if (rs.next()) {
					pVO = new ProductVO();
					pVO.setCode(rs.getInt("code"));
					pVO.setName(rs.getString("name"));
					pVO.setPrice(rs.getInt("price"));
					pVO.setPictureurl(rs.getString("pictureurl"));
					pVO.setDescription(rs.getString("description"));
				}
			}catch (Exception e){
				e.printStackTrace();
			} finally {
				DBManager.close(conn, pstmt, rs);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pVO;
		
	}
	
	public void updateProduct(ProductVO pVO) {
		String sql = "update product set name=?, price=?, pictureurl=?, description=? where code=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, pVO.getName());
			pstmt.setInt(2, pVO.getPrice());
			pstmt.setString(3, pVO.getPictureurl());
			pstmt.setString(4, pVO.getDescription());
			pstmt.setInt(5, pVO.getCode());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally { 
			DBManager.close(conn, pstmt);
		}
		
	}
	
	// 상품 삭제
	public void deleteProduct(String code) {
		String sql = "delete from product where code = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, code);
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
	}

}
