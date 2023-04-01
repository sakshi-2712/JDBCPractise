package jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC2 {

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
			String q = "create table table1(tId int(20) primary key  auto_increment,tName varchar(200) not null,tCity varchar(200))";
			Statement stmt = con.createStatement() ;
			stmt.executeUpdate(q);
			System.out.println("Table Created in database");
			con.close();
     }
     catch(Exception e)
     {
    	 e.printStackTrace();
     }
	}

}
