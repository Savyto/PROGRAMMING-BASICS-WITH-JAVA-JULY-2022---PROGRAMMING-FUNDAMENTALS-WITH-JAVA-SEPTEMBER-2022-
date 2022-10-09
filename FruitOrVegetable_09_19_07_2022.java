package SubmittedHomework;

import java.util.Scanner;

public class FruitOrVegetable_09_19_07_2022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String thing = scanner.nextLine();

        switch (thing) {
            case ("banana"):
            case ("apple"):
            case ("kiwi"):
            case ("cherry"):
            case ("lemon"):
            case ("grapes"):
            System.out.println("fruit");
            break;

            case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot":
                System.out.println("vegetable");
                break;
            default:
                System.out.println("unknown");
                break;
        }
    }
}
