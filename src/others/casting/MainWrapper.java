package src.others.casting;

public class MainWrapper {
    public static void main(String[] args) {
        int a=20;
        System.out.println("Integer : " + a);
        String str = String.valueOf(a);
        System.out.println(str);


        int b = Integer.parseInt(str);
        System.out.println(b);
    }
}
