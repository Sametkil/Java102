package src.collectionAndMapInterface.linkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet lSet = new LinkedHashSet<>();
        lSet.add(30);
        lSet.add(10);
        lSet.add(10);
        lSet.add(20);

        Iterator<Integer> itr = lSet.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
