package src.inheritance;

public class BilgiIslem extends Memur{

    private String gorev;

    public void networkKurulum(){
        System.out.println(this.getName()+" network kuruyor");
    }

    public BilgiIslem(String name, String phone, String mail, String department, String mesai,String gorev) {
        super(name, phone, mail, department, mesai);
        this.gorev=gorev;
    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }
}
