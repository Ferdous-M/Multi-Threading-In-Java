class Table {

    public void printTable() {

        for(int i = 1; i <= 5; i++) {

            synchronized (this) {
                System.out.println("executed by: " + Thread.currentThread().getName());
                System.out.println("Hello from ferdous");
            }

            try {
                Thread.sleep(5000);
            } catch(Exception e) {
                    e.printStackTrace();
            }
            System.out.println("Bye from ferdous");
        }
    }
}