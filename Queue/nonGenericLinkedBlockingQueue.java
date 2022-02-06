import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class nonGenericLinkedBlockingQueue{
    public static void main(String args[]){

        LinkedBlockingQueue LB_deque = new LinkedBlockingQueue();

        LB_deque.add("ET");
        LB_deque.add("AT");
        LB_deque.add("MT");
        LB_deque.add("CT");

       Iterator itr = LB_deque.iterator();
       while(itr.hasNext()){
           System.out.println(itr.next());
       }
    }
}