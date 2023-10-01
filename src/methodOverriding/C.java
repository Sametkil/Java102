package src.methodOverriding;

public class C extends B{

    public void cevap(){
        System.out.println("C override");
    }

    public C(String name, String city) {
        super(name, city);
    }
}
