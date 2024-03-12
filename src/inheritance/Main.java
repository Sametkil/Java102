package src.inheritance;

public class Main {
    public static void main(String[] args) {
        Calisan c1=new Calisan("Sasa","12345","sasamail");

        Akademisyen a1=new Akademisyen("Tata","54321","tatamail","Tarih","Prof");
    //    a1.cikis();
    //    a1.derseGir();

        Calisan m1=new Memur("Ahmet","6789","ahmetmail","eqwwqe","10-15");
    //    m1.yemekhane();
    //   m1.calıs();   çalıştırmaz
        OgretimGorevlisi o1=new OgretimGorevlisi("Pa","9821","pamail","pabölüm","paunvan","231");
        o1.derseGir();
        o1.getKapiNo();
    }
}
