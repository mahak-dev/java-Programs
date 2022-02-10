import java.sql.*;
import java.io.*;

public class empdatainsert
{
public static void main(String ag[]) throws Exception
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahak","root","Mahak@123");

String sql ="INSERT INTO EMP VALUES (02,'MAHAK GUPTA','guptamahak740@gmail.com','Indore',7)";
Statement st = con.createStatement();
int count = st.executeUpdate(sql); 

System.out.println(count+ " row inserted");
st.close();
con.close();
}


}