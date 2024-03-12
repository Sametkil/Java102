package src.collectionAndMapInterface.treeSet;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

    //    TreeSet<Student> students = new TreeSet<>(new OrderNoteComparator());
        TreeSet<Student> students = new TreeSet<>(new OrderNameComparator().reversed());

        students.add(new Student("Samet",100));
        students.add(new Student("Mehmet",60));
        students.add(new Student("Ahmet",20));
        students.add(new Student("Veli",55));
        students.add(new Student("Veli",55));
        students.add(new Student("Ali",90));

        for (Student stu : students) {
            System.out.println(stu.getName());
        }
    }
}
