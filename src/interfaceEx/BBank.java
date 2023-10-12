package src.interfaceEx;

public class BBank implements IBank{
    private String name;
    private String terminal_id;
    private String password;


    public BBank(String name, String terminal_id, String password) {
        this.name = name;
        this.terminal_id = terminal_id;
        this.password = password;
    }

    @Override
    public boolean connect(String ipAddress) {
        System.out.println("Kullanıcı ip "+ipAddress);
        System.out.println("Makina ip "+this.hostIpAdress);
        System.out.println(this.name+" Bağlanıldı.");
        return true;
    }

    @Override
    public boolean payment(double price, String cardNumber, String date, String cvc) {
        System.out.println("Bankadan cevap bekleniyor !");
        System.out.println("İşlem başarılı.");
        return true;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTerminal_id() {
        return terminal_id;
    }

    public void setTerminal_id(String terminal_id) {
        this.terminal_id = terminal_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}