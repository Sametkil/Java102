package src.others.streamAPI;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(25);
        list.add(25);
        list.add(25);
        list.add(12);
        list.add(3);
        list.add(89);
        list.add(25);
        list.add(44);
        list.add(100);
        list.add(7);
        list.add(63);

    //    list.forEach(i -> System.out.println(i));

    //    list.stream().filter(num -> num > 60).forEach(i -> System.out.println(i));

    //    list.stream().distinct().forEach(i -> System.out.println(i));

    //    list.stream().distinct().sorted(Comparator.reverseOrder()).forEach(i -> System.out.println(i));

    //    list.stream().limit(5).forEach(i -> System.out.println(i));

    //    list.stream().skip(3).limit(5).forEach(i -> System.out.println(i));

        /*
        long c = list.stream().skip(3).limit(5).count();
        System.out.println(c);
         */

        /*
        boolean control = list.stream().anyMatch(i -> i==25);
        System.out.println(control);
         */

        /*
        boolean control = list.stream().allMatch(i -> i>1);
        System.out.println(control);
         */

        /*
        boolean control = list.stream().noneMatch(i -> i>0);
        System.out.println(control);
         */

    //    list.stream().map(i ->i*2).forEach(i -> System.out.println(i));
    }
}
