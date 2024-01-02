package src.nestedClassesAndGenerics.d1;

public class Out {
    public int a=5;
    public static int b=20;

    public static class In{
        public static int a=10;

        public static void run(){
            System.out.println("In sınıfına ait run methotu çalıştı");
            int a =1;
            System.out.println(a);
            System.out.println(In.a);
            System.out.println(Out.b);
        }
    }
    public void run(){
    In in=new In();
    in.run();
    }

}
