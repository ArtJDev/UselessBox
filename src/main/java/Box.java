class Box extends Thread {
    volatile static boolean toggle;

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