import java.util.*;
class iteratorarray{
    public static void main (String args[]){
        ArrayList<String> Cities= new ArrayList<String>();
        Cities.add("mumbai");
        Cities.add("Delhi");
        Cities.add("Indore");
        Cities.add("Hyderabad");

        System.out.println("List contains using iterator () method:");

        Iterator iter =Cities.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next() + "");
        }

        System.out.println("\n\nList contents using listiterator () method:");
        ListIterator<String> list_iter=Cities.listIterator();
        while(list_iter.hasNext()) {
            System.out.println(list_iter.next() + "");
        }
    }
}