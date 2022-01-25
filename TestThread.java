import java.util.*;
 class RunnableDemo implements Runnable {
     private Thread t;
     private String threaddName;

     RunnableDemo (String name) {
         threaddName = name;
         System.out.println("creating" + threaddName);
     }
    public void run() {
        System.out.println("Running" + threaddName );
        try {
            for(int i = 4 ; i > 0 ; i--){
                System.out.println("Thread: "+ threaddName + " , " + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threaddName + "interrupted.");
        }
        System.out.println("Thraed" + threaddName + "exiting.");
    }
    public void start ()
    {
     System.out.println("Starting" + threaddName);
     if(t == null)
     {
         t = new Thread(this,threaddName);
         t.start();
     }
    }
 }

 public class TestThread {
     public static void main(String args[]) {
         RunnableDemo R1 = new RunnableDemo("Thread-1");
         R1.start();

         RunnableDemo R2 = new RunnableDemo("Thread-2");
         R2.start();
     }
 }