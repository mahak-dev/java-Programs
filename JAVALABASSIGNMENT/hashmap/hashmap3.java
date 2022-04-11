import java.util.*;  
public class hashmap3 {  
   public static void main(String args[]) {
  // create two hash maps
  HashMap <Integer,String> hash_map1 = new HashMap <Integer,String> ();
  HashMap <Integer,String> hash_map2 = new HashMap <Integer,String> ();
  // populate hash maps
  hash_map1.put(1, "onw");
  hash_map1.put(2, "two");
  hash_map1.put(3, "three");
  System.out.println("\nValues in first map: " + hash_map1);
  hash_map2.put(4, "four");
  System.out.println("\nValues in second map: " + hash_map2);

  // put all values in secondmap
  hash_map2.putAll(hash_map1);
  System.out.println("\nNow values in second map: " + hash_map2);
 }
}
