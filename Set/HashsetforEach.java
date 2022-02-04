import java.util.*;

public class HashsetforEach{
    public static void main (String args[]){
        
        Set <Integer> set = new HashSet<>();

        set.add(25);
        set.add(36);
        set.add(45);
        set.add(69);

       set.stream().forEach(System.out::println);


    }
}