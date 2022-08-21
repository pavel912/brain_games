package hexlet.code;

public class App {
    public static void main(String[] args) {
        String command = StartMenu.getCommand();
        switch (command) {
            case "1" -> Cli.greetUser();
            case "2" -> EvenCheckGame.runGame();
            case "0" -> System.exit(0);
            default -> System.out.println("Command was not understood");
        }
    }
}
