public class Main {
    static volatile boolean toggle;
    static volatile int count = 5;
    static int sleep = 1000;

    public static void main(String[] args) {

        Thread player = new Thread(new Player(), "Игрок");
        player.start();

        Thread box = new Thread(new Box(), "Коробка");
        box.start();
    }

    static class Player extends Thread {
        @Override
        public void run() {
            while (count > 0) {
                System.out.println(Thread.currentThread().getName() + " включил тумблер");
                toggle = true;
                count--;
                try {
                    Thread.sleep(sleep);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Box extends Thread {
        @Override
        public void run() {
            while (count > 0) {
                if (toggle) {
                    System.out.println(Thread.currentThread().getName() + " выключила тумблер");
                    toggle = false;
                }
            }
        }
    }
}