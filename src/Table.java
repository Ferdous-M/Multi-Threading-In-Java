class Table {

    synchronized void printTable() {

        for(int i = 1; i <= 5; i++) {
            System.out.println("Hello from ferdous");
            System.out.println("executed by: " + Thread.currentThread().getName());

            try {
                Thread.sleep(500);
            } catch(Exception e) {
                    e.printStackTrace();
            }
            System.out.println("Bye from ferdous");
        }
    }
}