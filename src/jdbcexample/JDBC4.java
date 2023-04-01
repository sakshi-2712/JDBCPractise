package jdbcexample;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBC4 {

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
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter name:");
				String name = br.readLine();
				System.out.println("Enter city:");
				String city = br.readLine();
				pstmt.setString(1,name);
				pstmt.setString(2, city);
				
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

