import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;

public class nonGenericConcurrentLinkedDeque{
    public static void main(String args[]){

        ConcurrentLinkedDeque CL_Deque = new ConcurrentLinkedDeque();

        CL_Deque.add("mac book");
        CL_Deque.add("mac book 7");
        CL_Deque.add("mac book 7 pro");
        CL_Deque.add( 7 );

       CL_Deque.stream().forEach(System.out::println);
    }
}