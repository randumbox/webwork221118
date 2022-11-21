package test.users1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import test.users1.dto.Users1Dto;
import test.util.DbcpBean;

public class Users1Dao {

	private static Users1Dao dao;
	private Users1Dao() {}
	public static Users1Dao getInstance() {
		if(dao==null) {
			dao=new Users1Dao();
		}
		return dao;
	}
	
	//인자로 전달된 아이디에 해당하는 가입정보를 리턴해주는 메소드
	public Users1Dto getData(String id) {
		
		Users1Dto dto=null;
		Connection conn = null;
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		try {
			conn=new DbcpBean().getConn();
			String sql=" SELECT pwd, email, profile, TO_CHAR(regdate, 'YYYY.MM.DD')AS regdate"
					+ " FROM users"
					+ " WHERE id=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,id);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				dto=new Users1Dto();
				dto.setId(id);
	            dto.setPwd(rs.getString("pwd"));
	            dto.setEmail(rs.getString("email"));
	            dto.setProfile(rs.getString("profile"));
	            dto.setRegdate(rs.getString("regdate"));
	         }
	      } catch (Exception e) {
	         e.printStackTrace();
	      } finally {
	         try {
	            if (rs != null)
	               rs.close();
	            if (pstmt != null)
	               pstmt.close();
	            if (conn != null)
	               conn.close(); //Connection Pool 에 Connection 반납하기
	         } catch (Exception e) {
	         }
	      }
	      return dto;
	}
}
