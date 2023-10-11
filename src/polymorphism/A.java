package src.polymorphism;

public class A {
    private String name;

    public void answer(){
        System.out.println(name+" AAAA");
    }


    public A(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
