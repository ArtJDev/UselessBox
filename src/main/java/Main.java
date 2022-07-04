public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread player = new Thread(new Player(), "Игрок");
        player.start();

        Thread box = new Thread(new Box(), "Коробка");
        box.start();
    }
}