import java.util.*;
import java.util.LinkedHashMap;

public class forEachLinkedHashMap{
    public static void main(String args[]){

        LinkedHashMap lh_Map = new LinkedHashMap();

        lh_Map.put("one", "ONEPLUS");
        lh_Map.put("two", "ONEPLUS + ");
        lh_Map.put("three", "ONEPLUS nord");
        lh_Map.put("four", "ONEPLUS nord CE 5G");

        Set entrySet = lh_Map.entrySet();

        //entrySet.stream().forEach(System.out::println);
        lh_Map.entrySet().forEach(System.out::println);
    }
}