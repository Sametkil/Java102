package src.collectionAndMapInterface.priorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

        PriorityQueue<String> q = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        q.add("Samet");
        q.add("Ahmet");
        q.add("Mehmet");
        q.add("Ali");

        for (String s : q){
            System.out.println(s);
        }
    }
}
