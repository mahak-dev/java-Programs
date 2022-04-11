import java.util.PriorityQueue;
public class Priorityqueue3 {
public static void main(String[] args) {
  PriorityQueue<String> queue1 = new PriorityQueue<String>();  
  queue1.add("Apple");
  queue1.add("Orange");
  queue1.add("Green");
  System.out.println("Priority Queue1: "+queue1);
  PriorityQueue<String> queue2 = new PriorityQueue<String>();  
  queue2.add("Mango");
  queue2.add("Banana");
  queue2.add("Grapes");
  System.out.println("Priority Queue2: "+queue2);
    // adding queue2 to queue1
   queue1.addAll(queue2);
   System.out.println("New Priority Queue1: "+queue1);
 }
}
