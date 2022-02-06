import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class forEachLinkedBlockingQueue{
    public static void main(String args[]){

        LinkedBlockingQueue <String> LB_deque = new LinkedBlockingQueue<>();

        LB_deque.add("ET");
        LB_deque.add("AT");
        LB_deque.add("MT");
        LB_deque.add("CT");

       LB_deque.stream().forEach(System.out::println);
    }
}