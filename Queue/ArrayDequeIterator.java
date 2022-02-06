import java.util.*;

class ArrayDequeIterator {
    public static void main(String args[])
    {
        Deque <Integer> deque = new ArrayDeque<>();

        deque.push(1);
        deque.push(2);
        deque.push(3);
        deque.push(4);

        Iterator<Integer> it = deque.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}