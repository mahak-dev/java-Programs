import java.util.*;
  class arraylistremove{
  public static void main(String args[]){
     
     ArrayList<String> City_List= new ArrayList<String>(Arrays.asList("Delhi", "mumbai", "chennai", "bhopal", "dubai", "kolkatta", "europe"));

    System.out.println("Initilize ArrayList:"+ City_List);

    City_List.remove(2);

   System.out.println("\nArratList updated version :"+ City_List);
  
   City_List.remove("kolkatta");

  System.out.println("\nArrayList remove the element of string kolkatta :"+ City_List);

   
  ArrayList<String> newCities= new ArrayList<String>(Arrays.asList("Delhi", "mumbai"));
  
  City_List.removeAll(newCities);

   System.out.println("\nArrayList after the removeall elements:" + City_List);
  }
}
      