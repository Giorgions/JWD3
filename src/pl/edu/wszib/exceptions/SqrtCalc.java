package pl.edu.wszib.exceptions;

import java.util.Scanner;

public class SqrtCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double d = 0;

        try {
            d = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Wystąpił błąd! Podana wartość nie jest liczbą.");
            System.exit(0);
        }

        if (d < 0) {
            throw new IllegalArgumentException("Podano liczbę ujemną!");
        }
        System.out.println(Math.sqrt(d));

    }
}
