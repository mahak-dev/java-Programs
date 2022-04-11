import java.util.*;

  public class Hashset5 {
  public static void main(String[] args) {
         // Create a empty hash set
     HashSet<String> h_set = new HashSet();
   // use add() method to add values in the hash set
          h_set.add("Apple");
          h_set.add("Banana");
          h_set.add("Mango");
          h_set.add("Orange");
          h_set.add("Savfal");
    System.out.println("Original Hash Set: " + h_set);
    System.out.println("Checking the above array list is empty or not! "+h_set.isEmpty());
    System.out.println("Remove all the elements from a Hash Set: ");
    h_set.removeAll(h_set);
    System.out.println("Hash Set after removing all the elements "+h_set);   
   }
}
