import java.util.*;

public class LinkedhashSet{
    public static void main(String args[]){

        HashSet <String> hset = new LinkedHashSet<>();

        hset.add("abcd");
        hset.add("efgh");
        hset.add("ijkl");
        hset.add("mnop");

        Iterator <String> itr = hset.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());

        }
    }
}