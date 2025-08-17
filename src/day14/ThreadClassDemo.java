package day14;

/*
    Thread vs Runnable Interface:
        class A implements B,C
 */

class MyNewThread extends Thread {
    MyNewThread(String name) {
        super(name);
        System.out.println("Child thread created: " + this);
    }

    public void run() {
        for(int i=1;i<=5;i++) {
            System.out.println(this.getName() +": " + i);
            try {
                Thread.sleep(500);
            } catch(InterruptedException e) {
                System.out.println(getName() + " was interrupted!");
            }
        }
    }
}

public class ThreadClassDemo extends Thread {
    public static void main(String[] args) {
        MyNewThread child = new MyNewThread("ChildThread");
        child.start();

        for(int i=1;i<=5;i++) {
            System.out.println("Main thread: " + i);
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                System.out.println("Main thread was interrupted!");
            }
        }

        System.out.println("Main thread complete!");
    }
}
