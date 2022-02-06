import java.util.*;
import java.util.concurrenr.*;

public class iteratingDelayQueue{
    public static void main(String args[])
     throws InterruptedException
    {
        BlockingQueue <Delayeobject> DL_queue = new DelayQueue<DelayObject>();

        DL_queue.add("Ep1");
        DL_queue.add("Ep2");
        DL_queue.add("Ep3");
        DL_queue.add("Ep4");

        Iterator <String> itr = DL_queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}