import java.util.*;
import java.util.concurrent.LinkedTransferQueue;

public class iteratingLinkedTransferQueue{
    public static void main(String args[]){

        LinkedTransferQueue <Integer> LT_Queue = new LinkedTransferQueue<>();

        LT_Queue.add(123);
        LT_Queue.add(456);
        LT_Queue.add(789);
        LT_Queue.add(110);

        Iterator <Integer> itr = LT_Queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}