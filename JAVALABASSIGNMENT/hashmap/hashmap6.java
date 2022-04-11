import java.util.*;  
public class hashmap6{  
   public static void main(String args[]){  
  HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
  hash_map.put(1, "Apple");
  hash_map.put(2, "Banana");
  hash_map.put(3, "Orange");
  hash_map.put(4, "Papaya");
    // print the map
   System.out.println("The Original map: " + hash_map);
   HashMap<Integer,String> new_hash_map= new HashMap<Integer,String>(); 
   new_hash_map = (HashMap)hash_map.clone();     
   System.out.println("Cloned map: " + new_hash_map);        
     }
}
