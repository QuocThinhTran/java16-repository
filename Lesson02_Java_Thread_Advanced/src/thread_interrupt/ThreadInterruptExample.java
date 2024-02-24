package thread_interrupt;

import utils.ThreadException;

public class ThreadInterruptExample implements Runnable {
    @Override
    public void run() {
        try {
           for (int i = 0; i < 10; i++) {
               System.out.println("Working " + i);
               Thread.sleep(1000);
           }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadInterruptExample());
        thread.start();

        ThreadException.ThreadUtils();

        thread.interrupt();
    }
}
