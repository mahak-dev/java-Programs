import java.util.*;

public class iteratingAbstractList {
    public static void main(String args[]){

        AbstractList <String> list = new ArrayList<>();
        
        list.add("Dog");
        list.add("cat");
        list.add("cow");
        list.add("horse");
        list.add("butterfly");

        System.out.println("***********************************************");
        System.out.println("Enter all elements in the list 1 :"+ list);

        list.add(3 , "Monkey");
        System.out.println("************************************************");
        System.out.println("After adding the elements position 3:");

        System.out.println("Element in the list 1 :" + list);
        System.out.println("************************************************");

        Iterator <String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}