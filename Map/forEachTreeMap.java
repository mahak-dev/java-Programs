import java.util.*;
import java.util.TreeMap;

     public class forEachTreeMap{
         public static void main(String args[]){

            TreeMap<String, String> treemap = new TreeMap<String, String>();
           
            treemap.put("key1", "Movie1");
            treemap.put("key2", "Movie2");
            treemap.put("key3", "Movie3");
            treemap.put("key4", "Movie4");

            //Get a set of an entries

            Set set = treemap.entrySet();

            treemap.entrySet().forEach(System.out::println);

            
         }
     }