public class MyTask2 implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println("Task2 is running: " + i+ Thread.currentThread().getName());

            try {
                Thread.sleep(5000); // Sleep for 1 second to simulate work
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
