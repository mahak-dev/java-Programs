import java.util.*;
import javax.management.relation.RoleList;

public class IteratingRoleList {
    public static void main(String args[]){

        RoleList R_List = new RoleList();

        R_List.add("kanak");
        R_List.add("nanak");
        R_List.add("sanak");
        R_List.add("manak");

        R_List.remove(1);

        Iterator  itr = R_List.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());

            
        }
    }
}