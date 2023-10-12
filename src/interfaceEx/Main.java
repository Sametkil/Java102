package src.interfaceEx;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Tutar giriniz: ");
        double price=input.nextDouble();

        System.out.print("Kart no giriniz: ");
        String cardNumber=input.next();

        System.out.print("Son kullanım tarihi giriniz: ");
        String date=input.next();

        System.out.print("Güvenlik kodu giriniz: ");
        String cvc=input.next();

        System.out.println("1. A bankası");
        System.out.println("2. B bankası");
        System.out.println("3. C bankası");
        System.out.print("Banka seçiniz : ");

        int selectBank=input.nextInt();

        switch (selectBank){
            case 1:
                ABank aPos=new ABank("A Bankası","123123","321321");
                 aPos.connect("127.1.1.1");
                 aPos.payment(price,cardNumber,date,cvc);
                break;
            case 2:
                BBank bPos=new BBank("B Bankası","456456","654654");
                bPos.connect("127.1.1.1");
                bPos.payment(price,cardNumber,date,cvc);
                break;
            default:
                System.out.println("Geçerli banka giriniz.");

        }
    }
}