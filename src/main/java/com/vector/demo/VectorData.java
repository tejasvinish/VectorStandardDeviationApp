package com.vector.demo;
import java.sql.*;

class VectorData {
	public static void main(String args[]) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "root");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from vector1");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getInt(2)+" "+rs.getInt(3));
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}