import java.util.*;
public class removeAbstractMap1{
    public static void main(String args[]){
         
        AbstractMap<Integer, String> RH_Map = new HashMap<Integer, String>();
        RH_Map.put(100,"Mahak");
        RH_Map.put(101,"Muskan");
        RH_Map.put(102,"Pallvi");
        RH_Map.put(103,"Namrta");

            System.out.println("Initial list of element: " + RH_Map);

    RH_Map.remove(100,"Mahak");
    System.out.println("updating list of element: " + RH_Map);
          
    }
}