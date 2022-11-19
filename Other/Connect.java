package ConnectSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Connect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		try{
			   String userName = "root";
			   String password = "";
			   String url = "jdbc:mysql://localhost/test";
			   Class.forName ("com.mysql.cj.jdbc.Driver");
			   conn = DriverManager.getConnection(url, userName, password);
			   System.out.println("Ok");
			
			String sql = "SELECT * FROM table21da";
			   PreparedStatement stm = conn.prepareStatement(sql);
			   ResultSet rs = stm.executeQuery();
			   while(rs.next()) {
				   System.out.println(rs.getInt(1) + "\t" + rs.getString(2));
			   }
			
			sql = "INSERT INTO table21da(ID, Name) VALUES (913, 'SJDFJDSJFSDJ')";
			   stm = conn.prepareStatement(sql);
			   stm.execute();
		} catch(Exception e){
			   System.out.println(e.getMessage());
		}
	}

}
