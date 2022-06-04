package pl.edu.wszib.inner;

import java.util.Arrays;

public class Outer6 {
    public static void main(String[] args) {
        Outer6.localClassInstantiate(args);
    }

    private static void localClassInstantiate(String[] args) {

        int a = 1;
        class LocalClass {
            public String toString() {
                System.out.println(a);
                return "Argumenty metody: " + Arrays.toString(args);
            }
        }

        LocalClass localClassInstantiate = new LocalClass();
        System.out.println(localClassInstantiate);
    }

}
