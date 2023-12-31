package work0821;

import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JList;

import kr.co.sist.dao.DbConn;

public class EmpDAO {
	private static EmpDAO eDAO;
	
	public EmpDAO() {
		//이것은 생성자
		System.out.println("이것은 생성자");
	}
	
	public static EmpDAO getInsert() {
		if(eDAO==null) {
			eDAO=new EmpDAO();
		}
		return eDAO;
	}
	
	public List<EmpVO> selectEmpno() throws SQLException {
		EmpVO eVO=null;
		List<EmpVO> list=new ArrayList<EmpVO>();

		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		DbConn db=DbConn.getInstance();
		try {
			con=db.getConnection("localhost", "scott", "tiger");
			
			
			String select="select empno from emp";
			pstmt=con.prepareStatement(select);
			rs=pstmt.executeQuery(select);
			
			while(rs.next()) {
				eVO=new EmpVO(rs.getInt(1));
				
				list.add(eVO);
			}//while
			
		}finally {
			db.dbclose(null, pstmt, con);
		}//finally
		
		
		return list;
				
	}//selectEmpno
	
	public EmpVO selectOneEmpno(int empno) throws SQLException {
		EmpVO eVO=null;
		
		
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		DbConn db=DbConn.getInstance();
		
		try {
			con=db.getConnection("localhost", "scott", "tiger");
			
			String sql="select empno,ename,to_char(hiredate,'yyyy-mm-dd') hiredate,job,sal from emp where empno=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, empno);
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				eVO=new EmpVO(rs.getInt("empno"),rs.getString("ename"),rs.getString("hiredate"),rs.getString("job"),rs.getInt("sal"));
//				System.out.println(rs.getInt("empno"));
				System.out.println(eVO.getEmpno());
			}//if
			
			
		}finally{
			db.dbclose(rs, pstmt, con);
		}//finally
		return eVO;
	}//selectOneEmpno
	
	
}//class
