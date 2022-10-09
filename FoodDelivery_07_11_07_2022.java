package SubmittedHomework;

import java.util.Scanner;

public class FoodDelivery_07_11_07_2022 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int vegetarianMenu = Integer.parseInt(scanner.nextLine());

        double priceForChicken = chickenMenu * 10.35;
        double priceForFish = fishMenu * 12.40;
        double priceForVegetarian = vegetarianMenu * 8.15;

        double priceAllMenus = priceForVegetarian + priceForFish + priceForChicken;

        double priceDeserts = priceAllMenus * 20 / 100;

        double totalPrice = priceAllMenus + priceDeserts + 2.50;

        System.out.println(totalPrice);
    }
}
