public class MyThread extends Thread {

    @Override
    public void run() {
        Thread.yield();
        for (int i = 0; i < 5; i++) {
            System.out.println("child Thread is running: " + i + "  "+Thread.currentThread().getName());
        }
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
