package src.methodOverriding;

public class Main {
    public static void main(String[] args) {
        A a1=new A("Hasan");
        a1.cevap();

        B b1=new B("Samet","Ankara");
        b1.cevap();

        C c1=new C("Hanife","Istanbul");
        c1.cevap();
    }
}
