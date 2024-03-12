package src.collectionAndMapInterface.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(1);
        list.add(null);
        list.add(3);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(20);
        list.add(null);

    //    System.out.println(list.size());
    //    System.out.println(list.get(0));
    //    System.out.println(list.indexOf(5));
    //    System.out.println(list.lastIndexOf(5));
    //    System.out.println(list.lastIndexOf(2));
    //    list.add(2,15);
    //    list.set(2,15);
    //    System.out.println(list.contains(10));
    //    System.out.println(list.remove(1));

        for (Integer element : list){
            System.out.println(element);
        }




        /*
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
         */




    //    System.out.println(list);


    }
}
