import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final int SIZE = 4;
    private final int[][] board;
    private final Random random;
    private boolean gameOver;

    public Main() {
        board = new int[SIZE][SIZE];
        random = new Random();
        gameOver = false;
        addTile();
        addTile();
    }

    private void addTile() {
        int value = (random.nextInt(2) + 1) * 2;
        int row, col;
        do {
            row = random.nextInt(SIZE);
            col = random.nextInt(SIZE);
        } while (board[row][col] != 0);

        board[row][col] = value;
    }

    private void printBoard() {
        for (int[] row : board) {
            for (int cell : row) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
    }

    private void moveLeft() {
    }

    private void moveRight() {
    }

    private void moveUp() {
    }

    private void moveDown() {
    }

    private boolean isGameOver() {
        return false;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);

        while (!gameOver) {
            printBoard();
            System.out.print("Enter move (W/A/S/D): ");
            String move = scanner.next().toUpperCase();

            switch (move) {
                case "W" -> moveUp();
                case "A" -> moveLeft();
                case "S" -> moveDown();
                case "D" -> moveRight();
                default -> System.out.println("Invalid move. Use W/A/S/D.");
            }

            if (!gameOver) {
                addTile();
                gameOver = isGameOver();
            }
        }

        System.out.println("Game over! Final board:");
        printBoard();
        scanner.close();
    }

    public static void main(String[] args) {
        Main game = new Main();
        game.play();
    }
}
