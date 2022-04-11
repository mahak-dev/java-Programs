import java.util.*;  
public class hashmap8 {  
    public static void main(String args[]) {
  HashMap < Integer, String > hash_map = new HashMap < Integer, String > ();
  hash_map.put(1, "Blue");
  hash_map.put(3, "Black");
  hash_map.put(5, "Orange");
  hash_map.put(4, "White");
  
  // create set view for the map
  Set set = hash_map.entrySet();
  // check set values
  System.out.println("Set values: " + set);
 }
}
