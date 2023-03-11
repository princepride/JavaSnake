public class Main {
    public static void main(String[] args) {
        Window window = new Window(Contants.SCREEN_WIDTH, Contants.SCREEN_HEIGHT, Contants.SCREEN_TITLE);

        Thread thread = new Thread(window);
        thread.start();

    }
}
