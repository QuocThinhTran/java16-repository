package thread_flag;

import utils.ThreadException;

public class ThreadFlagExample extends Thread {
    private volatile boolean flag = true;

    @Override
    public void run() {
        try {
            int i = 0;
            while (flag) {
                System.out.println("Working " + i);
                i++;
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }

    public void flag() {
        flag = false;
    }

    public static void main(String[] args) {
        ThreadFlagExample thread = new ThreadFlagExample();
        thread.start();

        ThreadException.ThreadUtils();

        thread.flag();
    }
}
