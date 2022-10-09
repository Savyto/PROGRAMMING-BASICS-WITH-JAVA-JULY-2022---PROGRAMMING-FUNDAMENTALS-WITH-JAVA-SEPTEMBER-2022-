package Exam;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fatPercent = Integer.parseInt(scanner.nextLine());
        int proteinPercent = Integer.parseInt(scanner.nextLine());
        int carbohydratePercent = Integer.parseInt(scanner.nextLine());
        int calories = Integer.parseInt(scanner.nextLine());
        int waterPercent = Integer.parseInt(scanner.nextLine());

        double gramsFat = 0;
        double gramsProtein = 0;
        double gramsCarbohydrate = 0;
        double foodWeight = 0;
        double caloriesPerOneGram = 0;
        double calories2 = 0;

        gramsFat = calories * 1.0 * fatPercent / 100 / 9;
        gramsProtein = calories * 1.0 * proteinPercent / 100 / 4;
        gramsCarbohydrate = calories * 1.0 * carbohydratePercent / 100 / 4;

        foodWeight = gramsFat + gramsProtein + gramsCarbohydrate;
        caloriesPerOneGram = calories * 1.0 / foodWeight;

        calories2 = caloriesPerOneGram * (100 - waterPercent) / 100;

        System.out.printf ("%.4f", calories2);
    }
}
