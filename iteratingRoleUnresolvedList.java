import java.util.*;
import javax.management.relation.RoleUnresolvedList;

public class iteratingRoleUnresolvedList{
    public static void main(String args[]){

        RoleUnresolvedList R_List = new RoleUnresolvedList();

        R_List.add("oppo");
        R_List.add("vivo");
        R_List.add("oneplus+");
        R_List.add("samsung");

        Iterator itr = R_List.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}