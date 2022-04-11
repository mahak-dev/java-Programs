import java.util.PriorityQueue;

  public class Priorityqueue4 {
  public static void main(String[] args) {

   // Create Priority Queue
           PriorityQueue<String> pq1 = new PriorityQueue<String>();  
   // use add() method to add values in the Priority Queue
          pq1.add("one");
          pq1.add("Banana");
          pq1.add("Mango");
          pq1.add("Orange");
    System.out.println("Original Priority Queue: "+pq1);
   
   // Inserts the specified element into this priority queue.
    pq1.offer("Blue");
 
    System.out.println("The New Priority Queue: " + pq1);
  } 
}
