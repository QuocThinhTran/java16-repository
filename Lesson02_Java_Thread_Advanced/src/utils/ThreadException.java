package utils;

public class ThreadException {
    private ThreadException() {

    }
    public static void ThreadUtils() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
