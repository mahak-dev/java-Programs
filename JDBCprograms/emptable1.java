import java.sql.*;
import java.io.*;

public class emptable1
{
public static void main(String arg[])
{
Connection con;
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahak","root","Mahak@123");
Statement st = con.createStatement();
st.executeUpdate ("CREATE TABLE EMP" + "(EMP_id INTEGER,empname VARCHAR(32),email VARCHAR(32),city VARCHAR(32),dept_id INTEGER)");
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