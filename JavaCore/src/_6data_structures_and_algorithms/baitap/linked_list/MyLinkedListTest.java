package _6data_structures_and_algorithms.baitap.linked_list;

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
        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        Student student1 = new Student(1, "Huy");
        Student student2 = new Student(2, "Hai");
        Student student3 = new Student(3, "Ha");
        Student student4 = new Student(3, "Hoa");
        Student student5 = new Student(3, "Hoa");
        myLinkedList.addFirst(student1);
        myLinkedList.addFirst(student2);
        myLinkedList.addLast(student3);
        myLinkedList.add(3, student4);
        System.out.println("First Element: "+myLinkedList.getFirst());
        System.out.println("First Element: "+myLinkedList.getLast());


       // System.out.println(myLinkedList.constrains(student5));
        //System.out.println(myLinkedList.indexOf(student3));

        // myLinkedList.remove(student3);
        // myLinkedList.remove(3);

       /* MyLinkedList<Student> cloneLinkedList = myLinkedList.clone();

        for (int i = 0; i < cloneLinkedList.size(); i++) {
            Student student = (Student) cloneLinkedList.get(i);
            System.out.println(student.getName());
        }*/

        /*for (int i = 0; i < myLinkedList.size(); i++) {
            Student student = (Student) myLinkedList.get(i);
            System.out.println(student.getName());
        }*/


    }

}
