package src.methodOverriding;

public class B extends A{
    private String city;

    @Override
    public void cevap(){
        System.out.println("Overriding yapıldı");
    }

    public B(String name,String city) {
        super(name);
        this.city=city;
    }
}
