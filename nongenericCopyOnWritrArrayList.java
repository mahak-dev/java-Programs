import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class nongenericCopyOnWritrArrayList{
        public static void main(String args[]){

        CopyOnWriteArrayList c_list = new CopyOnWriteArrayList();

        c_list.add("Mahak");
        c_list.add("sonu");
        c_list.add("monu");
        c_list.add("pinku");

        String s1 = (String)c_list.get(0);
        String s2 = (String)c_list.get(1);
        String s3 = (String)c_list.get(2);
        String s4 = (String)c_list.get(3);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        

    }
}