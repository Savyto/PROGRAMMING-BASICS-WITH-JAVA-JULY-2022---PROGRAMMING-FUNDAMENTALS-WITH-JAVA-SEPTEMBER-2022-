package WorkingOn3;

import java.util.Scanner;

public class OldBooks_01_10_08_2022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String wantedbook = scanner.nextLine();
        boolean foundIt = false;
        int BooksCount = 0;

        String input = scanner.nextLine();
        while (!input.equals("No more books")) {
            if (input.equals(wantedbook)) {
               foundIt = true;
               break;
            }

            BooksCount++;
            input = scanner.nextLine();
        }
        if (foundIt = true) {
            System.out.printf("You checked %d books and found it.", BooksCount);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", BooksCount);

        }
    }
}
