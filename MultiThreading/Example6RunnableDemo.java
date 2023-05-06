import java.util.stream.IntStream;

/*
 * Java program to demonstrate creation of thread
 * By implementing Runnable (Interface)
 */

class MyRunnable implements Runnable {
    public void run() {
        for(int i : IntStream.range(0, 10).toArray()) 
            System.out.println("Child Thread");
    }
}

class Example6RunnableDemo {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();

        for(int i : IntStream.range(0, 10).toArray()) 
            System.out.println("Main Thread");
    }
}