package src.others.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("aaa",10,"aaaa",2010);
        Book b2 = new Book("bbb",20,"bbbb",2011);
        Book b3 = new Book("ccc",50,"cccc",2012);
        Book b4 = new Book("ddd",40,"dddd",2013);
        Book b5 = new Book("eee",50,"eeee",2014);
        Book b6 = new Book("fff",110,"ffff",2015);
        Book b7 = new Book("ggg",70,"gggg",2016);
        Book b8 = new Book("iii",550,"iiii",2017);
        Book b9 = new Book("kkk",90,"kkkk",2018);
        Book b10 = new Book("lll",100,"llll",2019);

        ArrayList<Book> books=new ArrayList<>();
        Book[] booksList = new Book[]{b1,b2,b3,b4,b5,b6,b7,b8,b9,b10};
        for (Book i:booksList) {
            books.add(i);
        }

        Map<String,String> bookMap = books.stream()
                .collect(Collectors
                        .toMap(Book::getName, Book::getAuthorName));

        List<Book> moreThan100 = books.stream()
                .filter(book -> book.getPageNum() > 100)
                .toList();

        bookMap.forEach((name,authorName) ->
                System.out.println("Kitap: " + name + " Yazar :" + authorName));
        System.out.println();
        System.out.println("100 Sayfadan fazla olanlar : ");
        System.out.println();
        moreThan100.stream().forEach(i -> System.out.println(i.getName() + "---" + i.getPageNum()));
    }
}
