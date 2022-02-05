import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class iteratingconcurrentlinkedqueue{

    public static void main(String args[]){

        ConcurrentLinkedQueue <Integer> CLQ = new ConcurrentLinkedQueue<>();

        CLQ.add(25);
        CLQ.add(56);
        CLQ.add(76);
        CLQ.add(98);

        Iterator <Integer> itr = CLQ.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());


        System.out.println("*****************FINISH*****************");
        }
    }
}