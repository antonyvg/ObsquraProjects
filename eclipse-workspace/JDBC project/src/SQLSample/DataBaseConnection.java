package SQLSample;
import java.sql.*;

public class DataBaseConnection {
	public static void main(String[] args) throws InstantiationException,IllegalAccessException, ClassNotFoundException, SQLException
	{
		try
			{
				String url = "jdbc:mysql://localhost:3306/student_db";
				String user = "root";
				String password = "";
		 
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection(url, user, password);
				System.out.println("Connection Successful");
				Statement stm=con.createStatement(); 
		        ResultSet rs = stm.executeQuery("SELECT * FROM student_mark");
		        
		        //Display table ////
		        
		        
		        while(rs.next())
			        {
			            //Display values
			            System.out.print("ID: " + rs.getInt("rollNumber"));
			            System.out.print(" ,  Name: " + rs.getString("name"));
			            System.out.print(" , Mark1: " + rs.getInt("Mark1"));
			            System.out.println(" ,  Mark2 : " + rs.getInt("Mark2"));
			            System.out.println(" ,  Mark3 : " + rs.getInt("Mark3"));
			        }
						
		      //stm.executeUpdate("insert into student_mark values(17,'Samuel',90,90)");
				//System.out.println("Insrted");
				stm.close();
				con.close();
				//System.out.println("Connection closed!");
	}
catch(SQLException e)
	{
		System.out.println(e.getMessage());
	}
}


}
