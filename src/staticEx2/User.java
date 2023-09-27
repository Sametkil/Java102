package src.staticEx2;

public class User {
    public String name;
    public static int counter=0;

    static{
        System.out.println("Static kod bloğu");
        //static yazmazsak here çağrıldığında yazdırıyor
        //static ile sadece 1 kere
    }

    public User(String name){
        this.name=name;
        counter++;
    }
}
