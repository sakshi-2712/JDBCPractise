package jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
public class JDBC1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		try
		{
			// LOAD THE DRIVER
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Create the connection
			String user="root";
			String password="Sakshi@123";
			String url="jdbc:mysql://localhost:3306/sakshi";
			Connection con= DriverManager.getConnection(url,user,password);
			if(con.isClosed())
			{
				System.out.println("connection is closed");
			}
			else
			{
				System.out.println("Connection is created");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
