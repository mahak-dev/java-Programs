import java.util.PriorityQueue;
  public class Priorityqueue7 {
  public static void main(String[] args) {
  // Create a empty Priority Queue
        PriorityQueue<String> pq1 = new PriorityQueue<String>();  
     // use add() method to add values in the Priority Queue
          pq1.add("Mango");
          pq1.add("Banana");
          pq1.add("Orange");
          pq1.add("Apple");
          System.out.println("First Priority Queue: "+pq1);
          PriorityQueue<String> pq2 = new PriorityQueue<String>();  
          pq2.add("Grapes");
          pq2.add("One");
          pq2.add("Two");
          pq2.add("Three");
          System.out.println("Second Priority Queue: "+pq2);
          //comparison output in Priority Queue
         for (String element : pq1){
             System.out.println(pq2.contains(element) ? "Yes" : "No");
          }      
     }
}
