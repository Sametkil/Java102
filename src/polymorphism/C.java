package src.polymorphism;

public class C extends A{

    @Override
    public void answer() {
        System.out.println(getName()+" CCCC");
    }

    public C(String name) {
        super(name);
    }
}
