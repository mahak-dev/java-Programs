import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;

public class iteratingConcurrentLinkedDeque{
    public static void main(String args[]){

        ConcurrentLinkedDeque <String> CL_Deque = new ConcurrentLinkedDeque<>();

        CL_Deque.add("mac book");
        CL_Deque.add("mac book 7");
        CL_Deque.add("mac book 7 pro");
        CL_Deque.add("mac book 7 pro max");

        Iterator <String> itr = CL_Deque.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        

    }
}