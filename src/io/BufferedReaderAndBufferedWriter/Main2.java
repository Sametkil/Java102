package src.io.BufferedReaderAndBufferedWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Main2 {
    public static void main(String[] args) {
        String data = "JAVA";

        File dosya = new File("bbb");
        try {
            FileWriter writeFile = new FileWriter(dosya);
            BufferedWriter writeBuff = new BufferedWriter(writeFile);

            writeBuff.write(data);

            writeBuff.close();
            writeBuff.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
