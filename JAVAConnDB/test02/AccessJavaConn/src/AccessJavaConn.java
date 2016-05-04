import java.sql.*;

public class AccessJavaConn {
    /**
     *  Date:20160504 By UM
     *
     **/
	public static void main(String[] args) throws SQLException  {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:ucanaccess:///Users/um/Desktop/pccudb/DB20160503/COMPANY.accdb");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		String stmtl = "select lname,salary from employee where Dno = ?" ;
		PreparedStatement p = conn.prepareStatement(stmtl);
		p.clearParameters();
		
		p.setString(1,"7");
		ResultSet r = p.executeQuery();
		
		while (r.next()){
			String lname = r.getString(1);
			Double salary = r.getDouble(2);
			System.out.println(lname + salary);
		}
		
	}

}
