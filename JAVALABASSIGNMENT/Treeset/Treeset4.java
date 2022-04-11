import java.util.TreeSet;
import java.util.Iterator;
  public class Treeset4 {
  public static void main(String[] args) {
    // create an empty tree set
     TreeSet<String> t_set = new TreeSet<String>();
   // use add() method to add values in the tree set
          t_set.add("Mango");
          t_set.add("Orange");
          t_set.add("Banana");
          t_set.add("Black");
     // print original list
   System.out.println("Original tree set:" + t_set);  
     Iterator it = t_set.descendingIterator();
     // Print list elements in reverse order
     System.out.println("Elements in Reverse Order:");
     while (it.hasNext()) {
        System.out.println(it.next());
     }
  }
}
