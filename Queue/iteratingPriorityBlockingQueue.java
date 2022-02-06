import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;

public class iteratingPriorityBlockingQueue{
    public static void main(String args[]){

        PriorityBlockingQueue <String> PB_queue = new PriorityBlockingQueue<>();

        PB_queue.add("ncbvb");
        PB_queue.add("Gsoc");
        PB_queue.add("Nsoc");
        PB_queue.add("Csoc");

        Iterator <String> itr = PB_queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
    }
}