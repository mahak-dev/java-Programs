import java.util.*;

public class Hassetiterator{
    public static void main (String args[]){
        
        Set <Integer> set = new HashSet<>();

        set.add(25);
        set.add(36);
        set.add(45);
        set.add(69);

        Iterator<Integer> itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}