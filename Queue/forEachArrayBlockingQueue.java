import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class forEachArrayBlockingQueue{
    public static void main(String args[]){

        int capacity = 7;

        ArrayBlockingQueue <Integer> Blocking_Queue = new ArrayBlockingQueue<>(capacity);
        
        Blocking_Queue.add(5);
        Blocking_Queue.add(5);
        Blocking_Queue.add(7);
        Blocking_Queue.add(8);
        Blocking_Queue.add(9);
        Blocking_Queue.add(10);
        Blocking_Queue.add(11);
       
         Blocking_Queue.stream().forEach(System.out::println);

         System.out.println("*************After***************");

         Blocking_Queue.remove(5);
         System.out.println("After Remove first element : " +   Blocking_Queue);

    }


}