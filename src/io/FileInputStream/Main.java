package src.io.FileInputStream;

import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("Test File");
            int i=input.read();
            while (i != -1){
                System.out.print((char)i);
                i= input.read();
            }
            input.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
