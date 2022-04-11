import java.util.*;  
public class hashmap4 {  
   public static void main(String args[]) {
  HashMap <Integer,String> hash_map = new HashMap <Integer,String> ();
  hash_map.put(1, "Ankit");
  hash_map.put(2, "Mahak");
  hash_map.put(3, "Mahak2");
  // print the map
  System.out.println("The Original linked map: " + hash_map);
  // Removing all the elements from the linked map
  hash_map.clear();
  System.out.println("The New map: " + hash_map);
 }
}
