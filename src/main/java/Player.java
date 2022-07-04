class Player extends Thread {
    private final int SLEEP = 1000;
    private int count = 5;

    @Override
    public void run() {
        while (count > 0) {
            System.out.println(Thread.currentThread().getName() + " включил тумблер");
            Box.toggle = true;
            count--;
            try {
                Thread.sleep(SLEEP);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}