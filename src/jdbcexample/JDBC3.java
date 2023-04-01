package jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBC3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   try
   {
	   Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Create the connection
		String user="root";
		String password="Sakshi@123";
		String url="jdbc:mysql://localhost:3306/sakshi";
		Connection con= DriverManager.getConnection(url,user,password);
		//create a query
		
		String q = "insert into table1(tName,tCity) values(?,?)";
		
		//get the prepared stattemnet
		PreparedStatement pstmt = con.prepareStatement(q);
		pstmt.setString(1,"sanika");
		pstmt.setString(2, "pune");
		
		pstmt.executeUpdate();
		System.out.println("inserted...");
		con.close();
   }
   catch(Exception e)
   {
	   e.printStackTrace();
   }
	}

}
