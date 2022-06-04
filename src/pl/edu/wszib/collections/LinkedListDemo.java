package pl.edu.wszib.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> elements = new LinkedList<>();
        elements.add("pierwszy");
        elements.add("drugi");
        elements.add("trzeci");
        elements.add("czwarty");

        elements.add(3, "zerowy");

        System.out.println(elements);

        elements.remove("drugi");
        System.out.println(elements);
    }
}
