package day14;

/*
    Multithreaded Programming:
        -> Programming where two or more parts of a program can run
        concurrently.
        -> Each part is called a thread.
        -> Each thread defines a separate path of execution.

    Two types of multitasking:
    1. Process-based multitasking.
    -> Feature that allows pc to run two or more programs concurrently.
    -> Context switching.

    2. Thread-based multitasking.
    -> Thread is the smallest unit of dispatchable code.
    -> A single program can perform two or more tasks simultaneously.
    -> E.g., In one chrome application,
            One thread renders graphics/UI
            Other may download files in the background
 */

/*
    Single-core CPU vs Multi-core CPU in Multitasking

    E.g. Core 1-> Music Player
    Core 2 -> Runs Word
    Core 3 -> Manages browser
    Core 4 -> Runs background updates
 */

/*
    Threads vs Process

    Processes:
        Each process has its own memory space (heap, stack).
        Context switching:
            Save the state (registers, program counter (PC), etc.) of one process.
            Load the state of another process.
            Switch memory address spaces.
        This is heavy/slow compared to threads.

    Threads:
        Program share memory (heap, stack).
        Switching between threads inside the same process does not require
        switching memory address.

        Context switching is faster and lighter.

    We want to make maximum use of available processing power.

 */

/*
    Java Thread Model:
        Single threaded systems use an approach called
        event loop with polling.

        There is one thread, this runs in infinite loop.

        Java implements Platform Threads (Legacy thread model).
        In platform threads, every thread object is mapped one-to-one with an OS thread.
        OS controls scheduling completely.

        A thread wants to read from a file, the whole OS thread is blocked,
        wasting system resources.

        E.g.,
            Thread t1 -> OS Thread 1
            Thread t2 -> OS Thread 2

        Imagine your server getting 10,000 requests at once, OS will definitely run
        out of threads.

        JVM -> many-to-one.
        Thread t1 > OS Thread 1
        Thread t2 > OS Thread 1

        Thread Priority:
            1. A thread can voluntarily relinquish control.
            2. A thread can be preempted by a higher priority thread.

        In case of equal priority threads, time-slice automatically using
        round-robin fashion.

        Thread Class:
            -> java.lang package.
            -> Create, control and manage threads.
            -> In java, every thread is represented as object of Thread class.

        Constructor:
            Thread(String threadName) -> Extending Thread class
            Thread(Runnable threadOb, String threadName) -> Runnable

        Methods:
        1. getName() / setName()
        2. getPriority()
        3. isAlive()
        4. join()
        5. run()
        6. sleep()
        7. start(): Start a thread by calling its run() method.
 */

public class MultithreadingDemo {
}
