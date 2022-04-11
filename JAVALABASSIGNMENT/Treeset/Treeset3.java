import java.util.TreeSet;
public class Treeset3 {
  public static void main(String[] args) {
  TreeSet<String> tree_set1 = new TreeSet<String>();
  tree_set1.add("Orange");
  tree_set1.add("Mango");
  tree_set1.add("Apple");
  tree_set1.add("Savfal");
  System.out.println("Tree set1: "+tree_set1);
  TreeSet<String> tree_set2 = new TreeSet<String>();
  tree_set2.add("Pink");
  tree_set2.add("Blue");
  tree_set2.add("Orange");
  System.out.println("Tree set2: "+tree_set2);
   // adding treetwo to treeone
   tree_set1.addAll(tree_set2);
   System.out.println("Tree set1: "+tree_set1);
 }
}
