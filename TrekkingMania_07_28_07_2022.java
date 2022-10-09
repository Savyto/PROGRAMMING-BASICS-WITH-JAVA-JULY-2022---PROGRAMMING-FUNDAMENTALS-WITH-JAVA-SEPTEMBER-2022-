package SubmittedHomework;

import java.util.Scanner;

public class TrekkingMania_07_28_07_2022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int totalPeople = 0;

        int musala = 0;
        int monblan = 0;
        int kilimanjaro = 0;
        int k2 = 0;
        int everest = 0;

        for (int i = 0; i < n; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            totalPeople = totalPeople + people;

            if(people <= 5) {
                musala = musala + people;
            }else if(people >= 6 && people <= 12) {
                monblan = monblan + people;
            }else if(people >= 13 && people <= 25) {
                kilimanjaro = kilimanjaro + people;
            }else if(people >= 26 && people <= 40) {
                k2 = k2 + people;
            }else{
                everest = everest + people;
            }
        }
        System.out.printf("%.2f%%%n", musala * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%%n", monblan * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%%n", kilimanjaro * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%%n", k2 * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%%n", everest * 1.0 / totalPeople * 100);
    }
}
