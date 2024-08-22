//add mysqljar to project 
//rhmc--> on project name --> buildpath-->configure-->classpath -->add external jar
package jdbc;
//wap to insert data to database table emp
import java.sql.*;
public class JdbcExample {

	public static void main(String[] args) {
		 try
		 {
			 Class.forName("com.mysql.jdbc.Driver");
			 Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/ems","root","123456");
			 Statement s=c.createStatement();
			// s.executeUpdate("insert into emp values(2,'Ashutosh Kumar','Bhopal',44500)");
			//s.close();
			 c.close();
		 }
		 
		 catch(Exception e) {
			 System.out.println(e);
		 }
		 

	}

}
