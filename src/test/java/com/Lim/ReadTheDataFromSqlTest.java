package com.Lim;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ReadTheDataFromSqlTest {

	public static void main(String[] args) throws Throwable {
		Connection con=null;
		try {
			// 1.Register the database
		Driver driver =new Driver();
		DriverManager.registerDriver(driver);
		//2.get connection for the database
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lim_project","root","root");	
		//3. create statement
		 Statement state=con.createStatement();
		 String query="select * from module;";
		//4.execute query/update
		 ResultSet result=state.executeQuery(query);
		 while(result.next()) {
			System.out.println(result.getString(1)+" "+result.getString(2)); 
		 }
	}
	catch (Exception e) {
		
	}
		finally {
			//5.close the database connection
			con.close();
		}
		
	}

}
