package day14;
/*
    For synchronization:
    1. Synchronized methods.
    2. Synchronized blocks.
 */

/*
    New, Runnable, Running, Blocked, Waiting, Timed Waiting, Terminated(Dead)
 */

class Counter {
    private int count = 0;

    public synchronized void printCount(String threadName) {
        synchronized(this) {
            System.out.println("Hello");
        }
        for(int i=1;i<=5;i++) {
            count = i;
            System.out.println(threadName + ": " + count);
            try {
                Thread.sleep(500);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MySynchronizedThread extends Thread {
    Counter counter;

    MySynchronizedThread(Counter counter, String name) {
        super(name);
        this.counter = counter;
    }

    public void run() {
        counter.printCount(this.getName());
    }
}

public class SynchronizationDemo {
    public static void main(String[] args) {
        Counter counter = new Counter();

        MySynchronizedThread t1 = new MySynchronizedThread(counter, "Thread-1");
        MySynchronizedThread t2 = new MySynchronizedThread(counter, "Thread-2");

        t1.start();
        t2.start();
    }
}
