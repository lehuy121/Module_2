package _6data_structures_and_algorithms.baitap.linked_list;

import java.util.LinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        class Student {
            private int id;
            private String name;

            public Student() {

            }

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
        LinkedList a = new LinkedList();
        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        LinkedList<Student> linkedList = new LinkedList<>();
        Student student1 = new Student(1, "Huy");
        Student student2 = new Student(2, "Hai");
        Student student3 = new Student(3, "Ha");
        Student student4 = new Student(3, "Hoa");
        Student student5 = new Student(3, "Hoa");

        linkedList.addFirst(student1);
        linkedList.addFirst(student2);

//        myLinkedList.addFirst(student1);
//        myLinkedList.addFirst(student2);
//        myLinkedList.addLast(student3);
//        myLinkedList.add(3, student4);
        for (int i = 0; i < linkedList.size(); i++) {
            Student student = (Student) linkedList.get(i);
            System.out.println(student.getName());
        }
        System.out.println("First Element: " + linkedList.getFirst());
       // System.out.println("Last Element: "+myLinkedList.getLast());


        // System.out.println(myLinkedList.constrains(student5));
        //System.out.println(myLinkedList.indexOf(student3));

        // myLinkedList.remove(student3);
        // myLinkedList.remove(3);

//        MyLinkedList<Student> cloneLinkedList = myLinkedList.clone();
//
//        for (int i = 0; i < cloneLinkedList.size(); i++) {
//            Student student = (Student) cloneLinkedList.get(i);
//            System.out.println(student.getName());
//        }


    }

}
