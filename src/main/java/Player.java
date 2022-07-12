class Player extends Thread {
    private static final int SLEEP = 1000;
    private static int count = 5;
    private final Box box;

    Player(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        while (count > 0) {
            System.out.println(Thread.currentThread().getName() + " включил тумблер");
            box.setToggle(true);
            count--;
            try {
                Thread.sleep(SLEEP);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}