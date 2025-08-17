package day14;

class MyRunnable implements Runnable {
    Thread t;

    MyRunnable(String name) {
        t = new Thread(this, name);
        System.out.println("Thread created: " + t);
    }

    @Override
    public void run() {
        for(int i=1;i<=5;i++) {
            System.out.println(t.getName() + ": " + i);
            try {
                Thread.sleep(500);
            } catch(InterruptedException e) {
                System.out.println(t.getName() + " was interrupted.");
            }
        }
    }
}

public class CreatingMultipleThreadsDemo {
    public static void main(String[] args) {

        MyRunnable r1 = new MyRunnable("Thread-1");
        MyRunnable r2 = new MyRunnable("Thread-2");
        MyRunnable r3 = new MyRunnable("Thread-3");

        r1.t.start();
        r2.t.start();
        r3.t.start();

        try {
            r1.t.join();
            r2.t.join();
            r3.t.join();
        } catch(InterruptedException e) {
            System.out.println("Main thread interrupted!");
        }

        for(int i=1;i<=5;i++) {
            System.out.println("Main thread: " + i);
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                System.out.println("Main thread was interrupted.");
            }
        }
    }
}
