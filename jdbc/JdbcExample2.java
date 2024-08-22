//add mysqljar to project 
//rhmc--> on project name --> buildpath-->configure-->classpath -->add external jar
package jdbc;
//wap to insert data to database table emp
import java.sql.*;
public class JdbcExample2 {

	public static void main(String[] args) {
		 try
		 {
			
			 Class.forName("com.mysql.jdbc.Driver");
			 Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/ems","root","123456");
			 Statement s=c.createStatement();

         ResultSet rs=   s.executeQuery("select * from EMP ");

		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"  "+ rs.getString(2) );
		}
		 
		 
		 }
		 
		 catch(Exception e) {
			 System.out.println(e);
		 }
		 

	}

}
