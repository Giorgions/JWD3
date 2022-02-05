package pl.edu.wszib.exceptions;

public class AgeTester {
    static void checkAge(int age) {
        if (age < 18) {
            throw new AgeRangeException("UWAGA! Osoba niepełnoletnia!");

        } else {
            System.out.println("Dostęp przyznany...");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(17);
        } catch (Exception e) {
            System.out.println("Naruszenie zasad! " + e.getMessage());
        }
    }
}
