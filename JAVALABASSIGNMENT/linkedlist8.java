import java.util.*;

public class linkedlist8 {
 public static void main(String[] args) {
  // create an empty linked list
  LinkedList <String> l_list = new LinkedList <String> ();
  // use add() method to add values in the linked list
  l_list.add("Mango");
  l_list.add("Banana");
  l_list.add("Orange");
  l_list.add("Savfal");
  // print the list
  System.out.println("The Original linked list: " + l_list);
  
   //Swapping 1st(index 0) element(Red) with the 3rd(index 2) element (Black)
    Collections.swap(l_list, 0, 2);
    System.out.println("The New linked list after swap: " + l_list);
 }
}
