import java.util.*;

public class nonGenericAbstractList {
    public static void main(String args[]){

        AbstractList  list = new ArrayList();
        
        list.add(1);
        list.add("cat");
        list.add("cow");
        list.add(45.24);
        list.add("butterfly");

        System.out.println("***********************************************");
        System.out.println("Enter all elements in the list 1 :"+ list);

        list.add(3 , "Monkey");
        System.out.println("************************************************");
        System.out.println("After adding the elements position 3:");

        System.out.println("Element in the list 1 :" + list);
        System.out.println("************************************************");

        list.stream().forEach(System.out::println);
    }
}