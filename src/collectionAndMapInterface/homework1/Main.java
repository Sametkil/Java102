package src.collectionAndMapInterface.homework1;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Book b1=new Book("abc",10,"aaaa","10-10-2010");
        Book b2=new Book("def",50,"bbbb","11-10-2010");
        Book b3=new Book("xyz",5,"cccc","12-10-2010");
        Book b4=new Book("klm",20,"dddd","13-10-2010");
        Book b5=new Book("prs",30,"eeee","14-10-2010");

        Set<Book> bookSet = new LinkedHashSet<>();
        bookSet.add(b1);
        bookSet.add(b2);
        bookSet.add(b3);
        bookSet.add(b4);
        bookSet.add(b5);

        System.out.println("Sıralı");
        for (Book b:bookSet){
            System.out.println(b);
        }
        System.out.println("######");

        Set<Book> bookSet2 = new TreeSet(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPage()-o2.getPage();
            }

            @Override
            public boolean equals(Object o) {
                return false;
            }
        });
        bookSet2.add(b1);
        bookSet2.add(b2);
        bookSet2.add(b3);
        bookSet2.add(b4);
        bookSet2.add(b5);

        System.out.println("Sayfa sayısına göre sıralı");
        for (Book b:bookSet2){
            System.out.println(b);
        }

    }
}
