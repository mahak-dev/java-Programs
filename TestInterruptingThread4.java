import java.util.*;

public class TestInterruptingThread4 extends Thread{

    public void run(){
        for(int i=1;i<=2;i++){
            if(Thread.interrupted()){
                System.out.println("code for interrupted thread");
            }
            else{
                System.out.println("code for normal thread");
            }

        }
    }

    public static void main(String args[]){

        TestInterruptingThread4 t1=new TestInterruptingThread4();
        TestInterruptingThread4 t2=new TestInterruptingThread4();

        t1.start();
        t1.interrupted();

        t2.start();
    }
}