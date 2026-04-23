public class MyRunnable implements Runnable {

    private int counter;

    public int getCounter() {
        return counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            counter++;
        }
    }
}
