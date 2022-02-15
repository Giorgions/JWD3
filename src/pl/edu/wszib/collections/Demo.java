package pl.edu.wszib.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {

        /*List<Integer> myList = new ArrayList<>();
        myList.add(2);
        myList.add(5);
        myList.add(325);
        System.out.println(myList);

        List<String> mylist = new ArrayList<>();
        mylist.add("Staszek");
        mylist.add("Wiola");
        mylist.add("Kasia");
        mylist.add("Marta");

        for (String name : mylist) {
            System.out.println(name);
        }

        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(i + " - " + mylist.get(i));
        }

        List myList2 = new ArrayList<>();
        myList2.add(1);
        myList2.add(new Object());
        myList2.add("asfasgasf");

        System.out.println(myList.get(0));
        System.out.println(myList.get(1));
        System.out.println(myList.get(2));
        System.out.println();

*/
        List<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(6);
        arr.add(567);
        arr.add(1);

        /*Integer[] arrBis = new Integer[arr.size()];
        arrBis = arr.toArray(arrBis);

        Integer[] arr3 = arr.toArray(new Integer[arr.size()]);

        for (Integer i : arrBis) {
            System.out.println(i);
        }*/

        List<Integer> bigArrList = new ArrayList<>();
        bigArrList.addAll(arr);
        bigArrList.addAll(arr);
        bigArrList.addAll(arr);

        System.out.println(bigArrList);

        System.out.println(bigArrList.lastIndexOf(567));


        /*Iterator<Integer> iterator = arr.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() == 567)
                iterator.remove();
            System.out.println("Liczba " + iterator.next());*/

        /*ListIterator<Integer> ls = arr.listIterator();
        while (ls.hasNext()) {
            System.out.println("Liczba: " + ls.next());
        }
        System.out.println("------------------------------");

        while (ls.hasPrevious()) {
            Integer index = ls.previousIndex();
            Integer value = ls.previous();
            System.out.println("Liczba: " + value + " ma index: " + index);
        }*/



    }
}
