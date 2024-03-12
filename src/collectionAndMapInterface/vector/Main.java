package src.collectionAndMapInterface.vector;

import java.util.Iterator;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Ankara");
        vector.add("Ankara");
        vector.add("Istanbul");
        vector.add("Izmir");

        vector.add(2,"Trabzon");
        System.out.println(vector.contains("Ankara"));

        Iterator<String> itr = vector.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
