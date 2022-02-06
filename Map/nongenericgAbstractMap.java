import java.util.*;

public class nongenericgAbstractMap{
    public static void main(String args[]){

        AbstractMap  AHM = new HashMap();

        AHM.put(101, "TATA");
        AHM.put(102, "KING FISHer");
        AHM.put(103, "Indigo");
        AHM.put(104, "Jet Airways");

        System.out.println("********FLIGHTS**********");

        for(Map.Entry m:AHM.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}