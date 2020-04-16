package _6data_structures_and_algorithms.baitap.array_list;

import java.util.ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listIntegers = new MyList<>(5);
        listIntegers.add(0, 111);
        listIntegers.add(1, 222);
        listIntegers.add(2, 333);
        System.out.println("Size after add(index, element): " + listIntegers.size());
        listIntegers.add(444);
        listIntegers.add(555);
        listIntegers.add(666);
        System.out.println("List Integer Number");
        for (int i = 0; i < listIntegers.size(); i++) {
            System.out.println(listIntegers.get(i));
        }

        System.out.println("------TEST get(index)-------------");
        System.out.println(listIntegers.get(0));
        System.out.println(listIntegers.get(1));
        System.out.println(listIntegers.get(2));
        // System.out.println(listIntegers.get(4));

        System.out.println("---------TEST size()---");
        System.out.println("Size after add: " + listIntegers.size());

        System.out.println("---------TEST remove(index)---");
        System.out.println("Element deleted: " + listIntegers.remove(2));
        System.out.println("Get element at index = 2(Expected : 444): " + listIntegers.get(2));
        System.out.println("Size after remove: : " + listIntegers.size());

        System.out.println("-------TEST clone -----------");
        MyList<Integer> listClone = listIntegers.clone();
        System.out.println("List Integer Number After Clone");
        for (int i = 0; i < listClone.size(); i++) {
            System.out.print(listClone.get(i)+" ");
        }
        System.out.println("");

        System.out.println("-------TEST clear() and contains()---------");
        listClone.clear();
        System.out.println("-------contains() exist= true, not exist= false---------");
        System.out.println("Clone list: " + listClone.contains(111));
        System.out.println("Integer list: " + listIntegers.contains(111));

        System.out.println("---------TEST indexOf()---------");
        System.out.println("-------contains() exist= 1, not exist= -1 ---------");
        System.out.println("Clone list: " + listClone.indexOf(111));
        System.out.println("Integer list: " + listIntegers.indexOf(111));

    }
}

