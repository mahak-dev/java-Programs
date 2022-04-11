import java.util.*;  
public class treemap5 {  
   public static void main(String args[]){  
   // Create a tree map
   TreeMap<String,String> tree_map1=new TreeMap<String,String>();      
   // Put elements to the map 
  tree_map1.put("C1", "Red");
  tree_map1.put("C2", "Blue");
  tree_map1.put("C3", "Green");
  tree_map1.put("C4", "Yellow"); 
    
 Set<String> keys = tree_map1.keySet();
        for(String key: keys){
            System.out.println(key);
        }
    }
}
