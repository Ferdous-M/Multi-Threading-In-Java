public class MyThread2 extends Thread {
     Thread t1;
     MyThread2(Thread t1) {
         this.t1=t1;
     }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {

        try {
            t1.join();//executed by Mythread2, Mythread2 will wait until t1 is finished
        } catch (Exception e) {
            e.printStackTrace();
        }
            System.out.println("child Thread3 is running: " + i + "  " + Thread.currentThread().getName());
        }

    }
}
