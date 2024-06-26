package src.io.SerializationAndObjectStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Audi","A3");

        try {
            FileOutputStream outputFile = new FileOutputStream("araba.txt");
            ObjectOutputStream output = new ObjectOutputStream(outputFile);
            output.writeObject(c1);
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
        Car c1 = new Car("Audi","A3");
        try {
            FileInputStream inputFile = new FileInputStream("araba.txt");
            ObjectInputStream inputStream = new ObjectInputStream(inputFile);
            Car newCar = (Car) inputStream.readObject();
            System.out.println(newCar.getBrand());
            System.out.println(newCar.getModel));

            inputFile.close();
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

         */
    }
}
