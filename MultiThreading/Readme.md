## Multithreading
_Executing multiple tasks simultaneously where each task is a separate independent process of the same program._

## ways to define a thread
_1. By extending Thread class_
_2. By implementing Runnable(I)_


## By Extending Thread class

Consider : 
Example1ThreadDemo.java

## Thread Scheduler
_is part of jvm. When there are multiple threads waiting to get a chance_
_for execution, in which order the threads must be executed is decided by_
_thread scheduler._
_Note: We can't expect exact algorithm followed by Thread Scheduler to_
_schedule threads. The order of execution varies from jvm to jvm, like_
_some ThreadScheduler may follow RoundRobin, LIFO etc._

Consider : 
Example2ThreadDemo.java
_in the above example there are two threads, main thread and child thread_
_where Main Thread is responsible to execute child thread_
_the sequence of output generated cannot be determined because every thread_
_it varies from jvm to jvm._

## Thread Overloading run() method
_Overloading run() method is always possible, however, on calling the start()_
_method the default run() method is executed. Overloaded run method must be_
_executed as normal method call._

Consider : 
Example2ThreadOverloading.java

## Difference between thread.start() and thread.run()
_1. thread.start() method perfomes following activities_
_1.1. Register the thread with ThreadScheduler_
_1.2. Perform necessary activities_
_1.3. trigger run() method_
_this process starts a new thread_

_while thread.run() is explicit normal method call. This donesn't_
_create any new thread but Main thread is executing run() method._

_Note: there is no way to start a thread without invoking thread.start() method._

## Overriding start() method
_start() can be overriden but is not recommended as overriding start() method_
_when start() method is overridden, the jvm will first check the parent class_
_if the start() method is available then it will be executed just like a normal_
_method call & will not allow ThreadScheduler to perform mandatory activities like_
_registering thread, triggering run() method etc._

_super.start()_
_this will allow to execute start() method explicitly as well as creates new thread_
_and executes child thread simultaneously_

Consider
Example4StartMethodOverriding.java

## Lifecycle of a Thread

MyThread myThread = new MyThread();
1. New/Born state

myThread.start()    ThreadScheduler register thread

2. Ready/Runnable state

Thread execution

3. Running state

Thread execution completed

4. Dead state

## Thread Priority
Every thread in java has default priority and the same priority is
inherited to the child  
_Thread Priority Constants_
Thread.MIN_PRIORITY = 1
Thread.NORM_PRIORITY = 5
Thread.MAX_PRIORITY = 10

_Note: When there range is beyond above range then there will be_
_RuntimeException : IllegalThreadStateException_


_priority ranges from 1 to 10_
_where 1 is minimum priority_
_and 10 is maximum priority_
we can get and set Thread Priority using following methods
public static final int getPriority()   Thread.currentThread().getPriority() &
public static void setPriority()        Thread.currentThread().setPriority()

Consider
Example5ThreadPriority.java

## By implementing Runnable(I)
thread can be creating by implementing Runnable interface

consider
Example6RunnableDemo.java

