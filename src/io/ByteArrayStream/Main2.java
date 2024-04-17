package src.io.ByteArrayStream;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) {
        String data = "Java 102 Dersleri";
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        byte[] dataByteArray = data.getBytes();

        try {
            output.write(dataByteArray);
            String newData = output.toString();
            System.out.println(newData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
