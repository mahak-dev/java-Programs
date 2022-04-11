import java.util.*;  
public class treemap1 {  
  public static void main(String args[]){  
   // Create a tree map
   TreeMap<Integer,String> tree_map=new TreeMap<Integer,String>();      
  // Put elements to the map 
  tree_map.put(1, "one");
  tree_map.put(2, "two");
  tree_map.put(3, "three");
  tree_map.put(4, "four");
    
   for (Map.Entry<Integer,String> entry : tree_map.entrySet())
   {
    System.out.println(entry.getKey() + "=>" + entry.getValue());
   }
 }  
}
