import java.util.ArrayList;
import java.util.Iterator;
class Main {
    public static void main (String[] args){
        ArrayList<String> languages = new ArrayList<>();

        // add element to the array list
        languages.add("JAVA");
        languages.add("Python");
        languages.add("JavaScript");
        languages.add("Swift");

        //create a variable of iterator
        //store the iterator returned by iterator();

        Iterator<String> iterate = languages.iterator();
        System.out.println("ArrayList:");

        while(iterate.hasNext()){
            System.out.println(iterate.next());
            System.out.println(",");
        }
    }
}