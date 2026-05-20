public class MyThread3 extends Thread {

    @Override
    public void run() {


        try
        {
            Thread.sleep(5000);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("child Thread1 is running: " + i + "  "+Thread.currentThread().getName());
        }
    }
}

