import java.util.LinkedList;

public class MainClassLinkedlist {
    public static void main(String[] args) {
        LinkedList<String> officers = new LinkedList<String>();
        officers.add("B");
        officers.add("B");
        officers.add("H");
        officers.add("p");
        officers.add("M");
        for(String s : officers)
         System.out.println(s);
    }
}