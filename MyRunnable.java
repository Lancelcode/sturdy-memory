public class MyRunnable implements Runnable {

    private int counter;

    public int getCounter() {
        return counter;
    }

    @Override
    public void run() {
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            counter++;
        }
        long elapsedTime = System.nanoTime() - startTime;

        System.out.println(Thread.currentThread().getName() + " Counter incresed up to:  " + elapsedTime/1000000 + " Milliseconds");
    }


}
