/*
 * Java program to demonstrate overriding of start() method
 * 
 */

class MyThread extends Thread {
    // overriding start() method from (parent) Thread class.
    public void start() {
        // when super.start() is specified then a new thread is created
        // and registered in ThreadScheduler.
        super.start(); 
        System.out.println("executing start method as explicit method call");
    }
    
    // this method will not get a chance of execution.
    public void run() {
        System.out.println("executing run method by ThreadScheduler");
    }
}

public class Example4StartMethodOverriding {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();   // executes start() method from MyThread class explicitly
        // this will not create any new thread. 
        // Note: Overriding start() method is not recommended. because that will not
        // create any new thread but executes as normal method call.
    }
}
