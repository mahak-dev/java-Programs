import java.util.LinkedList;
  public class linkedlist2 {
  public static void main(String[] args) {
    // create an empty linked list
     LinkedList<String> l_list = new LinkedList<String>();
   // use add() method to add values in the linked list
          l_list.add("Apple");
          l_list.add("Banana");
          l_list.add("Orange");
          l_list.add("Mango");
         // Print the linked list
  for (String element : l_list) {
    System.out.println(element);
    }
 }
}