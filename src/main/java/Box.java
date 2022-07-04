class Box extends Thread {
    static volatile boolean toggle;

    @Override
    public void run() {
        while (true) {
            if (toggle) {
                System.out.println(Thread.currentThread().getName() + " выключила тумблер");
                toggle = false;
            }
        }
    }
}