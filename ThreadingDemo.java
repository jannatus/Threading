class SharedCounter {
    private int counter = 0;

    public synchronized void increment(String threadName) {
        counter++;
        System.out.println(threadName + " incremented counter to: " + counter);
    }
}

class NumberThread extends Thread {
    private SharedCounter counter;

    public NumberThread(SharedCounter counter) {
        this.counter = counter;
    }

    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("NumberThread: " + i);
                counter.increment("NumberThread");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class SquareThread implements Runnable {
    private SharedCounter counter;

    public SquareThread(SharedCounter counter) {
        this.counter = counter;
    }

    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("SquareThread: " + (i * i));
                counter.increment("SquareThread");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class ThreadingDemo {
    public static void main(String[] args) {
        SharedCounter counter = new SharedCounter();
        NumberThread t1 = new NumberThread(counter);
        Thread t2 = new Thread(new SquareThread(counter));
        t1.start();
        t2.start();
    }
}