package WorkingOn3;

import java.util.Scanner;

public class Cake_06_11_08_2022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int lenght = Integer.parseInt(scanner.nextLine());
        boolean noMoreCake = false;

        int cakePieces = width * lenght;
        String command = scanner.nextLine();

        while (!command.equals("STOP")) {
            int pieces = Integer.parseInt(command);
            cakePieces -= pieces;

            if (cakePieces <= 0) {
                noMoreCake = true;
                break;
            }
            command = scanner.nextLine();
        }
        if (noMoreCake) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cakePieces));
        } else {
            System.out.printf("%d pieces are left.", cakePieces);
        }
    }
}
