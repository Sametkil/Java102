package src.inheritance;

public class Calisan {
    private String name;
    private String phone;
    private String mail;

    public void giris() {
        System.out.println(this.getName() + " üniversiteye giriş yaptı");
    }

    public void cikis() {
        System.out.println(this.getName() + " üniversiteden çıkış yaptı");
    }

    public void yemekhane() {
        System.out.println(this.getName() + " yemekhane giriş yaptı");
    }

    public Calisan(String name, String phone, String mail) {
        this.name = name;
        this.phone = phone;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}