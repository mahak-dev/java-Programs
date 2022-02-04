import java.util.*;

public class Hashsetnongeneric{
    public static void main (String args[]){
        
        Set  set = new HashSet();

        set.add(25);
        set.add(36);
        set.add(45);
        set.add(69);

        /*Integer s1 = (Integer)set.add(25);
        Integer s2 = (Integer)set.add(26);
        Integer s3 = (Integer)set.add(27);
        Integer s4 = (Integer)set.add(29);*/

        System.out.println(set);
       /* System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);*/


    }
}