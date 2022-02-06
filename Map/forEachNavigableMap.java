import java.util.*;
import java.util.NavigableMap;

 public class forEachNavigableMap{
     public static void main (String args[]){

        NavigableMap  navMap = new TreeMap();

        navMap.put("map1", "INDIA");
        navMap.put("map2", "AMERICA");
        navMap.put("map3", "AUS");
        navMap.put("map4", "AFGANISTAN");

        Set sMap = navMap.entrySet();
        
        navMap.entrySet().forEach(System.out::println);
     }
 }