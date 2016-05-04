import java.sql.*;

public class MySQLJavaConn {

	/**
	*  Date:20160504 By UM
	*  
	**/
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/company";
		String user = "root";
		String password = "";
	
		Connection conn = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,user,password);
				if (conn != null && !conn.isClosed()) {
			
				}
				else {
				System.out.println("fail");
				}
		}
		catch (ClassNotFoundException e) {
			System.out.println("can not found driver class");
			e.printStackTrace();
			}
			catch (SQLException e) {
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
			conn.close();
		}
	
}
