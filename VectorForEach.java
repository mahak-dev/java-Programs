import java.util.*;
public class VectorForEach{
    public static void main(String args[]){

        //create a empty vector
        Vector<String> Colors = new Vector<String>();

        //add element in the vector
        Colors.add("White");
        Colors.add("Green");
        Colors.add("Black");
        Colors.add("Pink");

        //use forEach() method to print vector element

        Colors.forEach(element -> {
            System.out.println(element);
        });
    }
}
    