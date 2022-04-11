import java.util.*;
  public class Array5 {
  public static void main(String[] args) {
  // Creae a list and add some colors to the list
  List<String> list_Strings = new ArrayList<String>();
  list_Strings.add("Blue");
  list_Strings.add("Black");
  list_Strings.add("Green");
  list_Strings.add("White");
  // Print the list
  System.out.println(list_Strings);
  // Update the third element with "Yellow"
  list_Strings.set(2, "Yellow");
   // Print the list again
  System.out.println(list_Strings);
 }
}