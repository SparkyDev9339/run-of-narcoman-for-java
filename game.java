import java.util.Scanner;

public class Game {

    private boolean gameOver;
    private int playerPosition;
    private int narcPosition;

    public Game() {
        gameOver = false;
        playerPosition = 0;
        narcPosition = 10;
    }

    public void play() {
        System.out.println("Добро пожаловать в игру \"Побег от Наркомага\"!");
        System.out.println("Вы находитесь в заброшенном здании и вас преследует Наркомаг.");
        System.out.println("Вам нужно найти выход и убежать, прежде чем он вас догонит.");

        while (!gameOver) {
            System.out.println("Вы находитесь в комнате " + playerPosition);
            System.out.println("Введите команду (go left, go right, exit):");

            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            switch (input) {
                case "go left":
                    playerPosition--;
                    break;
                case "go right":
                    playerPosition++;
                    break;
                case "exit":
                    gameOver = true;
                    System.out.println("Вы вышли из игры.");
                    break;
                default:
                    System.out.println("Неверная команда.");
                    break;
            }

            if (playerPosition == narcPosition) {
                gameOver = true;
                System.out.println("Наркомаг вас догнал!");
            } else if (playerPosition < 0) {
                gameOver = true;
                System.out.println("Вы зашли в тупик, Наркомаг вас догнал!");
            } else if (playerPosition >= 20) {
                gameOver = true;
                System.out.println("Вы нашли выход из здания, поздравляем!");
            }
        }
    }
}
