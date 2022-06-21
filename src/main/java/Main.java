import java.util.concurrent.atomic.AtomicBoolean;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        AtomicBoolean toggle = new AtomicBoolean(false);

        for (int i = 0; i < 6; i++) {
            Thread player = new Thread(new Player(toggle), "Игрок");
            Thread box = new Thread(new Box(toggle), "Коробка");
            player.start();
            player.join();
            box.start();
            box.join();
        }
    }
}