package ConnectSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.xdevapi.Statement;

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
		} catch(Exception e){
			   System.out.println(e.getMessage());
		}
	}

}
