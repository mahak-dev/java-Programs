import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class genericCopyOnWritrArrayList{
        public static void main(String args[]){

        CopyOnWriteArrayList<String> c_list = new CopyOnWriteArrayList<>();

        c_list.add("Mahak");
        c_list.add("sonu");
        c_list.add("monu");
        c_list.add("tinku");

        c_list.stream().forEach(System.out::println);
    }
}