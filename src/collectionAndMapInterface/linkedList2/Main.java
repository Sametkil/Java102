package src.collectionAndMapInterface.linkedList2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.add("Samet");
        q.add("Abc");
        q.offer("def");

        q.remove("def"); //index çalışmıyor

        System.out.println(q.element());

        System.out.println(q.poll());

        System.out.println(q.peek());

        System.out.println("###");

        Iterator<String> itr = q.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
