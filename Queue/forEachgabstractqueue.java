import java.util.*;
import java.util.AbstractQueue;

public class forEachgabstractqueue{
    public static void main(String args[]){

        AbstractQueue <String> AbstractQ = new PriorityQueue<>();

        //add element
        AbstractQ.add("Deco mini 7");
        AbstractQ.add("wacomm");
        AbstractQ.add("XP pen StarG64");
        AbstractQ.add("Partniocs");
        
        //using forEach method
        AbstractQ.stream().forEach(System.out::println);

        System.out.println("******************************************");
        System.out.println("Use Remove Element Method");

        AbstractQ.remove("Deco mini 7");
        System.out.println("print elments : 1" + AbstractQ ); 


        System.out.println("*********Remove all elements*********");
        AbstractQ.clear();
        System.out.println("AbstractQ all elements: " + AbstractQ);
    }
}