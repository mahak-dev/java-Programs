import java.util.*;

 public class addHashMap1{
    public static void main(String[] args){
      
        HashMap <Integer, String> Am = new HashMap<Integer, String>();
        System.out.println("Initial list of elements :" + Am);

        Am.put(100, "Anjali");
        Am.put(101, "Anjali");
        Am.put(102, "Anjali");

        System.out.println("After invoking put() method");

        for(Map.Entry m:Am.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        Am.putIfAbsent(103, "Tinku");
        System.out.println("After invoking putIfAbsent method ");
        for(Map.Entry m:Am.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        Am.put(104,"ravi");
        map.putAll(Am);

        System.out.println("After invoking putall() method");
        for(Map.Entry m:Am.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}