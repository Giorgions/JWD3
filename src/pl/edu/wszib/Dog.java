package pl.edu.wszib;

public class Dog extends Animal {
    private static String type = "pies";
    private static int counter;

    public Dog() {
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
