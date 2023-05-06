class MyThread extends Thread {
    public void run() {
        for(int i=0; i<10; i++) System.out.println("Child Thread");
    }
}

public class Example3ThreadSchedulerDemo {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();

        /*
         Whenever thread.start() is triggered, start() method from Thread.class is executed
         during the process, the following activites are performed:
         1. Registering the Thread with ThreadScheduler
         2. Perform mandatory activities
         3. invoke run() method

         So, the ThreadScheduler is responsible to execute the thread but in which order
         the execution will be done varies from jvm to jvm. Some JVM may follow RoundRobin,
         some may follow LIFO etc.
         */
        myThread.start();
        for(int i=0; i<10; i++) System.out.println("Main Thread");

        /* Expected Output may be a mixed output because both the threads are executing
           simultaneously. In which order these threads are executing in real time, cannot
           be determined.
        */
    }
}
