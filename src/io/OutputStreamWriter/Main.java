package src.io.OutputStreamWriter;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
        String data = "GÜŞİ";
        try {
            FileOutputStream fileOutput = new FileOutputStream("output.txt");

            OutputStreamWriter fileWriter = new OutputStreamWriter(fileOutput);
            System.out.println(fileWriter.getEncoding());
            fileWriter.write(data);

            fileWriter.close();
            fileOutput.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
