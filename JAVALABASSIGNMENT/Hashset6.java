import java.util.*;
  public class Hashset6 {
  public static void main(String[] args) {
         // Create a empty hash set
     HashSet<String> h_set = new HashSet<String>();
   // use add() method to add values in the hash set
          h_set.add("Apple");
          h_set.add("Banana");
          h_set.add("Mango");
          h_set.add("Orange");
          h_set.add("Savfal");
      System.out.println("Original Hash Set: " + h_set);
    
     // Creat a TreeSet of HashSet elements
     Set<String> tree_set = new TreeSet<String>(h_set);
 
     // Display TreeSet elements
     System.out.println("TreeSet elements: ");
     for(String element : tree_set){
        System.out.println(element);
     }
  }
}
