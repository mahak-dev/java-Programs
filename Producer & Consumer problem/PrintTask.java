import java.util.*;

class PrintTask implements Runnable{
    private int sleepTime;
    private String threadName;
    private static Random generator = new Random();

    public PrintTask(String name){
        threadName = name;
        sleepTime= generator.nextInt(5000);
    }

public void run() {
    try {
        System.out.printf("%s going to sleep for %d miliseconds.\n",
        threadName, sleepTime);
    } catch (InterruptedException exception) {
        exception.printStackTrace();
    }
    System.out.printf("%s done sleeping\n", threadName);
}
}