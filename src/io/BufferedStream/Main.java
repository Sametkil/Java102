package src.io.BufferedStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {

        try {
            FileInputStream fileInput = new FileInputStream("Test File");
            BufferedInputStream buffInput = new BufferedInputStream(fileInput);

            int i = buffInput.read();
            while (i != -1){
                System.out.print((char)i);
                i = buffInput.read();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*
        String data = "Java 102";
        try {
            FileOutputStream file = new FileOutputStream("Test File");
            BufferedOutputStream buffFile = new BufferedOutputStream(file);

            byte[] byteArray = data.getBytes();
            buffFile.write(byteArray);
            buffFile.close();
            file.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
         */

    }
}
