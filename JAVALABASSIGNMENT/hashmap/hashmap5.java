import java.util.*;  
public class hashmap5 {  
   public static void main(String args[]) {
  HashMap <Integer,String> hash_map = new HashMap <Integer,String> ();
  hash_map.put(1, "Apple");
  hash_map.put(2, "Banana");
  hash_map.put(3, "Orange");

  // check if map is empty
  boolean result = hash_map.isEmpty();
  // check the result
  System.out.println("Is hash map empty: " + result);
  // Removing all the elements from the linked map
  hash_map.clear();
  // check if map is empty
  result = hash_map.isEmpty();
  // check the result
  System.out.println("Is hash map empty: " + result);
 }
}
