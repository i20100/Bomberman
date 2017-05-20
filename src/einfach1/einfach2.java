package einfach1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class einfach2 {

	
		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
			// Accessing driver from the JAR file
			Class.forName("com.mysql.jdbc.Driver");
			
			//Creating a variable for the connection called "con"
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/tsbe15b","root","");
			//jdbc:mysql://localhost:3306/employee_record--> This is the database
			//root is the database user
			// " " is the password
			
			// Here we created our query
			PreparedStatement statement = con.prepareStatement("select * from personen");
			
			//Creating a variable to execute query
			ResultSet rs = statement.executeQuery();
			
			

			while (rs.next()) {
				
				
//				personen a = new personen(rs.getInt(1), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),
//						rs.getString(7), rs.getString(8));
				
				personen p=new personen();
				
				p.setId(rs.getInt(1));
				p.setBoolean(rs.getBoolean(2));
				p.setName(rs.getString(3));
				p.setVorname(rs.getString(4));
				p.setAdress(rs.getString(5));
				System.out.println(p);
			
			
		}
	}

}
