import java.util.*;
import java.util.AbstractList;
import java.util.AbstractSequentialList;

public class iteratingAbstractSequentiallist  {

    public static void main(String args[]){

        AbstractSequentialList AS_list = new LinkedList();

        AS_list.add("IIT");
        AS_list.add("NIT");
        AS_list.add("IIIT");
        AS_list.add("IET");
/*
        String s1 = (String)AS_list.get(0);
        String s2 = (String)AS_list.get(1);
        String s3 = (String)AS_list.get(2);
        String s4 = (String)AS_list.get(3);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4); 
*/

        Iterator itr = AS_list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

       // AS_list.stream().forEach(System.out::println);

   
    }
}