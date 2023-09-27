package src.Inheritance;

public class Calisan {
    private String name;
    private String surname;
    private String mail;

    public void giris(){
        System.out.println(this.name+" üniversiteye giriş yaptı");
    }
    public void cikis(){
        System.out.println(this.name+" üniversiteden çıkış yaptı");
    }
    public void yemekhane(){
        System.out.println(this.name+" yemekhane giriş yaptı");
    }

    public Calisan(String name, String surname, String mail) {
        this.name = name;
        this.surname = surname;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
