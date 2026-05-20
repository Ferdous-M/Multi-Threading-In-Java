public class MyThread extends Thread {

    @Override
    public void run() {
        Thread.yield();

        try
        {
            Thread.sleep(3000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("child Thread is running: " + i + "  "+Thread.currentThread().getName());
        }
    }
}
