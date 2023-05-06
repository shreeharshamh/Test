/*
 * Java program to demonstrate overloading of run() method
 */
class MyThread extends Thread {
    // default run() method scheduled by ThreadScheduler after calling start() method
    public void run() {
        System.out.println("Executing default run() method by ThreadScheduler.");
    }
    // overloading of run method
    public void run(String name) {
        System.out.println("Executing overloaded run() method explicitly called.");
    }
}

public class Example2ThreadOverloading {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();   // executes default run method scheduled by ThreadScheduler
        myThread.run("Harsha"); // overloaded method must be called explicitly.
    }
}
