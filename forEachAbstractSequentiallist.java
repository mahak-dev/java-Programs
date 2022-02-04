import java.util.*;
import java.util.AbstractList;
import java.util.AbstractSequentialList;

public class genericabstractSequentiallist  {

    public static void main(String args[]){

        AbstractSequentialList <String> AS_list = new LinkedList<>();

        AS_list.add("IIT");
        AS_list.add("NIT");
        AS_list.add("IIIT");
        AS_list.add("iips");

        /* String s1 = (String)AS_list.get(0);
        String s2 = (String)AS_list.get(1);
        String s3 = (String)AS_list.get(2);
        String s4 = (String)AS_list.get(3);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4); */



        AS_list.stream().forEach(System.out::println);
   
    }
}