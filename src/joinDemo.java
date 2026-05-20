public class joinDemo {
    public static void main(String[] args) throws Exception {
        demoThread t1 = new demoThread();
        MyThread2 t2 = new MyThread2(t1);
        t1.start();
        t2.start();
        t2.join();//executed by main thread, main thread will wait until t1 is finished

        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread is running: " + i + "  " + Thread.currentThread().getName());
        }
    }
}
