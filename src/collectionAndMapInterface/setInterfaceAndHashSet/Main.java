package src.collectionAndMapInterface.setInterfaceAndHashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hSet=new HashSet<>();
        hSet.add(10);
        hSet.add(20);
        hSet.add(30);
        hSet.add(null);

    //    System.out.println(hSet.size());
    //    System.out.println(hSet.isEmpty());
    //    System.out.println(hSet.contains(20));
        hSet.remove(10);
    //    hSet.clear();


    //    for (Integer sayi : hSet){
    //        System.out.println(sayi);
    //    }

        Iterator<Integer> itr = hSet.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
