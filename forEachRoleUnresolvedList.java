import java.util.*;
import javax.management.relation.RoleUnresolvedList;

public class forEachRoleUnresolvedList{
    public static void main(String args[]){

        RoleUnresolvedList R_List = new RoleUnresolvedList();

        R_List.add("oppo");
        R_List.add("vivo");
        R_List.add("oneplus+");
        R_List.add("samsung");

       
        R_List.stream().forEach(System.out::println);
    }
}