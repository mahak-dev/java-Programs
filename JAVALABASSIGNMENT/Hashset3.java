import java.util.*;
import java.util.Iterator;
  public class  Hashset3 {
  public static void main(String[] args) {
         // Create a empty hash set
     HashSet<String> h_set = new HashSet<String>();
   // use add() method to add values in the hash set
          h_set.add("Black");
          h_set.add("Blue");
          h_set.add("Green");
          h_set.add("Orange");
          h_set.add("White");
    System.out.println("Original Hash Set: " + h_set);
    System.out.println("Size of the Hash Set: " + h_set.size());
   }
}
