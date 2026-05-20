public class joinDemo {
    public static void main(String[] args) throws Exception {
        demoThread t1 = new demoThread();
        t1.start();
        t1.join();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread is running: " + i + "  " + Thread.currentThread().getName());
        }
    }
}
