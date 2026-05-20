class thradDemo extends Thread {
    public int sum = 0;

    public void run() {
       //public int sum = 0;
        synchronized (this) {
            System.out.println("Thread is in synchronized block");

            for (int i = 0; i < 5; i++) {
                System.out.println("Thread is running: " + i);
                sum = sum + i;
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted");
                }
                System.out.println("child thread giving notification");
                this.notify();
            }
        }
    }
}

public class InterCommDemo {
    public static void main(String[] args) {
        thradDemo t1 = new thradDemo();
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
