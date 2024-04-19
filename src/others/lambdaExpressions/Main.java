package src.others.lambdaExpressions;

public class Main {
    public static void main(String[] args) {
        Runnable r1 = () -> System.out.println("r1 sınıfı");
        r1.run();
    }
}
