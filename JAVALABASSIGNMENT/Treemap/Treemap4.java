import java.util.*;  
public class Treemap4 {  
   public static void main(String args[]){  
  
  // Create a tree map
   TreeMap<String,String> tree_map1=new TreeMap<String,String>();      
  
  // Put elements to the map 
  tree_map1.put("one", "two");
  tree_map1.put("two", "three");
  tree_map1.put("four", "five");
  tree_map1.put("five", "sixth"); 
    
 if(tree_map1.containsValue("three")){
            System.out.println("The TreeMap contains value three");
        } else {
            System.out.println("The TreeMap does not contain value three");
        }
        if(tree_map1.containsValue("five")){
            System.out.println("The TreeMap contains value five");
        } else {
            System.out.println("The TreeMap does not contain value five");
        }
    }
}
