public class Synchronization_thread1 extends Thread
{
    Table t;

    Synchronization_thread1(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable();
    }
}
