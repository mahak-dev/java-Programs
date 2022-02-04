import java.util.*;

public class iteratingtreeset{
    public static void main(String args[]){

        Set <Integer> Tset  = new TreeSet<>();

        Tset.add(4);
        Tset.add(5);
        Tset.add(6);
        Tset.add(7);

        Iterator <Integer> itr = Tset.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}