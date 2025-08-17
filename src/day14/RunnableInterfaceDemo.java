package day14;

/*
    1. Implement Runnable Interface.
    -> Firstly, a class must implement Runnable Interface.
    -> Secondly, an instance of a Thread must be defined.
    -> public void run();
    -> run() is same as other methods, difference is that it establishes
    separate entry point of program.

    REM!
    -> We have to use start() method to initiate a call to run() method.

    2. Extend Thread Class.
 */

class MyThread implements Runnable  {
    Thread t;

    MyThread(String name) {
        t = new Thread(this, name);
        System.out.println("Child thread created: " + t);
    }

    @Override
    public void run() {
        for(int i=1;i<=5;i++) {
            System.out.println(t.getName() + ": " + i);
            try {
                Thread.sleep(500);
            } catch(InterruptedException e) {
                System.out.println(t.getName() + " was interrupted!");
            }
        }
    }
}

public class RunnableInterfaceDemo {
    public static void main(String[] args) {
        MyThread childThread = new MyThread("ChildThread");
        childThread.t.start(); // The new thread is started.

        for(int i=1;i<=5;i++) {
            System.out.println("Main thread: " + i);
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                System.out.println("Main thread was interrupted!");
            }
        }

        System.out.println("Main thread is done!");
    }
}
