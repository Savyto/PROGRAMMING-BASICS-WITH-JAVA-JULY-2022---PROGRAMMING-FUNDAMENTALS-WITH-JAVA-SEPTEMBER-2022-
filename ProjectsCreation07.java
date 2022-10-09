package SubmittedHomework;

import java.util.Scanner;

public class ProjectsCreation07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int projetcsCount = Integer.parseInt(scanner.nextLine());

        int totalTime = projetcsCount * 3;

        System.out.printf("The architect %s will need to complete %d project/s.", name, totalTime, projetcsCount);
    }
}
