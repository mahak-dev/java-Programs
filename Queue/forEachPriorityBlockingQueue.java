import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;

public class forEachPriorityBlockingQueue{
    public static void main(String args[]){

        PriorityBlockingQueue <String> PB_queue = new PriorityBlockingQueue<>();

        PB_queue.add("ncbvb");
        PB_queue.add("Gsoc");
        PB_queue.add("Nsoc");
        PB_queue.add("Csoc");

       PB_queue.stream().forEach(System.out::println);
        
    }
}