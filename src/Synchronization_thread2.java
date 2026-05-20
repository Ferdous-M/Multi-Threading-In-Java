public class Synchronization_thread2 extends Thread {
    Table t;
    Synchronization_thread2(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(10);
    }

}
