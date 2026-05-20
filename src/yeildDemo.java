public class yeildDemo {
    public static void main(String[] args) {
        System.out.println("Main thread is running: " + Thread.currentThread().getName());
        MyThread t1 = new MyThread();
        t1.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread is running: " + i + "  "+Thread.currentThread().getName());
        }
    }
}
