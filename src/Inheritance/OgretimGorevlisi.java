package src.Inheritance;

public class OgretimGorevlisi extends Akademisyen{
    private String kapiNo;

    public void senatoToplantısı(){
        System.out.println(this.getName()+" senato toplantısına katıldı");
    }public void sinavYap(){
        System.out.println(this.getName()+" sınav yaptı");
    }
    public OgretimGorevlisi(String name, String phone, String mail, String bolum, String unvan,String kapiNo) {
        super(name, phone, mail, bolum, unvan);
        this.kapiNo=kapiNo;
    }

    public String getKapiNo() {
        return kapiNo;
    }

    public void setKapiNo(String kapiNo) {
        this.kapiNo = kapiNo;
    }
}
