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

        AS_list.stream().forEach(System.out::println);
   
    }
}