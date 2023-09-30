package src.Inheritance;

public class Asistan extends Akademisyen{
    private String ofisSaati;

    public void quizYap(){
        System.out.println(this.getName()+" quiz yaptı");
    }

    public Asistan(String name, String phone, String mail, String bolum, String unvan,String ofisSaati) {
        super(name, phone, mail, bolum, unvan);
        this.ofisSaati=ofisSaati;
    }

    public String getOfisSaati() {
        return ofisSaati;
    }

    public void setOfisSaati(String ofisSaati) {
        this.ofisSaati = ofisSaati;
    }
}
