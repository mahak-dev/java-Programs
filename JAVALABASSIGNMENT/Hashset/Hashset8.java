import java.util.*;
  public class Hashset8 {
  public static void main(String[] args) {
     // Create a empty hash set
        HashSet<String> h_set1 = new HashSet<String>();
     // use add() method to add values in the hash set
          h_set1.add("Apple");
          h_set1.add("Banana");
          h_set1.add("Mango");
          h_set1.add("Orange");
          System.out.println("Frist HashSet content: "+h_set1);
          HashSet<String>h_set2 = new HashSet<String>();
          h_set2.add("Red");
          h_set2.add("Blue");
          h_set2.add("Green");
          h_set2.add("Yellow");
          System.out.println("Second HashSet content: "+h_set2);
          h_set1.retainAll(h_set2);
          System.out.println("HashSet content:");
          System.out.println(h_set1);
     }
}
