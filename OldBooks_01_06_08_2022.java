package WorkingOn;

import java.util.Scanner;

public class OldBooks_01_06_08_2022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String wantedbook = scanner.nextLine();
        int countBooks = 0;
        boolean isFound = false;

        String command = scanner.nextLine();
        while (!command.equals("No More Books")) {
            if (command.equals(wantedbook)) {
                isFound = true;
                break;
            }

            countBooks++;

            command = scanner.nextLine();
        }
        if (isFound) {
            System.out.printf("You checked %d books and found it.", countBooks);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", countBooks);
        }
    }
}
