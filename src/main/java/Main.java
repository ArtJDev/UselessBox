import java.util.concurrent.atomic.AtomicBoolean;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        AtomicBoolean toggle = new AtomicBoolean(false);

        Thread player = new Thread(new Player(toggle), "Игрок");
        player.start();

        while (player.isAlive()) {
            Thread box = new Thread(new Box(toggle), "Коробка");
            box.start();
            box.join();
        }
    }
}