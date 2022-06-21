import java.util.concurrent.atomic.AtomicBoolean;

public class Player implements Runnable {
    private final int TIME = 2000;
    private final AtomicBoolean toggle;

    public Player(AtomicBoolean toggle) {
        this.toggle = toggle;
    }

    @Override
    public void run() {
        toggleSwitchOn(toggle);
    }

    private void toggleSwitchOn(AtomicBoolean atomicBoolean) {
        try {
            Thread.sleep(TIME);
            System.out.println(Thread.currentThread().getName() + " включил тумблер");
            atomicBoolean.getAndSet(true);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}