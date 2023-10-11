package src.polymorphism;

public class B extends A{

    @Override
    public void answer() {
        System.out.println(getName()+" BBBB");
    }

    public B(String name) {
        super(name);
    }
}
