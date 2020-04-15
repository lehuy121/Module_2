package _6data_structures_and_algorithms.baitap.array_list;

import java.util.Arrays;

@SuppressWarnings("unchecked")
public class MyList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    public Object[] elements;

    MyList() {
        this.elements = new Object[DEFAULT_CAPACITY];
        size = DEFAULT_CAPACITY;
    }

    MyList(int initCapacity) {
        if (initCapacity < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + initCapacity);
        }
        this.elements = new Object[initCapacity];
        size = initCapacity;
    }

   /* public void add(int index, E element) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }
        ensureCapacity(1);
        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
            elements[index] = element;
        }
        size++;
    }*/
    public void add(int index, E element) {
        ensureCapacity(1);
        System.arraycopy(elements, index, elements, index + 1,
                size - index);
        elements[index] = element;
        size++;
    }

    public E remove(int index) {
        IndexOutOfBound(index);
        E oldValue = (E) elements[index];
        int numMoved = size - index - 1; // element phia sau index can xoa
        if (numMoved > 0) {
            System.arraycopy(elements, index + 1, elements, index, numMoved);
            elements[--size] = null;
        }
        return oldValue;
    }

    public MyList<E> clone() {
        MyList<E> tmp = new MyList<>();
        tmp.elements = Arrays.copyOf(elements, size);
        tmp.size = size;

        return tmp;
    }
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    public int indexOf(Object o) {
        if (o == null) {
            for (int i = 0; i < size; i++)
                if (elements[i] == null)
                    return i;
        } else {
            for (int i = 0; i < size; i++)
                if (o.equals(elements[i]))
                    return i;
        }
        return -1;
    }
    public boolean add(E e) {
        ensureCapacity( 1);
        elements[size++] = e;
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        int newSize = elements.length + minCapacity;
        elements = Arrays.copyOf(elements, newSize);
    }

    public E get(int i) {
        IndexOutOfBound(i);
        return (E) elements[i];
    }
    public void clear() {
        for (int i = 0; i < size; i++)
            elements[i] = null;
        size = 0;
    }

    public int size() {
        return this.size;
    }


    public void IndexOutOfBound(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
    }

}



