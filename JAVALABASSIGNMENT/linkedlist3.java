import java.util.LinkedList;
import java.util.Iterator;
  public class linkedlist3 {
  public static void main(String[] args) {
    // create an empty linked list
     LinkedList<String> l_list = new LinkedList<String>();
   // use add() method to add values in the linked list
          l_list.add("Banana");
          l_list.add("Mango");
          l_list.add("Orange");
          l_list.add("Savfal");
// set Iterator at specified index
   Iterator p = l_list.listIterator(1);

   // print list from second position
   while (p.hasNext()) {
   System.out.println(p.next());
   }
   }
}