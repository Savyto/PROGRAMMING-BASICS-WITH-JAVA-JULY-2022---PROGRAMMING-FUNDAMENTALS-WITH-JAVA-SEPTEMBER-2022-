package SubmittedHomework;

import java.util.Scanner;

public class SumNumbers_03_04_08_2022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (sum < n){
            int currentNum = Integer.parseInt(scanner.nextLine());
            sum = sum + currentNum;
        }
        System.out.println(sum);
    }
}
