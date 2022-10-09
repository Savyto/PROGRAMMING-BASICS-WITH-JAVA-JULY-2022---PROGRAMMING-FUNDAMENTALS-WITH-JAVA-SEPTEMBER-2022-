package SubmittedHomework;

import java.util.Scanner;

public class BacketballEquipment_08_11_07_2022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tax = Double.parseDouble(scanner.nextLine());

        double sneakersPrice = tax - (tax * 0.40);
        double uniformPrice = sneakersPrice - (sneakersPrice * 0.20);
        double ballPrice = uniformPrice / 4;
        double accessories = ballPrice / 5;

        double totalPrice = tax + uniformPrice + sneakersPrice + ballPrice + accessories;

        System.out.println(totalPrice);
    }
}
