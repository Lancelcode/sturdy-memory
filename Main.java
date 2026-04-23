public class Main {
    public static void main(String[] args) {
        
        MyRunnable myRunnable = new MyRunnable();
        Thread  thread1 = new Thread(myRunnable, "thread1");
        Thread  thread2 = new Thread(myRunnable, "thread2");
        
        thread1.start();
        thread2.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("final counter value: " + myRunnable.getCounter());
    }
    
}
