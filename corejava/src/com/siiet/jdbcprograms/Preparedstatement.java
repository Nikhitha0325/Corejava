package com.siiet.jdbcprograms;

import java.sql.*;
import javax.sql.*;

public class Preparedstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//step2:load and register the driver
			
		//step3:Establish connection
			
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sriindu","root","Nikhi@123");
						
		//step4:create statement
			
		Statement st=conn.createStatement();
						
		//step5:execute a SQL insert statement via execute update
		
		String strInsert="Insert into student values(5,'javascript',760,4)";
		
		System.out.println("the SqL statement"+strInsert);
		
		int countinserted=st.executeUpdate(strInsert);
		System.out.println(countinserted+"record inserted");
		
		}
		
		catch(SQLException e) {
			
		e.printStackTrace();	
		}
		}

	}


