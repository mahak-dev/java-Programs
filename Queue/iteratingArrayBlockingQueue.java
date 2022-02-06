import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class iteratingArrayBlockingQueue{
    public static void main(String args[]){

        int capacity = 7;

        ArrayBlockingQueue <Integer> Blocking_Queue = new ArrayBlockingQueue<>(capacity);
        
        Blocking_Queue.add(5);
        Blocking_Queue.add(5);
        Blocking_Queue.add(7);
        Blocking_Queue.add(8);
        Blocking_Queue.add(9);
        Blocking_Queue.add(10);
       
         Iterator <Integer> itr = Blocking_Queue.iterator();
         while(itr.hasNext()){
             System.out.println(itr.next());
         }

         System.out.println("*************After***************");

         Blocking_Queue.remove(5);
         System.out.println("After Remove first element : " +   Blocking_Queue);

    }


}