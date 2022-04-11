import java.util.LinkedList;
import java.util.Collections;
  public class linkedlist10 {
  public static void main(String[] args) {
          LinkedList<String> L_list= new LinkedList<String>();
          L_list.add("Banana");
          L_list.add("Mango");
          L_list.add("Apple");
          L_list.add("Orange");
          System.out.println("Original linked list: " + L_list);
          // Replacing 2nd element with new value
          L_list.set(1, "Red");
          System.out.println("The value of second element changed.");
          System.out.println("New linked list: " + L_list);
   }
}
