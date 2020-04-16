package _6data_structures_and_algorithms.baitap.array_list;

import java.util.Arrays;

public class MyArrayList1<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    public Object[] elements;

    public MyArrayList1() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    MyArrayList1(int initCapacity) {
        if (initCapacity < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + initCapacity);
        }
        this.elements = new Object[initCapacity];
        //size = initCapacity;
    }

    private int size() {
        return this.size;
    }

    private void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    private boolean add(E e) {
        if (elements.length == size) {
            ensureCapacity(1);
        }
        elements[size] = e;
        size++;
        return true;
    }

    private void add(int index, E element) {
        if (index > elements.length) {
            throw new IllegalArgumentException("Index: " + index);
        } else if (elements.length == size) {
            this.ensureCapacity(1);
        }
        if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            for(int i = size + 1; i >=index;i--){
                elements[i] = elements[i -1];
            }
            elements[index] = element;
            size++;
        }
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalArgumentException("minCapacity: " + minCapacity);
        }

    }
}
