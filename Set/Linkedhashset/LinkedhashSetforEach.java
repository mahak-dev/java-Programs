import java.util.*;

public class LinkedhashSetforEach{
    public static void main(String args[]){

        HashSet <String> hset = new LinkedHashSet<>();

        hset.add("abcd");
        hset.add("efgh");
        hset.add("ijkl");
        hset.add("mnop");

        hset.stream().forEach(System.out::println);
    }
}