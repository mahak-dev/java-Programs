import java.util.LinkedList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args){

        LinkedList<String> linkedlist = new LinkedList<String>();

        linkedlist.add("Delhi");
        linkedlist.add("Agra");
        linkedlist.add("Myscore");
        linkedlist.add("Chennai");
        linkedlist.add("pune");

        Iterator it = linkedlist.iterator();

        System.out.println("Linkedlist element:");
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
