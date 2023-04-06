package com.Lim;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ReadTheDataFromNoSqlTest {

	public static void main(String[] args) throws Throwable {
		Connection con=null;
		int result=0;
		try {
			// 1.Register the database
		Driver driver =new Driver();
		DriverManager.registerDriver(driver);
		//2.get connection for the database
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lim_project","root","root");	
		//3. create statement
		 Statement state=con.createStatement();
		 String query="insert into module value('policy','add policy')";
		//4.execute query/update
	      result=state.executeUpdate(query);
	}
	catch (Exception e) {
		
	}
		finally {
			if(result==1) {
				System.out.println("data is updated");
			}
			else {
				System.err.println("data is not updated");
			}
			//5.close the database connection
			con.close();
		}

	}

}
