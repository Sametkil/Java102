package src.Inheritance;

public class GuvenlikGorevlisi extends Memur{

    private String belge;

    public void nobet(){
        System.out.println(this.getName()+" nöbet tutuyor");
    }

    public GuvenlikGorevlisi(String name, String phone, String mail, String department, String mesai,String belge) {
        super(name, phone, mail, department, mesai);
        this.belge=belge;
    }

    public String getBelge() {
        return belge;
    }

    public void setBelge(String belge) {
        this.belge = belge;
    }
}
