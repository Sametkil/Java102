package src.exceptionHandling.d2;

import src.exceptionHandling.d3.AgeCheckException;
import java.util.Scanner;

public class Main {

    public static void checkAge(int age) throws AgeCheckException {
        if (age < 18){
            throw new AgeCheckException("Hata yakalandı");
        }
        System.out.println("Yaşı uygundur");
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Yaşınızı girin");
        int age=input.nextInt();
        try {
            checkAge(age);
        } catch (Exception e){
            System.out.println("Yaşı uymadı");
            System.out.println(e.toString());
        }

        System.out.println("Program bitti");
    }
}
