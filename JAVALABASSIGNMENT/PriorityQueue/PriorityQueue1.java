import java.util.PriorityQueue;
public class PriorityQueue1 {
  public static void main(String[] args) {
  PriorityQueue<String> queue=new PriorityQueue<String>();  
  queue.add("Red");
  queue.add("White");
  queue.add("Blue");
  queue.add("Black");
  System.out.println("Elements of the Priority Queue: ");
  System.out.println(queue);
 }
}
