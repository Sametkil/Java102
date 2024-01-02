package src.nestedClassesAndGenerics.d3AutoboxingUnboxing;

public class Boxing {
    public static void main(String[] args) {
        int a=10;
        // Autoboxing
        Integer b=a;

        // Boxing
        Integer c=Integer.valueOf(a);

        // AutoUnboxing
        int d=c;

        // Unboxing
        int i=c.intValue();

        System.out.println(d);


    }
}
