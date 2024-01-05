package src.nestedClassesAndGenerics.d5GenericMethods;

public class Print {

    public static <T,U> void printArray(T[] arr, U[] arr2){
        for (T i : arr) {
            System.out.println(i);
        }
        for (U i : arr2) {
            System.out.println(i);
        }
    }
}
