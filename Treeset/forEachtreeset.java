import java.util.*;

public class forEachtreeset{
    public static void main(String args[]){

        Set <Integer> Tset  = new TreeSet<>();

        Tset.add(4);
        Tset.add(5);
        Tset.add(6);
        Tset.add(7);

        Tset.stream().forEach(System.out::println);
    }
}