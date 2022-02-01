import java.util.*;

public class nongenericvector{

public static void main(String [] a){
    Vector my_List = new Vector();

    my_List.add("mahak");
    my_List.add("joe");
    my_List.add("ankit");
    
String s1 = (String) my_List.get(0);
String s2 = (String) my_List.get(1);
String s3 = (String) my_List.get(2);
System.out.println(s1);
System.out.println(s2);
System.out.println(s3);
   }
}