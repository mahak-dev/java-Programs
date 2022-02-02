import java.util.*;

class iterativestack {
    //Iterate through a stack in java

    public static void main(String args[])
    {
        //if we use a stack, the output will be [1,2,3]
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        Iterator<Integer> itr = stack.iterator();

        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}