import java.util.*;

 public class Iteratorpriorityqueue{
     public static void main(String args[]) {

            Queue<Double> queue = new PriorityQueue<>();

            queue.add(11.25);
            queue.add(12.25);
            queue.add(13.45);
            queue.add(14.25);

        System.out.println("using Iterator method");
        Iterator<Double> iterator = queue.iterator();
        while(iterator.hasNext()){
         System.out.println(iterator.next());
        }
         
     }
 }