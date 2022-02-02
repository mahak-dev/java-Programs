import java.util.*;

class foreachstack
{
    public static void main (String args[]){
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.stream().forEach(System.out::println);
    }
}