import java.util.PriorityQueue;
  public class Priorityqueue8 {
  public static void main(String[] args) {

   // Create Priority Queue
      PriorityQueue<String> pq1 = new PriorityQueue<String>();  
      PriorityQueue<String> pq2 = new PriorityQueue<String>();  
        
   // Add numbers in the Queue
   pq1.add("Apple");
   pq1.add("Mango");
   pq1.add("Orange");
   pq1.add("one");
   pq1.add("two");
   pq1.add("three");
   System.out.println("Original Priority Queue: "+pq1);
   System.out.println("The first element of the Queue: "+pq1.peek());
   }    
}
