package src.collectionAndMapInterface.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("abc");
        list.add("Samet");
        list.add("abc");
        list.add("cba");
        list.add("bac");
        list.add("bca");

        list.remove(2);

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
