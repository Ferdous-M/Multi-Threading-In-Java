//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread is running: " + Thread.currentThread().getName());
        MyThread t1 = new MyThread();
        System.out.println("thread is running: " + t1.getName());
        Thread.currentThread().setName("Ferdous-M");
        System.out.println("thread is running: " + Thread.currentThread().getName());

        Thread t2 = new Thread(new MyTask2());

       // t2.start();
    }
}