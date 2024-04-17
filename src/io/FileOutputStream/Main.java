package src.io.FileOutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String yazi = "OutputStream öğreniyorum.\nAaa";
        try {
            File dosya = new File("Test File");
            FileOutputStream output = new FileOutputStream(dosya);
            byte[] yaziByte = yazi.getBytes();
            output.write(yaziByte);
            output.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
