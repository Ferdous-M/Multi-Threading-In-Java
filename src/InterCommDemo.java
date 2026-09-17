class ThreadDemo extends Thread {

    public int sum = 0;

    public void run() {

        synchronized (this) {

            System.out.println("Child thread started");

            for (int i = 0; i < 5; i++) {

                sum += i;

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("Child thread sending notification");

            notify();
        }
    }
}

public class InterCommDemo {
    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo();
        t1.start();

        synchronized (t1) {
            try {
                System.out.println("Main thread is waiting for notification");
                t1.wait(); // Main thread waits for notification from t1
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
            }
            System.out.println("Main thread received notification and is resuming execution");
            System.out.println("Main thread sum is: " + t1.sum);
        }
    }
}
