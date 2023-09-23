package src.staticEx;

public class Calculate {

    //1. yöntem
    public static void calcAverage(int[] notes){
        double total=0;
        for (int i: notes) {
            total+=i;
        }
        double average=total/ notes.length;
        System.out.println("Ortalama : "+average);
    }


    //2. yöntem
    public static void calcAverage2(Course[] notes){
        double total=0;
        for (Course c: notes) {
            total+=c.note;
        }
        double average=total/ notes.length;
        System.out.println("Ortalama : "+average);
    }
}
