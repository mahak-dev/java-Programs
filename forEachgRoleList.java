import java.util.*;
import javax.management.relation.RoleList;

public class forEachgRoleList {
    public static void main(String args[]){

        RoleList R_List = new RoleList();

        R_List.add("kanak");
        R_List.add("nanak");
        R_List.add("sanak");
        R_List.add("manak");

        R_List.remove(1);

        R_List.stream().forEach(System.out::println);
    }
}