import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Prep {
	public static void main(String[] args) {
		
	
	try{  
	Class.forName("com.mysql.jdbc.Driver");  
	Connection con=DriverManager.getConnection(  
	"jdbc:mysql://localhost:3306/test","root","root");  

	Statement stmt=con.createStatement();  
	ResultSet rs=stmt.executeQuery("select * from stud");  
	while(rs.next())  
	System.out.println(rs.getInt(1)+"  "+rs.getString(2));  
	con.close();  
	}
	catch(Exception e){ System.out.println(e);
	{
		
	}  
	}  

}
}
