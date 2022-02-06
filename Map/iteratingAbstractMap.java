import java.util.*;

public class iteratingAbstractMap{
    public static void main(String args[]){

        AbstractMap<Integer, String> AHM = new HashMap<Integer, String>();

        AHM.put(101, "TATA");
        AHM.put(102, "KING FISHer");
        AHM.put(103, "Indigo");
        AHM.put(104, "Jet Airways");

        System.out.println("********FLIGHTS**********");

        Iterator<Integer> itr = AHM.keySet().iterator();
        while(itr.hasNext()){
            int key =itr.next();
            System.out.println("Key = " + key + " & value = "+AHM.get(key) + "\n");
        }
    }
}