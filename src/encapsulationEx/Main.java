package src.encapsulationEx;

public class Main {
    public static void main(String[] args) {
        Book harryPotter=new Book("Harry Potter",150);
        Book lordOfTheRings=new Book("Lord Of The Rings",-100);

        lordOfTheRings.setPageNumber(105);
        System.out.println(lordOfTheRings.getPageNumber());
    }
}
