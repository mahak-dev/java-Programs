import java.util.Iterator;
import java.util.Vector;

 class IteratorMethodVector {
    public static void main(String[] args) {
        Vector<String> Students = new Vector<>();
        Students.add("MAHAK");
        Students.add("Ankit");
        Students.add("Muskan");
        Students.add("anushka");

        //using get
        String element = Students.get(2);
        System.out.println("Element at index 2:" + element);

        //using iterator
        Iterator<String> iterate = Students.iterator();
        System.out.print("vector: ");

        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }

    }
}