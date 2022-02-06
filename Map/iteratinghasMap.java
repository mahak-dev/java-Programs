import java.util.*;

public class iteratinghasMap{

    public static void main(String args[]){

        HashMap <Integer,String> Iterate_hasmap = new HashMap<Integer,String>();

        Iterate_hasmap.put(1, "Sonu");
        Iterate_hasmap.put(2, "kittu");
        Iterate_hasmap.put(3, "Tonu");
        Iterate_hasmap.put(4, "Monu");
        Iterate_hasmap.put(3, "Manan");

        
        System.out.println("Iterating HashMap: ");
    
        
        Iterator <Integer> itr = Iterate_hasmap.keySet().iterator();
        while(itr.hasNext()){
            int key = itr.next();
            System.out.println("Key = " + key + " & value " + Iterate_hasmap.get(key) + "\n");
        }
    }
}