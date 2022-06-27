import java.util.concurrent.atomic.AtomicBoolean;

public class Box implements Runnable {
    private final AtomicBoolean toggle;

    public Box(AtomicBoolean toggle) {
        this.toggle = toggle;
    }

    @Override
    public void run() {
        toggleSwitchOff();
    }

    private void toggleSwitchOff() {
        if (toggle.get()) {
            System.out.println(Thread.currentThread().getName() + " выключила тумблер");
            toggle.getAndSet(false);
        }
    }
}