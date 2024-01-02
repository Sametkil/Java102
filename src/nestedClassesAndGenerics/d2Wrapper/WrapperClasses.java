package src.nestedClassesAndGenerics.d2Wrapper;

public class WrapperClasses {
    public static void main(String[] args) {
        /*
        Integer a=20;
        String str=a.toString();
        Short s=2;

        System.out.println(str);
         */

        String a="10";
        int b=20;

        System.out.println(Integer.parseInt(a)+b);

        System.out.println(Integer.max(10,20));

        System.out.println(Integer.sum(2,3));
    }

}
