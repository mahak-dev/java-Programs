import java.util.LinkedList;
import java.util.Iterator;
  public class linkedlist7 {
  public static void main(String[] args) {
    // create an empty linked list
     LinkedList<String> l_list = new LinkedList<String>();
   // use add() method to add values in the linked list
          l_list.add("Apple");
          l_list.add("Banana");
          l_list.add("Mango");
          l_list.add("Savfal");
      
      // print original list
   System.out.println("Original linked list:" + l_list);  
  for(int p=0; p < l_list.size(); p++)
   {
      System.out.println("Element at index "+p+": "+l_list.get(p));
    } 
 }
}
