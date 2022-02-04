import java.util.*;
class Arraydequeforeach{
    public static void main(String args[]){

        Deque <String> deque = new ArrayDeque<>();

        deque.push("Mahak");
        deque.push("ankit");
        deque.push("sonu");
        deque.push("monu");

        deque.stream().forEach(System.out::println);
    }
}