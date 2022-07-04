public class Main {
    public static void main(String[] args) {
        new Thread(new Player(), "Игрок").start();
        new Thread(new Box(), "Коробка").start();
    }
}