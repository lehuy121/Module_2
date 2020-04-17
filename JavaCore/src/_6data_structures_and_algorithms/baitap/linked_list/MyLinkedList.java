package _6data_structures_and_algorithms.baitap.linked_list;
import java.util.NoSuchElementException;

public class MyLinkedList<E> {
    public class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    private Node head;
    private int numNode = 0;

    public MyLinkedList() {

    }

    public void addFirst(E element) {
       // Node temp = head;
        Node temp = new Node(element);
        temp.next = head;
        head = temp;
        numNode++;
    }

    public void addLast(E element) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(element);
        numNode++;
    }

    public void add(int index, E element) {
        Node temp = head;
        Node holder;

        // cho con tro chay den vi tri index - 1
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNode++;
    }

    public Object get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public E remove(int index) {
        if (index < 0 || index > size()) {
            throw new IllegalArgumentException("Error index: " + index);
        }
        Node temp = head;

        Object data;
        if (index == 0) {
            data = temp.data;
            head = head.next;
            numNode--;
        } else {
            for (int i = 0; i < index - 1 && temp != null; i++) {
                temp = temp.next;
            }
            data = temp.next.data;
            temp.next = temp.next.next;
            numNode--;

        }
        return (E) data;
    }

    public boolean remove(E element) {
        if (head.data.equals(element)) {
            remove(0);
            return true;
        } else {
            Node temp = head;

            while (temp.next != null) {
                if (temp.next.data.equals(element)) {
                    temp.next = temp.next.next;
                    numNode--;
                    return true;
                }
                temp = temp.next;
            }
        }
        return false;

    }

    public MyLinkedList<E> clone() {
        if (numNode == 0) {
            throw new NullPointerException("LinkedList is null");
        }
        MyLinkedList<E> returnLinkedList = new MyLinkedList<>();
        Node temp = head;
        returnLinkedList.addFirst((E) temp.data);
        temp = temp.next;
        while (temp != null) {
            returnLinkedList.addLast((E) temp.data);
            temp = temp.next;
        }
        return returnLinkedList;
    }

    public boolean constrains(E element) {
        Node temp = head;
        while (temp.next != null) {
            if (temp.data.equals(element)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E element) {
        Node temp = head;
        for (int i = 0; i < numNode; i++) {
            if(temp.data.equals(element)){
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    // dang bug
    public E getFirst(){
         Node temp = head;
        if (temp == null)
            throw new NoSuchElementException();
        return (E) temp.data;
    }

    public E getLast(){
        Node temp = head;
        if(head == null) {
            throw new NoSuchElementException();
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        return (E) temp.data;
    }
    public void clear(){
        head = null;
    }

    public int size() {
        return numNode;
    }

}
