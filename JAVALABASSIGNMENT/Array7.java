import java.util.*;
  public class Array7 {
  public static void main(String[] args) {
  // Creae a list and add some colors to the list
  List<String> list_Strings = new ArrayList<String>();
  list_Strings.add("Red");
  list_Strings.add("Black");
  list_Strings.add("yellow");
  list_Strings.add("White");
  // Search the value Red
    if (list_Strings.contains("Red")) {
    System.out.println("Found the element");
    } else {
    System.out.println("There is no such element");
    }
 }
}