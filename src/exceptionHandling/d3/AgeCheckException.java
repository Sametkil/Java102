package src.exceptionHandling.d3;

public class AgeCheckException extends Exception{
    public AgeCheckException(String message) {
        super(message);
        System.out.println("Yaş hatası alındı!");
    }
}
