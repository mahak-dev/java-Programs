import java.util.*;
import java.util.Iterator;
  public class H_set2 {
  public static void main(String[] args) {
         // Create a empty hash set
     HashSet<String> H_set = new HashSet<String>();
   // use add() method to add values in the hash set
            H_set.add("Red");
            H_set.add("Blue");
            H_set.add("Black");
            H_set.add("Green");

  // set Iterator 
    Iterator<String> p = H_set.iterator();
  // Iterate the hash set
   while (p.hasNext()) {
   System.out.println(p.next());
   }
   }
}
