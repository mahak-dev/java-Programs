import java.util.LinkedList;
import java.util.Iterator;
  public class linkedlist5 {
  public static void main(String[] args) {
    // create an empty linked list
     LinkedList<String> l_list = new LinkedList<String>();
   // use add() method to add values in the linked list
          l_list.add("Apple");
          l_list.add("Mango");
          l_list.add("Orange");
          l_list.add("Sitafal");
      
      // print original list
   System.out.println("Original linked list:" + l_list);  
 
   // Find first element of the List
    Object first_element = l_list.getFirst();
    System.out.println("First Element is: "+first_element);
 
    // Find last element of the List
    Object last_element = l_list.getLast();
    System.out.println("Last Element is: "+last_element);
 }
}
