package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.xdevapi.Statement;

public class Connect {
	
	public Connect() {
		
	}

	public  Connection newConnection() {
		// TODO Auto-generated method stub
		Connection conn = null;
		try{
			   String userName = "root";
			   String password = "";
			   String url = "jdbc:mysql://localhost/studentmanagement";
			   Class.forName ("com.mysql.cj.jdbc.Driver");
			   conn = DriverManager.getConnection(url, userName, password);
			   System.out.println("Ok");
//			   
//			   String sql = "SELECT * FROM student";
//			   PreparedStatement stm = conn.prepareStatement(sql);
//			   ResultSet rs = stm.executeQuery();
//			   while(rs.next()) {
//				   System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "    \t" + rs.getInt(3));
//			   }
//			   
		} catch(Exception e){
			   System.out.println(e.getMessage());
		}
		return conn;
	}
	
	public static void main(String[] args) {
		Connect c = new Connect();
		c.newConnection();
	}

}
