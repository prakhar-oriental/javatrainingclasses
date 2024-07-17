package com.org.tcs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestDB {
private static final String URL = "jdbc:mysql://localhost:3306/Tcsdb";
private static final String USER = "root";
private static final String PASSWORD = "Root123$";
public static Connection getConnection() throws SQLException{
return DriverManager.getConnection(URL, USER, PASSWORD);
}
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int count = 0;
 // for connection
//try(Connection connection = getConnection()){
//if(connection != null) {
//System.out.println("Connected to the database.");
//Statement st = connection.createStatement();
//ResultSet rs = st.executeQuery("select * from Student");
//while(rs.next()) {
//	System.out.println(rs.getInt(1)+"     "+rs.getString(2)+"   "+rs.getString(3)+"  "+rs.getString(4));
//	
//}
//connection.close();
//}
//} catch(SQLException e) {
//e.printStackTrace();
//}

  //for insertion
	try(Connection connection = getConnection()){
	if(connection != null) {
	System.out.println("Connected to the database.");
	PreparedStatement ps = connection.prepareStatement("insert into Student values(?,?,?,?)");
	System.out.println("Enter no of rows");
	int n = sc.nextInt();
	while(count<n)
	{
		System.out.println("Enter id");
		int id = sc.nextInt();sc.nextLine();
		System.out.println("Enter name");
		String name = sc.nextLine();
		System.out.println("Enter fees");
		String fees  = sc.nextLine();
		System.out.println("Enter subject");
		String subject = sc.nextLine();
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, fees);
		ps.setString(4, subject);
		int i = ps.executeUpdate();
		count++;
		System.out.println(i+"rows affected");
	}
	
	connection.close();
	}
	} catch(SQLException e) {
	e.printStackTrace();
	}
























}
}
