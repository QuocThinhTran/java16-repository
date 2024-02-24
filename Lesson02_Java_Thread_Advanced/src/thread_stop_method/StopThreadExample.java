package thread_stop_method;

import utils.ThreadException;

public class StopThreadExample extends Thread {
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
        StopThreadExample thread = new StopThreadExample();
        thread.start();

        ThreadException.ThreadUtils();

        thread.stop();
    }
}
