package src.Inheritance;

public class Akademisyen extends Calisan {
    private String bolum;
    private String unvan;


    public void derseGir(){
        System.out.println(this.getName()+" derse girdi");
    }
    public Akademisyen(String name, String phone, String mail,String bolum,String unvan) {
        super(name, phone, mail);
        this.bolum=bolum;
        this.unvan=unvan;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }
}
