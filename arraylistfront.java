import java.util.ArrayList ;
 public class arraylistfront {
  public static void main (String args[]) {
     
     ArrayList<Integer> numList = new ArrayList<Integer>();
     numList.add(5);
     numList.add(6);
     numList.add(9);
    
    System.out.println("Initilize ArrayList:");
    System.out.println(numList);

    numList.add(0, 3);
    numList.add(0, 1);

    System.out.println("ArrayList after element to the adding:");
    System.out.println(numList);
 }
}