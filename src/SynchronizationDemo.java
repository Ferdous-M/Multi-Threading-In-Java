public class SynchronizationDemo {
    public static void main(String[] args) {

        Table obj = new Table();

        Synchronization_thread1 t1 = new Synchronization_thread1(obj);
        Synchronization_thread2 t2 = new Synchronization_thread2(obj);
        t1.setName("thread t1");
        t2.setName("thread t2");
        t1.start();
        t2.start();
    }
}
