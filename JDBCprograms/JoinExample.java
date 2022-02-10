import java.sql.*;
import java.io.*;

public class JoinExample
{
     public static void main(String args[])
     {
          try
          {
               //Load the driver
               Class.forName("com.mysql.cj.jdbc.Driver");
               //Create the connection object
               Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahak","root","Mahak@123");
               //Query String
               String sql = "select empname, city, department from emp e inner join dept d on e.dept_id = d.dept_id";
               Statement stmt = con.createStatement();
               ResultSet result = stmt.executeQuery(sql);
               System.out.println("EmpName  City   Department");
               System.out.println("**===========**==========**");
               while (result.next())
               {
                    System.out.println (
                         result.getString(1)+"   "+
                         result.getString(2)+"     "+
                         result.getString(3));
               }
               System.out.println("**===========**==========**\n");
          }
          catch(Exception ex)
          {
               ex.printStackTrace();
          }
     }
}