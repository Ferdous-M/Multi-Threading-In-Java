//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread is running: " + Thread.currentThread().getName());
        MyThread t1 = new MyThread();
        System.out.println("thread is running: " + t1.getName());
        Thread.currentThread().setName("Ferdous-M");
        System.out.println("thread is running: " + Thread.currentThread().getName());
        System.out.println("thread priority: " + Thread.currentThread().getPriority());
        System.out.println("t1 priority: " + t1.getPriority());
    }
}