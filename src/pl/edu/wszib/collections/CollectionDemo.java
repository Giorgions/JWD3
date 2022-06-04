package pl.edu.wszib.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args) {

        List<String> l = Arrays.asList("aaa","bbb","ccc","bbb");
        System.out.println(l);

        System.out.println(Collections.frequency(l,"bbb"));

        Collections.shuffle(l);
        System.out.println(l);
    }
}
