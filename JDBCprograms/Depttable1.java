import java.sql.*;
import java.io.*;

public class Depttable1
{
public static void main(String arg[])
{
Connection con;
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahak","root","Mahak@123");
Statement st = con.createStatement();
st.executeUpdate ("CREATE TABLE Dept" + "(dept_id INTEGER,department VARCHAR(32))");
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