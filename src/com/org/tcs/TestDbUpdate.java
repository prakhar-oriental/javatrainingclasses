package com.org.tcs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TestDbUpdate {
	private static final String URL = "jdbc:mysql://localhost:3306/Tcsdb";
	private static final String USER = "root";
	private static final String PASSWORD = "Root123$";
	public static Connection getConnection() throws SQLException{
	return DriverManager.getConnection(URL, USER, PASSWORD);
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try(Connection connection = getConnection()){
			if(connection != null) {
			System.out.println("Connected to the database.");
			PreparedStatement ps = connection.prepareStatement("update Student set name=?,fees=?,subject=? where ID=?");
			
			
				System.out.println("Enter id");
				int id = sc.nextInt();sc.nextLine();
				System.out.println("Enter name");
				String name = sc.nextLine();
				System.out.println("Enter fees");
				String fees  = sc.nextLine();
				System.out.println("Enter subject");
				String subject = sc.nextLine();
				
				ps.setString(1, name);
				ps.setString(2, fees);
				ps.setString(3, subject);
				ps.setInt(4, id);
				 int i = ps.executeUpdate();
				System.out.println(i+"rows affected");
			}
			
			connection.close();
			
			} catch(SQLException e) {
			e.printStackTrace();
			}
	}

	
}
