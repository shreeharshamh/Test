import java.util.stream.IntStream;

class MyThread extends Thread {
    public void run() {
        for(int i : IntStream.range(0,10).toArray()) 
            System.out.println("Child Thread");
        Thread.yield();
    }
}

public class Example7ThreadYieldDemo {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        for(int i : IntStream.range(0, 10).toArray()) 
            System.out.println("Main Thread");
    }
}