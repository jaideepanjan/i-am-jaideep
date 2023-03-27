package com.xworkz.transformer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collections;

public class JDBCRunner {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/java_tables", "root", "jaideep@sql11");
		    String insertQuery ="insert into java_tables.forest_table values(0,'Bandipuraa','Karnatakaa',4544,'WildForestt'); ";
		    Statement statement=connection.createStatement();
		    
		    int row=statement.executeUpdate(insertQuery);
		    System.out.println("Rows inserted : "+row);
		    connection.close();
		} 
		catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		
	}

}
