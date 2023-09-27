package src.classRelationship;

public class Main {
    public static void main(String[] args) {
        Student st1=new Student("Samet","Kılıçarslan","123","aa",100);
        Student st2=new Student("ABC","abc","321","bb",-80);
        Student st3=new Student("DEF","cba","451","cc",105);
    //    st2.setNote(80);
    //    System.out.println(st1.getNote());
    //    System.out.println(st2.getNote());
    //    System.out.println(st3.getNote());

        Instructor teacher=new Instructor("Sasas","asas","AAA");
        Course mat=new Course("Mat101","MAT",teacher);
        System.out.println(mat.getInstructor().getName());

    ///    Student[] stu={st1,st2,st3};
    ///    System.out.println("Ortalama: "+mat.calcAverage(stu));

    }
}
