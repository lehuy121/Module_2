package _6data_structures_and_algorithms.baitap.array_list;

import java.util.ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listIntegers = new MyList<>();
        listIntegers.add(1, 111);
        listIntegers.add(2, 222);
        listIntegers.add(3, 333);
        listIntegers.add(444); // chua dc

        System.out.println("------TEST get(index)-------------");
        System.out.println(listIntegers.get(1));
        System.out.println(listIntegers.get(2));
        System.out.println(listIntegers.get(3));
        System.out.println(listIntegers.get(11));

        System.out.println("---------TEST size()---");
        System.out.println("Size after add: " + listIntegers.size());

        System.out.println("---------TEST remove(index)---");
        System.out.println("Element deleted: " + listIntegers.remove(2));
        System.out.println(listIntegers.get(2));
        System.out.println("Size after remove: : " + listIntegers.size());

        System.out.println("-------TEST clone -----------");
        MyList<Integer> listClone = listIntegers.clone();
        System.out.println(listClone.get(1));
        System.out.println(listClone.get(2));

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

