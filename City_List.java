import java.util.*;
 class City_List{
    public static void main(String args[]){
    
    ArrayList<String> City_List=new ArrayList<String>();
   
    City_List.add("Indore");
    City_List.add("mumbai");
    City_List.add("kanpur");
    City_List.add("delhi");

    System.out.println("Starting ArrayList :"+ City_List);
    
    City_List.add(1, "errortb");

   System.out.println("\nArray_List after adding at element :"+City_List);
   
   ArrayList<String> more_Cities = new ArrayList<String>(Arrays.asList("pune","hyd"));
   
   City_List.addAll(4,more_Cities);

   System.out.println("\nArrayList :"+ City_List);
}
}

