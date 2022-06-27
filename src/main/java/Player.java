import java.util.concurrent.atomic.AtomicBoolean;

public class Player implements Runnable {
    private final AtomicBoolean toggle;

    public Player(AtomicBoolean toggle) {
        this.toggle = toggle;
    }

    @Override
    public void run() {
        toggleSwitchOn();
    }

    private void toggleSwitchOn() {
        System.out.println(Thread.currentThread().getName() + " включил тумблер");
        toggle.getAndSet(true);
    }
}