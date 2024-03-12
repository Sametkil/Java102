package src.exceptionHandling.d1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Program başladı");

        int a=1,b=20,c;
        int [] arr=new int[2];

        try {
            System.out.println("Bölme işlemi");
            System.out.println(b/a);
            System.out.println("Bölme işlemi bitti");
            c= input.nextInt();
            arr[10]=11;
        } catch (ArithmeticException e){
            System.out.println("Aritmatik hata alındı");
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Kesinlikle Yazdır");
        }

        System.out.println("Program bitti");
    }
}
