package src.staticEx;

public class Main {
    public static void main(String[] args) {
        Course mat=new Course("Matematik","MAT101",60);
        Course tr=new Course("Türkçe","TR101",80);
        Course fzk=new Course("Fizik","FZK101",50);

    // 1. yöntem
        int[] notlar={mat.note, tr.note, fzk.note};
        Calculate.calcAverage(notlar);

    // 2. yöntem
        Course[] dersler={mat,tr,fzk};
        Calculate.calcAverage2(dersler);

    }

}