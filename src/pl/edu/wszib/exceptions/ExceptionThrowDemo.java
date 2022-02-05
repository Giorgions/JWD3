package pl.edu.wszib.exceptions;

public class ExceptionThrowDemo {
    public static void main(String[] args) {
        ExceptionThrowDemo etd = new ExceptionThrowDemo();

        int hours = -5;
        int numberOfSeconds = 0;

        try {
            numberOfSeconds = etd.getNumberOfSeconds(hours);
        } catch(IllegalArgumentException e) {
            System.out.println("UWAGA! Korekta danych wejściowych!");
            numberOfSeconds = etd.getNumberOfSeconds(hours * -1);
        }

        System.out.println(numberOfSeconds);
    }

    public int getNumberOfSeconds(int hours) {
        if (hours < 0) {
            throw new IllegalArgumentException("Wartość godzin musi być >= 0: " + hours);
        }
        return hours * 60 * 60;
    }
}
