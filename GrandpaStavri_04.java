package Exam;

import java.util.Scanner;

public class GrandpaStavri_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());


        double sumLiters = 0;
        double avarageDegree = 0;
        double degreePerLiter = 0;

        for (int i = 1; i <= days; i++) {

                double amountOfRakia = Double.parseDouble(scanner.nextLine());
                double degree = Double.parseDouble(scanner.nextLine());

                sumLiters = amountOfRakia + amountOfRakia;
                degreePerLiter = degreePerLiter + degree * amountOfRakia;
        }
        avarageDegree = degreePerLiter / sumLiters;


        if (avarageDegree < 38.00) {
            System.out.printf("Liter: %.2f%n", Math.abs(sumLiters));
            System.out.printf("Degrees: %.2f%n", Math.abs(avarageDegree));
            System.out.println("Not good, you should baking!");
        } else if (avarageDegree >= 38.00 && Math.abs(avarageDegree) <= 42.00) {
            System.out.printf("Liter: %.2f%n", Math.abs(sumLiters));
            System.out.printf("Degrees: %.2f%n", Math.abs(avarageDegree));
            System.out.println("Super!");
        } else if (avarageDegree > 42.00) {
            System.out.printf("Liter: %.2f%n", Math.abs(sumLiters));
            System.out.printf("Degrees: %.2f%n", Math.abs(avarageDegree));
            System.out.println("Dilution with distilled water!");
        }
    }
}
