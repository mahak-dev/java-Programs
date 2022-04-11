import java.util.*;
  public class Priorityqueue10 {
  public static void main(String[] args) {
  PriorityQueue<Integer> pq1 = new PriorityQueue<>(10, Collections.reverseOrder());
      
   // Add numbers in the Queue
   pq1.add(25);
   pq1.add(89);
   pq1.add(62);
   pq1.add(64);
   pq1.add(23);
   pq1.add(25);
   pq1.add(26);
   System.out.println("\nOriginal Priority Queue: "+pq1);

System.out.print("\nMaximum Priority Queue: ");
Integer val = null;
while( (val = pq1.poll()) != null) {
    System.out.print(val+"  ");
      }
	  System.out.print("\n");
  }
}
