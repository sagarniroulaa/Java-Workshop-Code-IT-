package day14;

/*
    1. Thread ID given by JVM
    2. Thread name
    3. Thread priority
    4. Thread's group name

    Main thread is responsible to spawn all child threads.

    Normally main thread is taken as last thread to finish execution.
 */

public class MainThreadDemo {
    public static void main(String[] args) {

        Thread mainThread = Thread.currentThread();
        System.out.println("Current thread: " + mainThread);
        System.out.println("Thread name: " + mainThread.getName());

        mainThread.setName("MyMainThread");
        System.out.println("After change: " + mainThread.getName());

        for(int i=1;i<=5;i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                System.out.println("Main thread was interrupted!");
            }
        }
    }
}
