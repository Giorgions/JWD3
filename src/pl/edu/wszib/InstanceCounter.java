package pl.edu.wszib;

public class InstanceCounter {
    private static int numInstances = 0;

    public static int getCount() {
        return numInstances;
    }

    private static void addInstance() {
        numInstances++;
    }

    public InstanceCounter() {
        addInstance();
    }

    public static void main(String[] args) {
        new InstanceCounter();
        new InstanceCounter();
        new InstanceCounter();
        new InstanceCounter();
        for (int i = 0; i < 100; i++) {
            new InstanceCounter();
        }

        System.out.println(InstanceCounter.getCount());
    }
}
