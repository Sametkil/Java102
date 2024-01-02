package src.nestedClassesAndGenerics.d4GenericClasses;

public class Main {
    public static void main(String[] args) {
        /*
        String str="1234";
        String str2=null;
    //    String str3;
        NullableString n=new NullableString(str);
        NullableString n2=new NullableString(str2);
    //    NullableString n3=new NullableString(str3);
        n.run();
        n2.run();

        Integer a=null;
        NullableInt n3=new NullableInt(a);
        n3.run();
        Integer a2=1234;
        NullableInt n4=new NullableInt(a2);
        n4.run();
         */
        GenericNullable<Integer> n5=new GenericNullable<>(10);
        GenericNullable<String> n6=new GenericNullable<>("abc");
        n5.run();
        n6.run();



        Integer a=10;
        String b="abcdef";
        Double c=3.14;
    //    String d="abab";

        Test<Integer,String,Double> t=new Test<>(a,b,c);
    //    t.setObj2(d);
        t.showInfo();


    }
}
