//package einfach1;
//
//import java.sql.Connection;
//
//import java.sql.Date;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//
//public class Einfach1 {
//
//public static void main(String[] args) throws SQLException, Exception {
//	
//Class.forName("com.mysql.jdbc.Driver");
//	
//String url="jdbc:mysql://localhost/userlogin";
//String user="root";
//String password="";
//Connection con = DriverManager.getConnection(url, user, password);
//Statement stmt = con.createStatement();
//
//ResultSet rs = stmt.executeQuery("select * from user order by username");
//
//while (rs.next()) {
//
//int id = rs.getInt(1);
//String Name = rs.getString(2);
//String Vorname = rs.getString(3);
//String adresse = rs.getString(4);
//String ort_id = rs.getString(5);
//String Telefon = rs.getString(6);
//String email = rs.getString(7);
//Date Geburi = rs.getDate(8);
//System.out.println(id);
//System.out.println(Name);
//System.out.println(Vorname);
//System.out.println(email);
//System.out.println(adresse);
//System.out.println(ort_id);
//System.out.println(Telefon);
//System.out.println(Geburi);
//}
//rs.close();
//stmt.close();
//con.close();
//}
//
//}

package einfach1;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Einfach1 {

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
		//PreparedStatement statement = con.prepareStatement("insert into");
		
		//Creating a variable to execute query
		ResultSet rs = statement.executeQuery();
		
		while(rs.next()){
			
			
			
			int id = rs.getInt(1);
			String Name = rs.getString(3);
			String Vorname = rs.getString(4);
			String adresse = rs.getString(5);
			String ort_id = rs.getString(6);
			String Telefon = rs.getString(7);
			String email = rs.getString(8);
			
			
			for(int i= 1; i<=1; i++){
				for(int j= 1; j<=1; j++){
					System.out.print(+ id  +"\t" + Name +"\t"+"\t"+"\t"+ Vorname +"\t" +"\t"+ adresse  +"\t" + ort_id +"\t" + Telefon + "\t" + email );
				}
				System.out.println();
			}
			
			
			
		}

	}

}
