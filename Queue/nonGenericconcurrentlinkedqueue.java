import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class nonGenericconcurrentlinkedqueue{

    public static void main(String args[]){

        ConcurrentLinkedQueue CLQ = new ConcurrentLinkedQueue();

        CLQ.add(25);
        CLQ.add(56);
        CLQ.add(76);
        CLQ.add(98);

        CLQ.stream().forEach(System.out::println);
        System.out.println("*****************FINISH*****************");
    }
}