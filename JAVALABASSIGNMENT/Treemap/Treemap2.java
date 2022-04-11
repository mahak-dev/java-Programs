import java.util.*;  
public class Treemap2 {  
   public static void main(String args[]){  
  
  // Create a tree map
   TreeMap<String,String> tree_map1=new TreeMap<String,String>();      
  
  // Put elements to the map 
  tree_map1.put("1", "one");
  tree_map1.put("2", "two");
  tree_map1.put("3", "four");
  tree_map1.put("4", "five");
  tree_map1.put("5", "three");
   System.out.println("Tree Map 1: "+tree_map1);
   TreeMap<String,String> tree_map2 = new TreeMap<String,String>();
   tree_map2.put("A1", "Orange");
   tree_map2.put("A2", "Banana");
   System.out.println("Tree Map 2: "+tree_map2);
   tree_map1.putAll(tree_map2);
   System.out.println("After coping map2 to map1: "+tree_map1);   
 }  
}
