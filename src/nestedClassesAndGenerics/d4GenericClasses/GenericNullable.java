package src.nestedClassesAndGenerics.d4GenericClasses;

public class GenericNullable <T>{
    private final T value;

    public GenericNullable(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public boolean isNull(){
        return this.getValue() == null;
    }
    public void run() {
        if (isNull()) {
            System.out.println("Null değer");
        } else {
            System.out.println(this.getValue());
        }
    }
}
