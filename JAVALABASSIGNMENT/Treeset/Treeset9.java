import java.util.TreeSet;
import java.util.Iterator;

  public class Treeset9 {
  public static void main(String[] args) {
 // creating TreeSet 
   TreeSet <Integer>tree_num = new TreeSet<Integer>();
   TreeSet <Integer>treeheadset = new TreeSet<Integer>();
     
   // Add numbers in the tree
   tree_num.add(10);
   tree_num.add(22);
   tree_num.add(36);
   tree_num.add(25);
   tree_num.add(16);
   tree_num.add(70);
   tree_num.add(82);
   tree_num.add(89);
   tree_num.add(14);
   System.out.println("Original tree set: "+tree_num);
   System.out.println("Removes 70 from the list: "+tree_num.remove(70));
   System.out.println("Tree set after removing last element: "+tree_num);
   }    
}
