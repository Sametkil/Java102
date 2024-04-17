package src.io.PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        try {
            PrintStream output = new PrintStream("print.txt");
            output.print("123" + 123);
            output.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
