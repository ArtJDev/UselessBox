public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        Player player = new Player(box);

        box.setName("Игрушка");
        box.start();
        player.setName("Игрок");
        player.start();
    }
}