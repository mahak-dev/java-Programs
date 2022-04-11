import java.util.*;  
public class hashmap1 {  
  public static void main(String args[]) {  
  HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
  hash_map.put(1, "Apple");
  hash_map.put(2, "Banana");
  hash_map.put(3, "Mango");
  hash_map.put(4, "Orange");
  for(Map.Entry x:hash_map.entrySet()){  
   System.out.println(x.getKey()+" "+x.getValue());  
  }  
 }  
}
