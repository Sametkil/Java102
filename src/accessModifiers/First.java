package src.accessModifiers;

public class First {
    public String str;
    protected String str2;
    String str3;


    public First(String str) {
        this.str = str;
    }

    private void showStr(){
        System.out.println(this.str);
    }
    void show(){
        this.showStr();
    }
    protected void show2(){
        System.out.println(this.str2);
    }
     void show3(){
        System.out.println(this.str3);
    }
}
