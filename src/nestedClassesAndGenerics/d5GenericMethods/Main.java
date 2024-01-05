package src.nestedClassesAndGenerics.d5GenericMethods;

public class Main {
    public static void main(String[] args) {
        String[] a={"abc","def","gjk","mnp"};
        Integer[] b={1,2,3,4};
        Character[] c={'a','b','c','d'};
        /*
        for (String i : a){
            System.out.println(i);
        }
        for (Integer i : b){
            System.out.println(i);
        }
        for (Character i : c){
            System.out.println(i);
        }
        */
        Print.printArray(a,c);
     //   Print.printArray(b);
     //   Print.printArray(c);

    }
}
