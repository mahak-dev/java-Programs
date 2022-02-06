import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class nonGenericLinkedBlockingDeque{
    public static void main(String args[]){

        LinkedBlockingDeque LB_deque = new LinkedBlockingDeque();

        LB_deque.add("ET");
        LB_deque.add("AT");
        LB_deque.add("MT");
        LB_deque.add("CT");

       LB_deque.stream().forEach(System.out::println);
    }
}