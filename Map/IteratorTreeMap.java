import java.util.*;
import java.util.TreeMap;

     public class IteratorTreeMap{
         public static void main(String args[]){

            TreeMap<String, String> treemap = new TreeMap<String, String>();
           
            treemap.put("key1", "Movie1");
            treemap.put("key2", "Movie2");
            treemap.put("key3", "Movie3");
            treemap.put("key4", "Movie4");

            //Get a set of an entries

            Set set = treemap.entrySet();

            Iterator itr = set.iterator();
            while(itr.hasNext()){
                Map.Entry me = (Map.Entry) itr.next();
                System.out.println("key is: "+me.getKey() + " & ");
                System.out.println("Value is: "+me.getValue());
            }

            
         }
     }