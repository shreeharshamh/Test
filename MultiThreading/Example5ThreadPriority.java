import java.net.SocketTimeoutException;

class MyThread extends Thread{
    public void run() {
        for(int i=0; i<10; i++)
            System.out.println("Child Thread. " + Thread.currentThread().getPriority());
    }
}

public class Example5ThreadPriority {
    public static void main(String[] args) {
        System.out.println("Main Thread Priority \t: " + Thread.currentThread().getPriority());
                // OP: 5 Default Priority
        MyThread myThread = new MyThread();
        
        System.out.println("Child Thread Priority \t: " + myThread.getPriority());
                // OP: 5 Parent thread priority is inherited to child thread.

        myThread.setPriority(Thread.MAX_PRIORITY);   // setting max priority
        System.out.println("Child Thread Priority \t: " + myThread.getPriority());
        myThread.start();
        for(int i=0; i<10; i++)
            System.out.println("Main Thread");
    }
}
