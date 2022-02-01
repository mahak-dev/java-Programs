import java.util.Vector;

class removeelementvector {
    public static void main(String[] args){
        Vector<String> Students = new Vector<>();
        Students.add("Mahak");
        Students.add("Ankit");
        Students.add("Muskan");

        System.out.println("Initial Vector: " + Students);

        //using remove()
        String element = Students.remove(1);
        System.out.println("Removed Element :" + element);
        System.out.println("New Vector:" + Students);

        //using clear()
        Students.clear();
        System.out.println("Vector after clear():" + Students);
    }
}