package SubmittedHomework;

import java.util.Scanner;

public class RadiansToDegrees0208072022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double rad = Double.parseDouble(scanner.nextLine());
        Double deg = rad * 180 / Math.PI;

        System.out.println(deg);
    }
}
