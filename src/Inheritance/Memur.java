package src.Inheritance;

public class Memur extends Calisan{
    private String department;
    private String mesai;


    public void calis(){
        System.out.println(this.getName()+" memur çalışıyor");
    }

    public Memur(String name, String phone, String mail, String department, String mesai) {
        super(name, phone, mail);
        this.department = department;
        this.mesai = mesai;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getMesai() {
        return mesai;
    }

    public void setMesai(String mesai) {
        this.mesai = mesai;
    }
}
