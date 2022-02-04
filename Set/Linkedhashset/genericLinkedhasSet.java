import java.util.*;

public class genericLinkedhasSet{
    public static void main(String args[]){

        HashSet <String> hset = new LinkedHashSet<>();

        hset.add("abcd");
        hset.add("efgh");
        hset.add("ijkl");
        hset.add("mnop");

       
        System.out.println(hset);
    }
}