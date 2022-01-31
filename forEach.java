import java.util.ArrayList;

public class forEach {
    public static void main(String args[]) {
        ArrayList<bike> arraylist =  new ArrayList<bike>();
        arraylist.add(new bike(1, "Apache"));
        arraylist.add(new bike(2, "MT15"));
        arraylist.add(new bike(3, "KTM"));

        arraylist.forEach((bike)-> {
            System.out.println(bike.id + "_" + bike.name);
        });
    }
}
 class bike {
     int id;
     String name;
     public bike(int id, String name){
         this.id = id;
         this.name = name;
 }
}