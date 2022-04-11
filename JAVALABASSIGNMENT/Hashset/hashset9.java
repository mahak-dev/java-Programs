import java.util.*;
  public class hashset9 {
  public static void main(String[] args) {
     // Create a empty hash set
        HashSet<String> h_set = new HashSet<String>();
     // use add() method to add values in the hash set
          h_set.add("Orange");
          h_set.add("Mango");
          h_set.add("Banana");
          h_set.add("Black");

          HashSet<String>h_set2 = new HashSet<String>();
          h_set2.add("Red");
          h_set2.add("Blue");
          h_set2.add("Black");
          h_set2.add("Pink");
          //comparison output in hash set
          HashSet<String>result_set = new HashSet<String>();
         for (String element : h_set){
             System.out.println(h_set2.contains(element) ? "Yes" : "No");
          }      
     }
}
