package einfach1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class demo {

	public static void main(String[] args) throws Exception {
		
		System.out.println("hei hou");
		
		// TODO Auto-generated method stub
		// Accessing driver from the JAR file
		Class.forName("com.mysql.jdbc.Driver");
		
		//Creating a variable for the connection called "con"
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
		//jdbc:mysql://localhost:3306/employee_record--> This is the database
		//root is the database user
		// " " is the password
		
		// Here we created our query
		//PreparedStatement statement = con.prepareStatement("select * from users");
		PreparedStatement statement = con.prepareStatement("insert into users (username), values (test)");
		
		//Creating a variable to execute query
		ResultSet result = statement.executeQuery();
		
		while(result.next()){
			
			System.out.println(result.getString(1) + " " + result.getString(2));
			//getString returns the data
			//1 is the first field in the table
			//2 is the second field
			
			
		}
		result.close();
		statement.close();
		con.close();
	}

}
