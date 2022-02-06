import java.util.*;
import java.util.SortedMap;

 public class forEachSortedMap{
     public static void main (String args[]){

        SortedMap <String, String> sortedMap = new TreeMap<>();

        sortedMap.put("map1", "INDIA");
        sortedMap.put("map2", "AMERICA");
        sortedMap.put("map3", "AUS");
        sortedMap.put("map4", "AFGANISTAN");

        Set sMap = sortedMap.entrySet();
        
        sortedMap.entrySet().forEach(System.out::println);
     }
 }