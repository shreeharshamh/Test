/*
 * Java program to demonstrate creation of new thread
 * By extending Thread class
 */

class MyThread extends Thread {
    // Thread Body
    public void run() {
        // Job of Thread
        for(int i=0; i<10; i++) {
            System.out.println("Child Thread");
        }
    }
}

public class Example1ThreadDemo {
    public static void main(String[] args) {
        // create an instance of thread object here
        MyThread myThread = new MyThread();
        /* 
            when myThread.start() is executed, the ThreadScheduler registers the thread
            and calls start() method from Thread.class which implicitly calls the run()
            method.
        */ 

        myThread.start();

        /*
            this will not create a new Thread. Here jvm initially checks for run method
            in MyThread.class and if present the jvm will execute the run() method as 
            any other normal method call. 
         */
        myThread.run();

        // These lines are executed by main() method / main thread.       
        for(int i=0; i<10; i++) {
            System.out.println("Main Thread.");
        }
    }
}