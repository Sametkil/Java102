package src.io.PrintWriter;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        String data = "AAA";
        try {
            PrintWriter writer = new PrintWriter("ccc");
            writer.print(data);
            writer.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
