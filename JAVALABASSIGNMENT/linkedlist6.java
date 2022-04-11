import java.util.*;

public class linkedlist6 {
 public static void main(String[] args) {
  // create an empty linked list
  LinkedList <String> l_list = new LinkedList <String> ();
  // use add() method to add values in the linked list
  l_list.add("Appke");
  l_list.add("Banana");
  l_list.add("Mango");
  l_list.add("orange");

  // print the list
  System.out.println("The Original linked list: " + l_list);

  // Remove the element in third position from the said linked list
  l_list.remove(1);
  System.out.println("The New linked list: " + l_list);
 }
}
