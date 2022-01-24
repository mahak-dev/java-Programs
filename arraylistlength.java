import java.util.ArrayList;
public class arraylistlength
  
  {
    public static void main(String args[]) {
               
      ArrayList<Integer> evenList =new ArrayList<Integer>(5);
      System.out.println("Initial size :" + evenList.size());

      evenList.add(2);
      evenList.add(4);
      evenList.add(6);
      evenList.add(8);
      evenList.add(10);

     System.out.println("Original List:" + evenList);
     System.out.println("ArrayList size after add operation:"+ evenList.size());

     evenList.ensureCapacity(10);

     evenList.add(12);
     evenList.add(14);

     System.out.println("ArrayList Size after ensureCapacity() call and add operation:" + evenList.size());

     evenList.trimToSize();

     System.out.println("ArrayList Size after trimToSize() operation :"+ evenList.size());
     System.out.println("ArrayList final:");
     
     for(int num: evenList){
         System.out.print(num+" ");
    }
  }
}
