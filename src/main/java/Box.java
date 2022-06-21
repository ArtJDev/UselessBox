import java.util.concurrent.atomic.AtomicBoolean;

public class Box implements Runnable {
    private final int TIME = 1000;
    private final AtomicBoolean toggle;

    public Box(AtomicBoolean toggle) {
        this.toggle = toggle;
    }

    @Override
    public void run() {
        toggleSwitchOff(toggle);
    }

    private void toggleSwitchOff(AtomicBoolean atomicBoolean) {
        try {
            if (atomicBoolean.get()) {
                Thread.sleep(TIME);
                System.out.println(Thread.currentThread().getName() + " выключила тумблер");
                atomicBoolean.getAndSet(false);
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}