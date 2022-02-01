import java.util.Vector;

 class genericVector {
    public static void main(String args[]) {
        Vector<String> Students = new Vector<>();

        Students.add("Mahak");
        Students.add("Ankit");
        Students.add("Muskan");

        Students.add(3, "Namrta");

        System.out.println("Vector: " + Students);

        Vector<String> Classes = new Vector<>();
        Classes.add("Sonu");

        Classes.addAll(Students);
        System.out.println("new vector :" + Classes);
    }
}