import java.util.PriorityQueue;
  public class Priorityqueue6 {
  public static void main(String[] args) {
    // create an empty Priority Queue
    PriorityQueue<String> pq = new PriorityQueue<String>();  
   // use add() method to add values in the Priority Queue
          pq.add("Mahak1");
          pq.add("Mahak2");
          pq.add("Mahak3");
          pq.add("Mahak4");
     System.out.println("Priority Queue: " + pq);
    System.out.println("Size of the Priority Queue: " + pq.size());
   }
}
