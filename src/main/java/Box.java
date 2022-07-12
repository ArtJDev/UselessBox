class Box extends Thread {
    private volatile boolean toggle;

    @Override
    public void run() {
        while (true) {
            if (toggle) {
                System.out.println(Thread.currentThread().getName() + " выключила тумблер");
                toggle = false;
            }
        }
    }

    public void setToggle(boolean toggle) {
        this.toggle = toggle;
    }
}