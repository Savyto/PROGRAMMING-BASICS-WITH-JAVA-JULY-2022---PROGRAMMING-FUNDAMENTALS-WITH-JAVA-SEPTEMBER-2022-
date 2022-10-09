package SubmittedHomework;

import javax.swing.plaf.synth.SynthStyleFactory;
import java.util.Scanner;

public class NumberInRange_06_19_07_2022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        if (num >= - 100 && num <= 100 && num != 0) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
