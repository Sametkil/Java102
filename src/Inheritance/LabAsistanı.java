package src.Inheritance;

public class LabAsistanı extends Asistan{

    public void lablaraGir(){
        System.out.println(this.getName()+" labaratuara girdi");
    }

    public LabAsistanı(String name, String phone, String mail, String bolum, String unvan, String ofisSaati) {
        super(name, phone, mail, bolum, unvan, ofisSaati);
    }
}
