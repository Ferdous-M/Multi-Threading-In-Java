//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyTask());

        t1.start();

        Thread t2 = new Thread(new MyTask2());

        t2.start();
    }
}