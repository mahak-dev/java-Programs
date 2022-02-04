import java.util.*;

public class nongenericLinkedhashset{
    public static void main(String args[]){

        HashSet  hset = new LinkedHashSet();

        hset.add("abcd");
        hset.add("efgh");
        hset.add("ijkl");
        hset.add("mnop");

        System.out.println(hset);
    }
}