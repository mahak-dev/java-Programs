import java.util.*;

 public class forEachpriorityqueue{
     public static void main(String args[]) {

            Queue<Double> queue = new PriorityQueue<>();

            queue.add(11.25);
            queue.add(12.25);
            queue.add(13.45);
            queue.add(14.25);

        System.out.println("using  forEach");

        queue.stream().forEach(System.out::println);
        
         
     }
 }