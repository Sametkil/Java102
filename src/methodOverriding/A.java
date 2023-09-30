package src.methodOverriding;

public class A {
    private String name;

    public void cevap(){
        System.out.println("Ata cevap");
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
