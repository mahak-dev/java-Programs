import java.sql.*;
import java.io.*;

public class deptdatainsert
{
public static void main(String ag[]) throws Exception
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahak","root","Mahak@123");

String sql ="INSERT INTO dept VALUES (7,'IIPS')";
Statement st = con.createStatement();
int count = st.executeUpdate(sql); 

System.out.println(count+ " row inserted");
st.close();
con.close();
}


}