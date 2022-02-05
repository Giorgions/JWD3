package pl.edu.wszib;

public class Cat extends Animal {
    private static String type = "kot";
    private static int counter;

    public Cat() {
        counter++;
    }

    @Override
    String getType() {
        return type;
    }

    @Override
    int getInstanceNumber() {
        return counter;
    }
}
