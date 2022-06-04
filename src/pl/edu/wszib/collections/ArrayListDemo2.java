package pl.edu.wszib.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo2 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(4);
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(7);
        list.add(9);
        list.add(4444);
        list.add(27);

        System.out.println(list);

        /*for (Integer i : list) {
            if (i % 2 !=0) {
                list.remove(i);
            }
        }*/

        /*for (int k = 0; k < list.size(); k++) {
            Integer i = list.get(k);
            if (i % 2 != 0) {
                list.remove(i);

            }
        }*/

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            if (i % 2 != 0) {
                iterator.remove();
            }
        }

        System.out.println(list);
    }
}
