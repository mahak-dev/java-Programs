import java.sql.*;
import java.io.*;

public class JDBCAllFIRST
{
public static void main(String ag[])
{
Connection con;
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahak","root","Mahak@123");
Statement st = con.createStatement();
st.executeUpdate ("CREATE TABLE EMP" + "(FName VARCHAR(32),LName VARCHAR(32),Address VARCHAR(32),SALARY FLOAT)");
}

catch(ClassNotFoundException e)

{
System.out.println(e.toString());

}

catch(SQLException e)
{
System.out.println(e.toString());
}
}

}